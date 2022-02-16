package flamingcherry.witherite.fabric;

import flamingcherry.witherite.common.WitheriteCommon;
import net.minecraft.util.registry.Registry;

import static flamingcherry.witherite.common.Blocks.*;

public class FabricBlockRegistry {

    public static void register() {
        Registry.register(Registry.BLOCK, WitheriteCommon.id("witherite_deposit"), WITHERITE_DEPOSIT);
        Registry.register(Registry.BLOCK, WitheriteCommon.id("witherite_block"), WITHERITE_BLOCK);
        Registry.register(Registry.BLOCK, WitheriteCommon.id("enriched_witherite_block"), ENR_WITHERITE_BLOCK);
        //Registry.register(Registry.BLOCK, WitheriteCommon.id("witherproof_block"), WITHERPROOF);
    }
}
