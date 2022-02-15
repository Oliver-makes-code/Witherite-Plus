package flamingcherry.witherite.forge;

import flamingcherry.witherite.common.WitheriteCommon;
import flamingcherry.witherite.common.enchantments.WitheringDefEnch;
import flamingcherry.witherite.common.enchantments.WitheringEnch;
import net.minecraft.enchantment.Enchantment;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ForgeEnchRegistry {
    public static DeferredRegister<Enchantment> ENCHANTS = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, WitheriteCommon.MODID);

    public static <I extends Enchantment> RegistryObject<I> register(String name, I ench) {
        return ENCHANTS.register(name,() -> ench);
    }

    public static void register() {
        register("withering", new WitheringEnch());
        register("withering_defense", new WitheringDefEnch());
    }
}
