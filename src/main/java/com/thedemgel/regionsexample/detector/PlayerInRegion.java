package com.thedemgel.regionsexample.detector;

import com.thedemgel.regions.detectors.Detector;

/**
 * PlayerInRegion is a Detector that checks if a Player is in the region.
 */
public class PlayerInRegion extends Detector {

	@Override
	public void execute() {
		System.out.println("Detected");
	}
}
