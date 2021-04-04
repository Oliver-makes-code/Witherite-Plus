package flamingcherry.witherite.items;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class Witherite extends Item {

    public Witherite(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
        playerEntity.playSound(SoundEvents.ENTITY_WITHER_AMBIENT, 10, 10);
        playerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.WITHER, 300));
        return TypedActionResult.success(playerEntity.getStackInHand(hand));
    }
}
