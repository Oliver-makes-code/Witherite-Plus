package flamingcherry.witherite.common;

import flamingcherry.witherite.common.blocks.WitheriteDepositBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class Blocks {

    // Blocks
    public static final Block WITHERITE_DEPOSIT = new WitheriteDepositBlock(
                Block.Settings
                        .copy(net.minecraft.block.Blocks.OBSIDIAN)
                        .hardness(40.0f)
                        .resistance(900.0f)
                        .requiresTool()
                        .ticksRandomly()
            );

    public static final Block WITHERITE_BLOCK = new Block(
                Block.Settings
                        .of(Material.METAL)
                        .hardness(20.0f)
                        .resistance(600.0f)
            );
    public static final Block ENR_WITHERITE_BLOCK = new Block(
                Block.Settings
                        .of(Material.METAL)
                        .hardness(55.0f)
                        .resistance(1200.0f)
            );

    public static final Block WITHERPROOF = new Block(
                Block.Settings
                        .copy(net.minecraft.block.Blocks.OBSIDIAN)
                        .requiresTool()
                        .hardness(55f)
                        .resistance(12000f)
            );
}
