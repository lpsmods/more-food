package dev.lpsmods.morefood.client.toque;

import dev.lpsmods.morefood.MoreFood;
import net.minecraft.client.model.Dilation;
import net.minecraft.client.model.ModelPartBuilder;
import net.minecraft.util.Identifier;

public class Tier1Toque implements Toque {
    public Tier1Toque() {}

    @Override
    public Identifier getTexture() {
        return Identifier.of(MoreFood.MOD_ID, "textures/chef_toque/tier1.png");
    }

    @Override
    public ModelPartBuilder getModel(Dilation dilation) {
        return ModelPartBuilder.create()
                .uv(0, 0).mirrored().cuboid(-4.0F, -12.0F, -4.0F, 8.0F, 2.0F, 8.0F, new Dilation(0.5F)).mirrored(false)
                .uv(0, 10).mirrored().cuboid(-4.0F, -12.0F, -4.0F, 8.0F, 7.0F, 8.0F, new Dilation(0.0F)).mirrored(false);
    }
}
