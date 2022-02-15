package flamingcherry.witherite.common;

import flamingcherry.witherite.common.enchantments.WitheringDefEnch;
import flamingcherry.witherite.common.enchantments.WitheringEnch;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class EnchRegistry {
    public static void register () {
        // Register Enchantments
        Registry.register(Registry.ENCHANTMENT, WitheriteCommon.id("withering"), new WitheringEnch());
        Registry.register(Registry.ENCHANTMENT, WitheriteCommon.id("withering_defense"), new WitheringDefEnch());
    }
}
