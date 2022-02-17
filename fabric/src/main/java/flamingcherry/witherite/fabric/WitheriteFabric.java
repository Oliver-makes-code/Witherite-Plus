package flamingcherry.witherite.fabric;

import flamingcherry.witherite.common.Items;
import flamingcherry.witherite.common.WitheriteCommon;
import flamingcherry.witherite.common.enchantments.WitheringDefEnch;
import flamingcherry.witherite.common.enchantments.WitheringEnch;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.tag.TagFactory;
import net.minecraft.util.registry.Registry;

public class WitheriteFabric implements ModInitializer {
    public void onInitialize() {
        WitheriteCommon.WITHERITE_GROUP = FabricItemGroupBuilder.build(
                WitheriteCommon.id("general"), Items.WITHERITE_INGOT::getDefaultStack);
        WitheriteCommon.Initialize();
        FabricBlockRegistry.register();
        FabricItemRegistry.register();
        FabricGenRegistry.register();

        WitheriteCommon.witheriteReplaceables = TagFactory.BLOCK.create(WitheriteCommon.id("witherite_replaceable"));

        Registry.register(Registry.ENCHANTMENT, WitheriteCommon.id("withering"), new WitheringEnch());
        Registry.register(Registry.ENCHANTMENT, WitheriteCommon.id("withering_defense"), new WitheringDefEnch());
    }
}
