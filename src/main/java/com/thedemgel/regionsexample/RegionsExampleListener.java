package com.thedemgel.regionsexample;

import org.spout.api.event.EventHandler;
import org.spout.api.event.player.PlayerChatEvent;
import org.spout.api.event.Listener;

/**
 * Provides an example of an event listener class.
 */
public class RegionsExampleListener implements Listener {
	private RegionsExamplePlugin plugin;

	public RegionsExampleListener(RegionsExamplePlugin instance) {
		this.plugin = instance;
	}
	
	@EventHandler
	public void onPlayerChat(PlayerChatEvent event) {
		// Do Something on PlayerChatEvent
	}
}
