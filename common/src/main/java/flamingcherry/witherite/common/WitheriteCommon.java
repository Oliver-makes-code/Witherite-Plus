package flamingcherry.witherite.common;

import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;

public class WitheriteCommon {
    public static final String MODID = "witherite_plus";
    public static ItemGroup WITHERITE_GROUP = new WitheriteItemGroup();


    public static void Initialize() {
    }

    public static Identifier id(String path) {
        return new Identifier(MODID,path);
    }
}
