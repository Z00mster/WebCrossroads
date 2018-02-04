package org.simsoft.neural_networks;

public interface NeuralNetwork<I, O> {

	O calculate(I i);
	
}