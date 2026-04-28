package fuzs.skeletonaifix.fabric;

import fuzs.skeletonaifix.common.SkeletonAIFix;
import fuzs.puzzleslib.common.api.core.v1.ModConstructor;
import net.fabricmc.api.ModInitializer;

public class SkeletonAIFixFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        ModConstructor.construct(SkeletonAIFix.MOD_ID, SkeletonAIFix::new);
    }
}
