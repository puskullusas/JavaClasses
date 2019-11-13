package com.Class17;

public class Car {

	//we DON'T use MAIN MATHOD here!!
		// define attributes/features// if we don't create/sepcify, then
	//we cannot create an object with this features
		String make, model, color;
		int year, wheels, windows;
	// adding behavior/actions in the form of METHODS();
		//method header		//body of the method inside {}
		void drive ()   { //the name of the method, that has it's own body
			System.out.println("Car " + make + " can drive");// make variable -> can change depending
		}
		void start() {
		System.out.println("Car " + model +" can start");	
		}
		void accelerate() {
			System.out.println("Car can accelerate");
		}
		

}
