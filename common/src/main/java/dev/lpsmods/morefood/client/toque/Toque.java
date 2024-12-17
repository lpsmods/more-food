package dev.lpsmods.morefood.client.toque;

import net.minecraft.client.model.Dilation;
import net.minecraft.client.model.ModelPartBuilder;
import net.minecraft.util.Identifier;

public interface Toque {
    Identifier getTexture();

    ModelPartBuilder getModel(Dilation dilation);
}
