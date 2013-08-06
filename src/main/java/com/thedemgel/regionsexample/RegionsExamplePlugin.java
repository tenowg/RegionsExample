package com.thedemgel.regionsexample;

import com.thedemgel.regions.api.RegionAPI;
import com.thedemgel.regionsexample.command.RegionsExampleCommands;
import com.thedemgel.regionsexample.configuration.RegionsExampleConfiguration;
import com.thedemgel.regionsexample.features.InRegion;
import com.thedemgel.regionsexample.features.Owner;
import org.spout.api.command.annotated.AnnotatedCommandExecutorFactory;
import org.spout.api.plugin.Plugin;

/**
 * Defines the main class of the plugin.
 */
public class RegionsExamplePlugin extends Plugin {
	private static RegionsExamplePlugin instance;
	private RegionsExampleConfiguration config;

	@Override
	public final void onLoad() {
		setInstance(this);
		config = new RegionsExampleConfiguration(getDataFolder());
		config.load();
		getLogger().info("loaded.");
	}

	@Override
	public final void onEnable() {
		RegionAPI.registerFeature(this, InRegion.class, new CustomEventParser());
		RegionAPI.registerFeature(this, Owner.class);

		// Register Commands
                AnnotatedCommandExecutorFactory.create(new RegionsExampleCommands(this));

		// Register Events
		getEngine().getEventManager().registerEvents(new RegionsExampleListener(this), this);

		getLogger().info("enabled.");
	}

	@Override
	public final void onDisable() {
		getLogger().info("disabled.");
	}

	private static void setInstance(final RegionsExamplePlugin plugin) {
		instance = plugin;
	}

	public static RegionsExamplePlugin getInstance() {
		return instance;
	}

	public final RegionsExampleConfiguration getConfig() {
		return config;
	}
}
