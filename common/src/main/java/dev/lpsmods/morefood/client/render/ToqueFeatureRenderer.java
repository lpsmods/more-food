package dev.lpsmods.morefood.client.render;

import dev.lpsmods.morefood.MoreFoodClient;
import dev.lpsmods.morefood.client.toque.Toque;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelLoader;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;

@Environment(EnvType.CLIENT)
public class ToqueFeatureRenderer<T extends LivingEntity, M extends EntityModel<T>> extends FeatureRenderer<T, M> {
    private final ToqueEntityModel<T> toque;
    public ToqueFeatureRenderer(FeatureRendererContext<T,M> context, EntityModelLoader loader) {
        super(context);
        this.toque = new ToqueEntityModel(loader.getModelPart(MoreFoodClient.TOQUE_LAYER));
    }

    public void render(MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i, T livingEntity, float f, float g, float h, float j, float k, float l) {
        Toque e = MoreFoodClient.getToque(livingEntity.getUuid());
        ItemStack itemStack = livingEntity.getEquippedStack(EquipmentSlot.HEAD);
        if (e != null && !livingEntity.isInvisible() && itemStack.isEmpty()) {
            matrixStack.push();
            matrixStack.scale(1.1F, 1.1F, 1.1F);
            this.getContextModel().copyStateTo(this.toque);
            this.toque.setAngles(livingEntity, f, g, j, k, l);
            VertexConsumer vertexConsumer = vertexConsumerProvider.getBuffer(RenderLayer.getEntityTranslucent(e.getTexture()));
            this.toque.render(matrixStack, vertexConsumer, i, OverlayTexture.DEFAULT_UV, 1.0F, 1.0F, 1.0F, 1.0F);
            matrixStack.pop();
        }
    }
}
