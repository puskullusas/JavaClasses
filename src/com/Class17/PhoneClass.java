package com.Class17;

public class PhoneClass {

String model,model1, model2;
String color, color1, color2;

int memory, memory1, memory2;
 void playGames (){
	System.out.println("Kids can play games on " + model);
 }
 void call () {
	 System.out.println("Can call friends on " + model);
	  }
void emergency() {
	System.out.println("call emergency on " + model);
}

public static void main (String []ar) {
	PhoneClass phone = new PhoneClass();// we can create one object for phone
	//then we have to create different variables in class
	//variable.varName = varValue;
	phone.model = "Iphone";
	phone.color = "Red";
	phone.memory = 62;
	phone.playGames();

	phone.model1 = "Android";
	phone.color1 = "silver";
	phone.memory1 = 16;
	phone.call();
	
	phone.model2 = "Nokia";
	phone.color2 = "Black";
	phone.memory2 = 8;
		phone.emergency();
	
	System.out.print("I have a " + phone.model + " " 
	+ phone.color + " memory of "  + phone.memory + " and it can only "); 
	phone.emergency(); // to print on the same line the statement before should be print
	
}
}
