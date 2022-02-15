package flamingcherry.witherite.common;

import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class Blocks {

    // Blocks
    public static final Block WITHERITE_DEPOSIT = new Block
            (Block.Settings
                    .copy(net.minecraft.block.Blocks.OBSIDIAN)
                    .hardness(40.0f)
                    .resistance(900.0f)
                    .requiresTool()
            );

    public static final Block WITHERITE_BLOCK = new Block
            (Block.Settings
                    .of(Material.METAL)
                    .hardness(20.0f)
                    .resistance(600.0f)
            );
    public static final Block ENR_WITHERITE_BLOCK = new Block
            (Block.Settings
                    .of(Material.METAL)
                    .hardness(55.0f)
                    .resistance(1200.0f)
            );
}
