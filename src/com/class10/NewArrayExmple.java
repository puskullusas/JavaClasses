package com.class10;

public class NewArrayExmple {
	public static void main (String [] args) {
		
		char [] grades = {'A', 'B', 'C', 'D', 'E'};
		System.out.println(grades [2]);//one way of accessing element
		System.out.println("_________________"); //of array
		//another way
		int a=2; // you can access array element by doing this too
		System.out.println(grades [a]);
		System.out.println("__________________");
		
		for (int i=0; i < grades.length; i++) {// we can print all elements of an array
			System.out.println(grades[i]);
		}
		//another way
			//					0		1	2		3		4
		/*String [] animals = {"Cat", "Dog", "Mouse", "Cow", "Snake"}; //size of an array is 4/but 5 elements
		int d = animals.length; // size of an array, how many elements -> we will store it into d!
		for (int y=0; y<d; y++) {//WHY y becomes equal to index of array
		System.out.print(animals[y]+" "); // (" ") empty space between words*/
		
		//i love dogs, when array element equals Dog
		String [] animales = {"Cat", "Dog", "Mouse", "Cow", "Snake"};
		int length = animales.length;
		for (int b=0; b<length; b++) {
			if (animales[b].equals("Dog")) {
				System.out.println("I love dogs");
			}else { // 
			System.out.println(animales[b]);
			}
		}	
	}
}
