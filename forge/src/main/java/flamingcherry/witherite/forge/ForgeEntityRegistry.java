package flamingcherry.witherite.forge;

import flamingcherry.witherite.common.Entities;
import flamingcherry.witherite.common.WitheriteCommon;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ForgeEntityRegistry {
    public static DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, WitheriteCommon.MODID);

    public static <I extends EntityType<?>> RegistryObject<I> register(String name, I entity) {
        return ENTITIES.register(WitheriteCommon.id(name).toString(), () -> entity);
    }

    public static void register() {
        register("corrupt_skeleton", Entities.corruptSkeletonEntityEntityType);
    }
}
