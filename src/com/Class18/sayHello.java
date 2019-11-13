package com.Class18;

public class sayHello {
/* create a method that will say hello in different lang
 * based on the value that will be passed when user calls a method
 */
	
	void sayHelloDifferentLanguage(String country) { // setting country as parameter
		
		switch (country.toLowerCase()) {
		
		case "usa":
			System.out.println ("Hello");
			break;
		case "russia":
			System.out.println ("Privet");
			break;
		case "paraguay":
			System.out.println ("Hola");
		case "albania":
			System.out.println ("Pershendetje");
			break;
			default:
				System.out.println ("I don't know how to say hello in your language");
		}
	}
	//method to say name and age
	void sayNameAndAge(String name, int age) {// setting name and age parameters
		System.out.println("My name is " + name + " and I am " + age);
	}
	// create method is Snowing
	void isSnowing (boolean isSnowing) {
		if (isSnowing) {
			System.out.println("Stay Home");
		}else {
			System.out.println("Can go outside and play");
		}
	}
	public static void main(String[] args) {
		sayHello obj = new sayHello();
		obj.sayHelloDifferentLanguage("USA");
		obj.sayHelloDifferentLanguage("Russia");
		obj.sayHelloDifferentLanguage("Turkey");
		obj.sayHelloDifferentLanguage("paraguay");
		
		// accessing name and age method
		obj.sayNameAndAge("Jack", 45);
	}

}
