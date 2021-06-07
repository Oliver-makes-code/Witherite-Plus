package flamingcherry.witherite.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class EnrWitheriteIngot extends Item {
    public EnrWitheriteIngot(Settings settings) { super(settings); }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return false;
    }
}
