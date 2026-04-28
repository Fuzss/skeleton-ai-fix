package fuzs.skeletonaifix.common.init;

import fuzs.puzzleslib.common.api.init.v3.tags.TagFactory;
import fuzs.skeletonaifix.common.SkeletonAIFix;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;

public class ModRegistry {
    static final TagFactory TAGS = TagFactory.make(SkeletonAIFix.MOD_ID);
    public static final TagKey<EntityType<?>> WELL_BEHAVED_SKELETONS_ENTITY_TYPE_TAG = TAGS.registerEntityTypeTag(
            "well_behaved_skeletons");

    public static void bootstrap() {
        // NO-OP
    }
}
