package net.stegio.mtwa;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.stegio.mtwa.entity.ModEntities;
import net.stegio.mtwa.entity.client.WoodenSpearProjectileModel;
import net.stegio.mtwa.entity.client.WoodenSpearProjectileRenderer;

public class MTWAClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityModelLayerRegistry.registerModelLayer(WoodenSpearProjectileModel.WOODEN_SPEAR, WoodenSpearProjectileModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.WOODEN_SPEAR, WoodenSpearProjectileRenderer::new);

    }
}
