package org.simsoft.calculations.sources.ride_cost;

import org.simsoft.calculations.Input;
import org.simsoft.model.RideCostModel;

public class RideCostInput implements Input {

	private final double gasCost;
	private final double gasConsumption;
	private final double distance;
	
	public RideCostInput(RideCostModel model) {
		this.gasCost = model.getGasCost();
		this.gasConsumption = model.getGasConsumption();
		this.distance = model.getDistance();
	}

	public double getGasCost() {
		return gasCost;
	}

	public double getGasConsumption() {
		return gasConsumption;
	}

	public double getDistance() {
		return distance;
	}
	
}