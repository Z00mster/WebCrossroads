package org.simsoft.neural_networks;

import java.util.ArrayList;
import java.util.List;

public class PerceptronNetwork implements NeuralNetwork<Double, Double> {

	private final List<NetworkLayer> networkLayers;
	
	public PerceptronNetwork(int ... numberOfNeuronsInLayers) {
		this.networkLayers = new ArrayList<>();
		
		for (int i = 0; i < numberOfNeuronsInLayers.length; i++) {
			networkLayers.add(new NetworkLayer(numberOfNeuronsInLayers[i]));
		}
	}

	@Override
	public Double calculate(Double i) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}