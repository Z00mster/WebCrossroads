package org.simsoft.neurons.factory;

import org.simsoft.neurons.Neuron;
import org.simsoft.neurons.SimpleNeuron;

public class NeuronFactory {

	private NeuronFactory() {}
	
	public static Neuron newSimpleNeuron() {
		return new SimpleNeuron();
	}
	
}