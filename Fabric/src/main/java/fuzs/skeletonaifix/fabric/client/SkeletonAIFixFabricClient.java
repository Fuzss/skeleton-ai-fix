package fuzs.skeletonaifix.fabric.client;

import fuzs.skeletonaifix.common.SkeletonAIFix;
import fuzs.skeletonaifix.common.client.SkeletonAIFixClient;
import fuzs.puzzleslib.common.api.client.core.v1.ClientModConstructor;
import net.fabricmc.api.ClientModInitializer;

public class SkeletonAIFixFabricClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ClientModConstructor.construct(SkeletonAIFix.MOD_ID, SkeletonAIFixClient::new);
    }
}
