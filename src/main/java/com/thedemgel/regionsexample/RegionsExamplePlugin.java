package com.thedemgel.regionsexample;

import com.thedemgel.regions.Regions;
import org.spout.api.command.CommandRegistrationsFactory;
import org.spout.api.command.RootCommand;
import org.spout.api.command.annotated.AnnotatedCommandRegistrationFactory;
import org.spout.api.command.annotated.SimpleAnnotatedCommandExecutorFactory;
import org.spout.api.command.annotated.SimpleInjector;
import org.spout.api.plugin.CommonPlugin;

import com.thedemgel.regionsexample.command.RegionsExampleCommands;
import com.thedemgel.regionsexample.configuration.RegionsExampleConfiguration;
import com.thedemgel.regionsexample.features.InRegion;
import com.thedemgel.regionsexample.features.Owner;

/**
 * Defines the main class of the plugin.
 */
public class RegionsExamplePlugin extends CommonPlugin {
	private static RegionsExamplePlugin instance;
	private RegionsExampleConfiguration config;

	@Override
	public void onLoad() {
		setInstance(this);
		config = new RegionsExampleConfiguration(getDataFolder());
		config.load();
		getLogger().info("loaded.");
	}

	@Override
	public void onEnable() {
		Regions.getInstance().registerFeature(this, InRegion.class, new CustomEventParser());
		Regions.getInstance().registerFeature(this, Owner.class);
		// Register Commands
		CommandRegistrationsFactory<Class<?>> commandRegFactory = new AnnotatedCommandRegistrationFactory(getEngine(), new SimpleInjector(this), new SimpleAnnotatedCommandExecutorFactory());
		RootCommand root = getEngine().getRootCommand();
		root.addSubCommands(this, RegionsExampleCommands.class, commandRegFactory);

		// Register Events
		getEngine().getEventManager().registerEvents(new RegionsExampleListener(this), this);

		getLogger().info("enabled.");
	}

	@Override
	public void onDisable() {
		getLogger().info("disabled.");
	}

	private static void setInstance(RegionsExamplePlugin plugin) {
		instance = plugin;
	}

	public static RegionsExamplePlugin getInstance() {
		return instance;
	}

	public RegionsExampleConfiguration getConfig() {
		return config;
	}
}