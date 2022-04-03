package flamingcherry.witherite.common.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.SkeletonEntity;
import net.minecraft.world.World;

public class CorruptSkeletonEntity extends SkeletonEntity {
    public CorruptSkeletonEntity(EntityType<? extends SkeletonEntity> entityType, World world) {
        super(entityType, world);
    }
}
