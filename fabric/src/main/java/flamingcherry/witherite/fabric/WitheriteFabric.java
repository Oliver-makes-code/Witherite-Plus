package flamingcherry.witherite.fabric;

import flamingcherry.witherite.common.WitheriteCommon;
import flamingcherry.witherite.common.enchantments.WitheringDefEnch;
import flamingcherry.witherite.common.enchantments.WitheringEnch;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.registry.Registry;

public class WitheriteFabric implements ModInitializer {
    public void onInitialize() {
        WitheriteCommon.Initialize();
        FabricBlockRegistry.register();
        FabricItemRegistry.register();
        FabricGenRegistry.register();

        Registry.register(Registry.ENCHANTMENT, WitheriteCommon.id("withering"), new WitheringEnch());
        Registry.register(Registry.ENCHANTMENT, WitheriteCommon.id("withering_defense"), new WitheringDefEnch());
    }
}
