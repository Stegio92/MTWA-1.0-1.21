package net.stegio.mtwa.entity.client;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.stegio.mtwa.MTWA;
import net.stegio.mtwa.entity.custom.WoodenSpearProjectileEntity;

public class WoodenSpearProjectileModel extends EntityModel<WoodenSpearProjectileEntity> {
    public static final EntityModelLayer WOODEN_SPEAR = new EntityModelLayer(Identifier.of(MTWA.MOD_ID, "wooden_spear"), "main");
    private final ModelPart bb_main;
    public WoodenSpearProjectileModel(ModelPart root) {
        this.bb_main = root.getChild("bb_main");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData bb_main = modelPartData.addChild("bb_main", ModelPartBuilder.create().uv(4, 0).cuboid(-2.0F, -24.0F, -2.0F, 3.0F, 3.0F, 3.0F, new Dilation(0.0F))
                .uv(0, 0).cuboid(-1.0F, -21.0F, -1.0F, 1.0F, 21.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));
        return TexturedModelData.of(modelData, 32, 32);
    }
    @Override
    public void setAngles(WoodenSpearProjectileEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, int color) {
        bb_main.render(matrices, vertexConsumer, light, overlay, color);
    }
}

