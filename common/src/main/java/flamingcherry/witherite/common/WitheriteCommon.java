package flamingcherry.witherite.common;

import net.minecraft.block.Block;
import net.minecraft.item.ItemGroup;
import net.minecraft.tag.Tag;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WitheriteCommon {
    public static final String MODID = "witherite_plus";
    public static Logger logger = LoggerFactory.getLogger(MODID);
    public static ItemGroup WITHERITE_GROUP;
    public static TagKey<Block> witheriteReplaceables = TagKey.of(Registry.BLOCK_KEY, id("witherite_replaceables"));

    public static void Initialize() {
    }

    public static Identifier id(String path) {
        return new Identifier(MODID,path);
    }
}
