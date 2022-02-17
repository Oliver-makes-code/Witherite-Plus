package flamingcherry.witherite.fabric;

import flamingcherry.witherite.common.WitheriteCommon;
import flamingcherry.witherite.common.enchantments.WitheringDefEnch;
import flamingcherry.witherite.common.enchantments.WitheringEnch;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.tag.TagFactory;
import net.fabricmc.fabric.impl.item.group.ItemGroupExtensions;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;

public class WitheriteFabric implements ModInitializer {
    public void onInitialize() {
        ((ItemGroupExtensions) ItemGroup.BUILDING_BLOCKS).fabric_expandArray();
        WitheriteCommon.WITHERITE_GROUP = new FabricWitheriteItemGroup(ItemGroup.GROUPS.length - 1, "witherite.general");
        WitheriteCommon.Initialize();
        FabricBlockRegistry.register();
        FabricItemRegistry.register();
        FabricGenRegistry.register();

        WitheriteCommon.witheriteReplaceables = TagFactory.BLOCK.create(WitheriteCommon.id("witherite_replaceable"));

        Registry.register(Registry.ENCHANTMENT, WitheriteCommon.id("withering"), new WitheringEnch());
        Registry.register(Registry.ENCHANTMENT, WitheriteCommon.id("withering_defense"), new WitheringDefEnch());
    }
}
