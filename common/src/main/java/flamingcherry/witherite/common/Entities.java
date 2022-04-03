package flamingcherry.witherite.common;

import com.google.common.collect.ImmutableSet;
import flamingcherry.witherite.common.entity.CorruptSkeletonEntity;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;

public class Entities {

    public static EntityType<CorruptSkeletonEntity> corruptSkeletonEntityEntityType = new EntityType<>(
            CorruptSkeletonEntity::new,
            SpawnGroup.MONSTER,
            true, true, true, false,
            ImmutableSet.of(Blocks.NETHER_BRICKS),
            EntityDimensions.fixed(1,2),
            16,
            4
    );

    public static void register() {

    }

}
