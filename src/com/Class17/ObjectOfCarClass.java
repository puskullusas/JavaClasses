package com.Class17;

public class ObjectOfCarClass {

	public static void main(String[] args) {
		//building an Object
		//to create an object the syntax is
		//specify-> ClassName variable = new ClassName();
		Car car1=new Car(); //the class of Car was created in the Car.java
		
		car1.make="BMV";//we can call this  because we created class before
		car1.color= "Black";
		car1.model="i8";
		car1.wheels = 4;
		car1.year = 2019;
		car1.drive();//this method will be executed/called from created before 
					 //in class Car
		car1.accelerate();
		car1.start();
		//print features of the car for ex. Black BMV
		System.out.println("I have " + car1.color + " " + car1.make);
		
		
	}

}
