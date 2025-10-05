package net.stegio.mtwa;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.entity.Entity;
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
