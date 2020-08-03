package net.hypercubemc.beacon_example_plugin;

import net.hypercubemc.beacon.BeaconPluginInitializer;
import net.hypercubemc.beacon.BeaconPluginInstance;

public class ExamplePluginInitializer implements BeaconPluginInitializer {
    static final String pluginName = "ExamplePlugin";
    static final String pluginVersion = "0.1.0";

    @Override
    public String getPluginName() {
        return pluginName;
    }

    @Override
    public String getPluginVersion() {
        return pluginVersion;
    }

    @Override
    public void onEnable(BeaconPluginInstance beaconPluginInstance) {
        // Your enable code here
    }

    @Override
    public void onDisable(BeaconPluginInstance beaconPluginInstance) {
        // Your disable code here
    }
}
