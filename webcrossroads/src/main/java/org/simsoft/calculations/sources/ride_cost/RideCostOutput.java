package org.simsoft.calculations.sources.ride_cost;

import org.simsoft.calculations.Output;

public class RideCostOutput implements Output<Double> {
	
	private final double result;
	
	public RideCostOutput(double result) {
		this.result = result;
	}
	
	public Double getResult() {
		return result;
	}
	
}