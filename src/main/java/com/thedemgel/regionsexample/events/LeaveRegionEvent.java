package com.thedemgel.regionsexample.events;

import com.thedemgel.regions.data.Region;
import org.spout.api.entity.Player;
import org.spout.api.event.Event;
import org.spout.api.event.HandlerList;

public class LeaveRegionEvent extends Event {

	private static HandlerList handlers = new HandlerList();
	private Player player;
	private Region region;

	public LeaveRegionEvent(Player player, Region region) {
		this.player = player;
		this.region = region;
		System.out.println("Leaving");
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
