package org.simsoft.calculations;

public interface Calculator<I extends Input, O extends Output<?>> {

	O calculate(I input);
	
}