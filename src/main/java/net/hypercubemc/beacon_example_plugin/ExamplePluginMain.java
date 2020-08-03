package net.hypercubemc.beacon_example_plugin;

import net.fabricmc.api.ModInitializer;
import net.hypercubemc.beacon.BeaconPluginManager;

public class ExamplePluginMain implements ModInitializer {
    @Override
    public void onInitialize() {
        BeaconPluginManager.registerPlugin(new ExamplePluginInitializer());
    }
}
