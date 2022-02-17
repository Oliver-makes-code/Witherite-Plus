package flamingcherry.witherite.forge;

import flamingcherry.witherite.common.WitheriteCommon;
import net.minecraft.tag.BlockTags;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(WitheriteCommon.MODID)
public class WitheriteForge {

    public WitheriteForge() {
        WitheriteCommon.WITHERITE_GROUP = new ForgeWitheriteItemGroup();
        WitheriteCommon.Initialize();

        IEventBus events = FMLJavaModLoadingContext.get().getModEventBus();

        ForgeBlockRegistry.BLOCKS.register(events);
        ForgeItemRegistry.ITEMS.register(events);
        ForgeEnchRegistry.ENCHANTS.register(events);

        MinecraftForge.EVENT_BUS.register(this);
        ForgeBlockRegistry.register();
        ForgeItemRegistry.register();
        ForgeEnchRegistry.register();
    }

    @Mod.EventBusSubscriber(modid = WitheriteCommon.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class CommonEvents {
        @SubscribeEvent
        public static void commonSetup(FMLCommonSetupEvent event) {
            event.enqueueWork(ForgeGenRegistry::registerOre);
        }
    }
}
