package com.thedemgel.regionsexample.events;

import com.thedemgel.regions.data.Region;
import org.spout.api.entity.Player;
import org.spout.api.event.Event;
import org.spout.api.event.HandlerList;

public class EnterRegionEvent extends Event {

	private static HandlerList handlers = new HandlerList();
	private final Player player;
	private final Region region;

	public EnterRegionEvent(final Player enteringPlayer, final Region regionEntering) {
		this.player = enteringPlayer;
		this.region = regionEntering;
	}

	public Player getPlayer() {
		return player;
	}

	public Region getRegion() {
		return region;
	}

	@Override
	public HandlerList getHandlers() {
		return handlers;
	}
	
	public static HandlerList getHandlerList() {
		return handlers;
	}
}
