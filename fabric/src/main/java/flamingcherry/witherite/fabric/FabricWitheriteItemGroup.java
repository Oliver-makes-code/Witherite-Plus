package flamingcherry.witherite.fabric;

import flamingcherry.witherite.common.Items;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class FabricWitheriteItemGroup extends ItemGroup {
    public FabricWitheriteItemGroup(int i, String string) {
        super(i, string);
    }

    @Override
    public ItemStack createIcon() {
        return Items.WITHERITE_INGOT.getDefaultStack();
    }
}
