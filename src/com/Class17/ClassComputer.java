package com.Class17;

public class ClassComputer {
String brand, color, name;
int memory, processor,screenSize;

void playGames() { //these codes will not be executed in this ClassComputer
	//program because they are not inside the main method.
	System.out.println("I can play on my " + name);
}
void coding() {
	System.out.println("I can code Phython on my " + name);
}
public static void main (String [] args) {
	//inside the main method we can place the codes we want to be executed
	//assigned variable	//created an object
	ClassComputer comp1 = new ClassComputer ();
	comp1.name = "laptop";
	comp1.brand = "Apple";
	comp1.color = "Silver";
	comp1.memory = 250;
	comp1.screenSize = 15;
	
	
	
	System.out.println("I have a  " + comp1.name + " " + comp1.brand + " color "
	+ comp1.color + " with memory of " + comp1.memory + " GB " +"\n");
	comp1.coding(); // calling the method which will execute it's own code
}
}
