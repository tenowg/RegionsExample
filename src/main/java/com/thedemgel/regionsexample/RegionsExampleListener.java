package com.thedemgel.regionsexample;

import org.spout.api.event.EventHandler;
import org.spout.api.event.player.PlayerChatEvent;
import org.spout.api.event.Listener;

/**
 * Provides an example of an event listener class.
 */
public class RegionsExampleListener implements Listener {
	private RegionsExamplePlugin plugin;

	/**
	 *
	 * @param instance RegionExamplePlugin instance.
	 */
	public RegionsExampleListener(final RegionsExamplePlugin instance) {
		this.plugin = instance;
	}

	/**
	 * Executed on PlayerChat while in this region.
	 * @param event PlayerChatEvent event
	 */
	@EventHandler
	public void onPlayerChat(final PlayerChatEvent event) {
		// Do Something on PlayerChatEvent
	}
}
