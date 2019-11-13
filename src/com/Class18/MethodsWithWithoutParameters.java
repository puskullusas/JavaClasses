package com.Class18;

public class MethodsWithWithoutParameters {
//void sayHello() { //sayHello (String name)
//	System.out.println("Hello Sash"); // ("Hello " + name);
//}
//public static void main (String [] args) {
//MethodsWithWithoutParameters obj = new MethodsWithWithoutParameters();
//obj.sayHello(); //obj.sayHello ("Asel");

	//SETTING PARAMETERS
	//when we create method we specify parameter
	//when we call method we pass the value / an argument
void sayHello (String name) { //String name is a parameter here
	System.out.println ("Hello " + name);
}
public static void main (String [] args) {
MethodsWithWithoutParameters obj = new MethodsWithWithoutParameters();
obj.sayHello ("Sasha"); //"Sasha" is called an argument
obj.sayHello("Selim");
obj.sayHello ("Azra");
}
}
