package flamingcherry.witherite.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;

import java.util.Random;

public class WitheriteDepositBlock extends Block {
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
            if (count >= 15) return;
            spread(world,pos,random);
        }
    }

    public void spread(ServerWorld world, BlockPos pos, Random random) {
        BlockState state = world.getBlockState(pos.offset(Direction.random(random)));
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
