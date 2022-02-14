package flamingcherry.witherite;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class Witherite implements ModInitializer {
    public static final String MOD_ID = "witherite_plus";
    public static final ItemGroup WITHERITE_GROUP = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "general"), () -> new ItemStack(ItemRegistry.WITHERITE_INGOT));

    @Override
    public void onInitialize() {
        ItemRegistry.register();
        BlockRegistry.register();
        EnchRegistry.register();
        GenRegistry.register();
        LootTables.register();
        MaterialRegistry.register();
    }
}
