package flamingcherry.witherite.fabric;

import flamingcherry.witherite.common.WitheriteCommon;
import net.fabricmc.api.ModInitializer;

public class WitheriteFabric implements ModInitializer {
    public void onInitialize() {
        WitheriteCommon.Initialize();
        GenRegistry.register();
        LootTables.register();
    }
}
