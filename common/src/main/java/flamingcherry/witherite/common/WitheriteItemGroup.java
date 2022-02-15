package flamingcherry.witherite.common;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class WitheriteItemGroup extends ItemGroup {
    public WitheriteItemGroup() {
        super(ItemGroup.GROUPS.length, WitheriteCommon.id("general").toString().replace(":","."));
    }

    @Override
    public ItemStack createIcon() {
        return Items.WITHERITE_INGOT.getDefaultStack();
    }
}
