package flamingcherry.witherite.forge;

import flamingcherry.witherite.common.Items;
import flamingcherry.witherite.common.WitheriteCommon;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Function;
import java.util.function.Supplier;

import static flamingcherry.witherite.common.Blocks.*;

public class ForgeBlockRegistry {
    public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, WitheriteCommon.MODID);

    public static <I extends Block>RegistryObject<I> register(String name, Supplier<? extends I> block) {
        return BLOCKS.register(name, block);
    }
    public static <I extends Block>RegistryObject<? extends I> register(String name, Supplier<? extends I> block, Function<RegistryObject<? extends I>,Supplier<? extends Item>> item) {
        var ret = register(name, block);
        ForgeItemRegistry.ITEMS.register(name, item.apply(ret));
        return ret;
    }

    public static void register() {
        register("witherite_deposit", () -> WITHERITE_DEPOSIT, obj -> () -> Items.WITHERITE_DEPOSIT_ITEM);
        register("witherite_block", () -> WITHERITE_BLOCK, obj -> () -> Items.WITHERITE_BLOCK_ITEM);
        register("enriched_witherite_block", () -> ENR_WITHERITE_BLOCK, obj -> () -> Items.ENR_WITHERITE_BLOCK_ITEM);
    }
}
