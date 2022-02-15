package flamingcherry.witherite.forge;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("witherite_plus")
public class WitheriteForge {

    public WitheriteForge() {
        IEventBus events = FMLJavaModLoadingContext.get().getModEventBus();

        ForgeBlockRegistry.BLOCKS.register(events);
        ForgeItemRegistry.ITEMS.register(events);

        MinecraftForge.EVENT_BUS.register(this);
        ForgeItemRegistry.register();
    }
}
