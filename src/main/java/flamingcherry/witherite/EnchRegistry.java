package flamingcherry.witherite;

import flamingcherry.witherite.enchantments.WitheringDefEnch;
import flamingcherry.witherite.enchantments.WitheringEnch;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class EnchRegistry {
    private static final String ID = Witherite.MOD_ID;

    public static void register () {
        // Register Enchantments
        Registry.register(Registry.ENCHANTMENT, new Identifier(ID, "withering"), new WitheringEnch());
        Registry.register(Registry.ENCHANTMENT, new Identifier(ID, "withering_defense"), new WitheringDefEnch());
    }
}
