package org.simsoft.neural_networks;

import java.util.ArrayList;
import java.util.List;

import org.simsoft.neurons.factory.NeuronFactory;
import org.simsoft.neurons.Neuron;

class NetworkLayer {

	private final List<Neuron> neuronsInLayer;
	
	NetworkLayer(int numberOfNeurons) {
		neuronsInLayer = new ArrayList<>();
		
		for (int i = 0; i < numberOfNeurons; i++) {
			neuronsInLayer.add(NeuronFactory.newSimpleNeuron());
		}
	}
	
}