package dev.lpsmods.morefood.client.render;

import com.google.common.collect.ImmutableList;
import dev.lpsmods.morefood.MoreFoodClient;
import dev.lpsmods.morefood.client.toque.Toque;
import net.minecraft.client.render.entity.model.AnimalModel;
import net.minecraft.entity.LivingEntity;

public class ToqueEntityModel<T extends LivingEntity> extends AnimalModel<T> {
    protected final ModelPart toque;

    public ToqueEntityModel(ModelPart root) {
        this.toque = root.getChild("toque");
    }

    public static TexturedModelData getTexturedModelData() {
        Toque e = MoreFoodClient.getToque(null);
        if (e != null) {
            ModelData modelData = new ModelData();
            ModelPartData modelPartData = modelData.getRoot();
            Dilation dilation = new Dilation(1.0F);
            modelPartData.addChild("toque", e.getModel(dilation), ModelTransform.NONE);
            return TexturedModelData.of(modelData, 32, 32);
        }
        return null;
    }

    @Override
    protected Iterable<ModelPart> getHeadParts() {
        return ImmutableList.of(this.toque);
    }

    @Override
    protected Iterable<ModelPart> getBodyParts() {
        return ImmutableList.of();
    }

    @Override
    public void setAngles(T entity, float f, float g, float h, float i, float j) {
        this.toque.yaw = i * 0.017453292F;
        this.toque.pitch = j * 0.017453292F;

    }
}
