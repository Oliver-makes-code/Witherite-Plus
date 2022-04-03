package flamingcherry.witherite.fabric;

import flamingcherry.witherite.common.Entities;
import flamingcherry.witherite.common.WitheriteCommon;
import net.minecraft.util.registry.Registry;

public class FabricEntityRegistry {
    public static void register() {
        Registry.register(Registry.ENTITY_TYPE, WitheriteCommon.id("corrupt_skeleton"), Entities.corruptSkeletonEntityEntityType);
    }
}
