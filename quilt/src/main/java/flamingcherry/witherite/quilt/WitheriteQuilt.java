package flamingcherry.witherite.quilt;

import flamingcherry.witherite.common.WitheriteCommon;
import flamingcherry.witherite.common.enchantments.WitheringDefEnch;
import flamingcherry.witherite.common.enchantments.WitheringEnch;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;
import net.fabricmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.quiltmc.qsl.item.group.impl.ItemGroupExtensions;

public class WitheriteQuilt implements ModInitializer {
    public void onInitialize(ModContainer mod) {
        ((ItemGroupExtensions) ItemGroup.BUILDING_BLOCKS).quilt$expandArray();
        WitheriteCommon.WITHERITE_GROUP = new QuiltWitheriteItemGroup(ItemGroup.GROUPS.length - 1, "witherite_plus.general");
        WitheriteCommon.Initialize();
        QuiltBlockRegistry.register();
        QuiltItemRegistry.register();
        QuiltGenRegistry.register();


        Registry.register(Registry.ENCHANTMENT, WitheriteCommon.id("withering"), new WitheringEnch());
        Registry.register(Registry.ENCHANTMENT, WitheriteCommon.id("withering_defense"), new WitheringDefEnch());
    }
}
