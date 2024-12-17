package dev.lpsmods.morefood;


import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class MoreFood {

    public MoreFood(IEventBus eventBus) {
        Bootstrap.init();
    }
}