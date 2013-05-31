package com.thedemgel.regionsexample.configuration;

import org.spout.api.exception.ConfigurationException;
import org.spout.api.util.config.ConfigurationHolderConfiguration;
import org.spout.api.util.config.yaml.YamlConfiguration;
import org.spout.api.util.config.ConfigurationHolder;

import com.thedemgel.regionsexample.RegionsExamplePlugin;

import java.io.File;
import java.util.logging.Level;

/**
 * Provides an example of a class that has a configuration file.
 */
public class RegionsExampleConfiguration extends ConfigurationHolderConfiguration {

	// Messages
	public static final ConfigurationHolder SOME_SETTING = new ConfigurationHolder("SomeSetting", "some", "setting");

	public RegionsExampleConfiguration(File dataFolder) {
		super(new YamlConfiguration(new File(dataFolder, "config.yml")));
	}

	@Override
	public void load() {
		try {
			super.load();
			super.save();
		} catch (ConfigurationException e) {
			RegionsExamplePlugin.getInstance().getLogger().log(Level.WARNING, "Error loading RegionsExample configuration: ", e);
		}
	}

	@Override
	public void save() {
		try {
			super.save();
		} catch (ConfigurationException e) {
			RegionsExamplePlugin.getInstance().getLogger().log(Level.WARNING, "Error saving RegionsExample configuration: ", e);
		}
	}
}
