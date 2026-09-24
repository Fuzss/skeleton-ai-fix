package fuzs.skeletonaifix.neoforge;

import fuzs.puzzleslib.common.api.core.v1.ModConstructor;
import fuzs.puzzleslib.neoforge.api.data.v3.core.DataProviderBuilder;
import fuzs.skeletonaifix.common.SkeletonAIFix;
import fuzs.skeletonaifix.common.data.tags.ModEntityTypeTagProvider;
import net.neoforged.fml.common.Mod;

@Mod(SkeletonAIFix.MOD_ID)
public class SkeletonAIFixNeoForge {

    public SkeletonAIFixNeoForge() {
        ModConstructor.construct(SkeletonAIFix.MOD_ID, SkeletonAIFix::new);
        DataProviderBuilder.of(SkeletonAIFix.MOD_ID).addProvider(ModEntityTypeTagProvider::new);
    }
}
