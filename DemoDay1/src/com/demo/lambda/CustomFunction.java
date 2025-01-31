package com.demo.lambda;

@FunctionalInterface
public interface CustomFunction {

	void display(); // it can have max 1 abstract method
	//void display2();
	public static void utility() {
		
	}
	
	public default void defaultFunction() {
		// original functionality
	}
}
