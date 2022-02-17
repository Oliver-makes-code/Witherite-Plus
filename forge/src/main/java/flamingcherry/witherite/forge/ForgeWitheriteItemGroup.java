package flamingcherry.witherite.forge;

import flamingcherry.witherite.common.Items;
import flamingcherry.witherite.common.WitheriteCommon;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ForgeWitheriteItemGroup extends ItemGroup {
    public ForgeWitheriteItemGroup() {
        super(ItemGroup.GROUPS.length, WitheriteCommon.id("general").toString().replace(":","."));
    }

    @Override
    public ItemStack createIcon() {
        return Items.WITHERITE_INGOT.getDefaultStack();
    }
}
