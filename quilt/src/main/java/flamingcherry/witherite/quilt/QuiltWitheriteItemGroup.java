package flamingcherry.witherite.quilt;

import flamingcherry.witherite.common.Items;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class QuiltWitheriteItemGroup extends ItemGroup {
    public QuiltWitheriteItemGroup(int i, String string) {
        super(i, string);
    }

    @Override
    public ItemStack createIcon() {
        return Items.WITHERITE_INGOT.getDefaultStack();
    }
}
