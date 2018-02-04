package org.simsoft.neurons;

abstract class AbstractNeuron implements Neuron {

	protected double weight;
	protected double error;
	
	protected AbstractNeuron() {}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getError() {
		return error;
	}

	public void setError(double error) {
		this.error = error;
	}
	
}