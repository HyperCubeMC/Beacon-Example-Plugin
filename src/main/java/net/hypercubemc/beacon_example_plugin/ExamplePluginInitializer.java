package net.hypercubemc.beacon_example_plugin;

import net.hypercubemc.beacon.BeaconPluginInitializer;
import net.hypercubemc.beacon.BeaconPluginInstance;

public class ExamplePluginInitializer implements BeaconPluginInitializer {
    @Override
    public void onEnable(BeaconPluginInstance beaconPluginInstance) {
        beaconPluginInstance.getLogger().info("Hello from the Beacon Example Mod!");
        // Your enable code here
    }

    @Override
    public void onDisable(BeaconPluginInstance beaconPluginInstance) {
        beaconPluginInstance.getLogger().info("Goodbye from the Beacon Example Mod!");
        // Your disable code here
    }
}
