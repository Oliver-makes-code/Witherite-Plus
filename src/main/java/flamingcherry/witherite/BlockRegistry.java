package flamingcherry.witherite;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockRegistry {
    private static final String ID = Witherite.MOD_ID;

    // Blocks
    public static final Block WITHERITE_DEPOSIT = new Block
            (Block.Settings
                    .copy(Blocks.NETHERITE_BLOCK)
                    .hardness(40.0f)
                    .resistance(900.0f)
                    .requiresTool()
            );

    public static final Block WITHERITE_BLOCK = new Block
            (FabricBlockSettings
                    .of(Material.METAL)
                    .hardness(20.0f)
                    .resistance(600.0f)
            );
    public static final Block ENR_WITHERITE_BLOCK = new Block
            (FabricBlockSettings
                    .of(Material.METAL)
                    .hardness(55.0f)
                    .resistance(1200.0f)
                    .luminance(3)
            );

    public static void register() {
        // Register Blocks

        Registry.register(Registry.BLOCK, new Identifier(ID, "witherite_deposit"), WITHERITE_DEPOSIT);
        Registry.register(Registry.BLOCK, new Identifier(ID, "witherite_block"), WITHERITE_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(ID, "enriched_witherite_block"), ENR_WITHERITE_BLOCK);
    }
}
