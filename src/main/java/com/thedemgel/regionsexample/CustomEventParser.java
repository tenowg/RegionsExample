
package com.thedemgel.regionsexample;

import com.thedemgel.regions.parser.EventParser;
import com.thedemgel.regions.parser.WorldPoint;
import com.thedemgel.regions.parser.WorldUUID;
import com.thedemgel.regionsexample.events.EnterRegionEvent;
import com.thedemgel.regionsexample.events.LeaveRegionEvent;


public class CustomEventParser extends EventParser {
	// Custom Events
	public WorldPoint parse(EnterRegionEvent event) {
		WorldPoint wp = new WorldPoint();
		wp.setWorld(event.getPlayer().getWorld());
		wp.setLoc(event.getPlayer().getScene().getPosition());
		return wp;
	}
	
	public WorldUUID parse(LeaveRegionEvent event) {
		WorldUUID wp = new WorldUUID();
		wp.setWorld(event.getPlayer().getWorld());
		wp.setUUID(event.getRegion().getUUID());
		return wp;
	}
}
