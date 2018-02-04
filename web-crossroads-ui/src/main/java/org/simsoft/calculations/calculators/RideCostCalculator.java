package org.simsoft.calculations.calculators;

import org.simsoft.calculations.Calculator;
import org.simsoft.calculations.sources.ride_cost.RideCostInput;
import org.simsoft.calculations.sources.ride_cost.RideCostOutput;

public class RideCostCalculator implements Calculator<RideCostInput, RideCostOutput> {

	public RideCostOutput calculate(RideCostInput input) {
		double gasPricePer100Km = input.getGasConsumption() * input.getGasCost();
		double gasPricePer1Km = gasPricePer100Km / 100;
		double result = gasPricePer1Km * input.getDistance();
		return new RideCostOutput(result);
	}
	
}