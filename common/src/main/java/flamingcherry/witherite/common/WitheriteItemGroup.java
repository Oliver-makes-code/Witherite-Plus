package flamingcherry.witherite.common;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class WitheriteItemGroup extends ItemGroup {
    public WitheriteItemGroup() {
        super(ItemGroup.GROUPS.length - 1, WitheriteCommon.id("general").toString().replace(":","."));
    }

    @Override
    public ItemStack createIcon() {
        return ItemRegistry.WITHERITE_INGOT.getDefaultStack();
    }
}
