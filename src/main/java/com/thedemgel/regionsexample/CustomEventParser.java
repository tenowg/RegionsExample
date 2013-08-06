package com.thedemgel.regionsexample;

import com.thedemgel.regions.parser.EventParser;
import com.thedemgel.regions.parser.WorldPoint;
import com.thedemgel.regions.parser.WorldUUID;
import com.thedemgel.regionsexample.events.EnterRegionEvent;
import com.thedemgel.regionsexample.events.LeaveRegionEvent;


/**
 * A Custom Event parser for Custom Events (or overriding) how events are handled
 * by Regions when Spout fires these events.
 */
public class CustomEventParser extends EventParser {
	// Custom Events
	/**
	 * Returns the point (setLoc) and the World (setWorld) that the event
	 * happened.
	 * @param event
	 * @return WorldPoint (the point of the World the event happens.
	 */
	public WorldPoint parse(final EnterRegionEvent event) {
		WorldPoint wp = new WorldPoint();
		wp.setWorld(event.getPlayer().getWorld());
		wp.setLoc(event.getPlayer().getPhysics().getPosition());
		return wp;
	}

	/**
	 * Returns the UUID (setUUID) of the Region and the World (setWorld)
	 * that the event should happen in.
	 * @param event
	 * @return WorldUUID (the UUID of the Region in the world the event happens)
	 */
	public WorldUUID parse(final LeaveRegionEvent event) {
		WorldUUID wp = new WorldUUID();
		wp.setWorld(event.getPlayer().getWorld());
		wp.setUUID(event.getRegion().getUUID());
		return wp;
	}
}
