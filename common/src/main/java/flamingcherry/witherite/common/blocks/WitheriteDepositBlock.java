package flamingcherry.witherite.common.blocks;

import flamingcherry.witherite.common.WitheriteCommon;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.math.BlockPos;

import java.util.List;
import java.util.Random;

public class WitheriteDepositBlock extends Block {
    List<Block> witheriteReplacables = List.of(new Block[]{
            Blocks.NETHERRACK,
            Blocks.BLACKSTONE,
            Blocks.BASALT
    });

    public WitheriteDepositBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (random.nextDouble()*1000 < 1) {
            var iter = BlockPos.iterate(pos.getX()-7,pos.getY()-7,pos.getZ()-7,pos.getX()+7,pos.getY()+7,pos.getZ()+7);
            int count = 0;
            for (BlockPos pos_: iter)
                if (world.getBlockState(pos_).isOf(this)) count++;
            if (count >= 16) return;
            spread(world,pos,random);
        }
    }

    public void spread(ServerWorld world, BlockPos pos, Random random) {
        int val = (int) Math.floor(random.nextDouble()*6);

        switch (val) {
            case 0 -> pos = pos.down();
            case 1 -> pos = pos.up();
            case 2 -> pos = pos.east();
            case 3 -> pos = pos.west();
            case 4 -> pos = pos.north();
            default ->  pos = pos.south();
        }

        BlockState state = world.getBlockState(pos);

        if (checkBlock(state))
            world.setBlockState(pos, getDefaultState());
    }

    public boolean checkBlock(BlockState state) {
        return BlockTags.BASE_STONE_NETHER.contains(state.getBlock());
    }

    @Override
    public boolean hasRandomTicks(BlockState state) {
        return true;
    }
}
