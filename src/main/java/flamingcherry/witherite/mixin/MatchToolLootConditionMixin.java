package flamingcherry.witherite.mixin;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShearsItem;
import net.minecraft.loot.condition.MatchToolLootCondition;
import net.minecraft.loot.context.LootContext;
import net.minecraft.loot.context.LootContextParameters;
import net.minecraft.predicate.item.ItemPredicate;
import net.minecraft.util.JsonHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static flamingcherry.witherite.Register.SHEARS_ITEM;

@Mixin(MatchToolLootCondition.class)
abstract class MatchToolLootConditionMixin {
    @Shadow
    ItemPredicate predicate;
    @Inject(at = @At("HEAD"), method = "test", cancellable = true)
    public void constructor(LootContext lootContext, CallbackInfoReturnable info) {
        JsonElement jEl = predicate.toJson();
        JsonObject jsonObject = JsonHelper.asObject(jEl, "predicate");
        if (jsonObject.has("item") && JsonHelper.getString(jsonObject, "item").equalsIgnoreCase("minecraft:shears")) {
            ItemStack itemStack = (ItemStack) lootContext.get(LootContextParameters.TOOL);
            if (!itemStack.isEmpty() && (itemStack.getItem() instanceof ShearsItem || itemStack.getItem().isIn(SHEARS_ITEM))) {
                info.setReturnValue(true);
            }
        }
    }
}
