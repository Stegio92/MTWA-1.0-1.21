package net.stegio.mtwa.entity.client;

import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.stegio.mtwa.MTWA;
import net.stegio.mtwa.entity.custom.WoodenSpearProjectileEntity;

public class WoodenSpearProjectileRenderer extends EntityRenderer<WoodenSpearProjectileEntity> {
    protected WoodenSpearProjectileModel model;

    public WoodenSpearProjectileRenderer(EntityRendererFactory.Context ctx) {
        super(ctx);
        this.model = new WoodenSpearProjectileModel(ctx.getPart(WoodenSpearProjectileModel.WOODEN_SPEAR));
    }

    @Override
    public void render(WoodenSpearProjectileEntity entity, float yaw, float tickDelta, MatrixStack matrices,
                       VertexConsumerProvider vertexConsumers, int light) {
        matrices.push();

        VertexConsumer vertexconsumer = ItemRenderer.getDirectItemGlintConsumer(vertexConsumers,
                this.model.getLayer(Identifier.of(MTWA.MOD_ID, "textures/entity/wooden_spear/wooden_spear.png")), false, false);
        this.model.render(matrices, vertexconsumer, light, OverlayTexture.DEFAULT_UV);

        matrices.pop();
        super.render(entity, yaw, tickDelta, matrices, vertexConsumers, light);
    }


    @Override
    public Identifier getTexture(WoodenSpearProjectileEntity entity) {
        return Identifier.of(MTWA.MOD_ID, "textures/entity/wooden_spear/wooden_spear.png");
    }
}
