package org.eclipse.example.calc.internal.operations;

import org.eclipse.example.calc.Operation;

/**
 * Divide operation to trigger binary operations
 */
public class Divide extends AbstractOperation implements Operation {
	
	@Override
	public String getName() {
		return "/";
	}

}