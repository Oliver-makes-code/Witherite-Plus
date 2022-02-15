package flamingcherry.witherite.forge;

import flamingcherry.witherite.common.WitheriteCommon;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.RegistryObject;

import static flamingcherry.witherite.common.Blocks.*;

public class ForgeBlockRegistry {
    public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, WitheriteCommon.MODID);

    public static <I extends Block>RegistryObject<I> register(String name, I block) {
        return BLOCKS.register(name, () -> block);
    }

    public static void register() {
        register("witherite_deposit", WITHERITE_DEPOSIT);
        register("witherite_block", WITHERITE_BLOCK);
        register("enriched_witherite_block", ENR_WITHERITE_BLOCK);
    }
}
