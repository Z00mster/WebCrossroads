package org.simsoft.model;

public class RideCostModel {

	private double gasCost;
	private double gasConsumption;
	private double distance;
	
	private RideCostModel() {}
	
	public static RideCostModel getNewModel() {
		return new RideCostModel();
	}

	public double getGasCost() {
		return gasCost;
	}

	public void setGasCost(double gasCost) {
		this.gasCost = gasCost;
	}

	public double getGasConsumption() {
		return gasConsumption;
	}

	public void setGasConsumption(double gasConsumption) {
		this.gasConsumption = gasConsumption;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}
	
}