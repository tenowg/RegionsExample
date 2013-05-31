package com.thedemgel.regionsexample.detector;

import com.thedemgel.regions.detectors.Detector;

public class PlayerInRegion extends Detector {

	@Override
	public void execute() {
		System.out.println("Detected");
	}
}
