package com.class10;

public class Arrays {

	public static void main(String[] args) {
//we can hold more than one value in one data type
// collection of similar type of data/homogeneous
//int[]b;// can hold a set of integers (ex. b= 2,4,6,8)
		//1way
		int[] b; // declare an array// or we can use int b[];
		b=new int [4]; //assign the value or initialize
		//2nd way
		int c [] = new int [4];
		c[0]=10;
		c[1]=20;
		c[2]=30;
		c[3]=40;
		System.out.println(c[2]);
		
		//lets create an array that will store classes
		String [] classes= new String [4];
		classes[0]= "Java";
		classes[1]= "SDLC";
		classes[2]= "Manual Testing";
		classes [3]= "GIT";
		// Today we have Java class
		System.out.println("Today we have " + classes[0] + "class");
		
		int[]num = new int[3];
		num[0]=1;
		num[1]=2;
		num[2]=3;
		//to change 1 to 100, reassign value
		num[0]=100; // num[0] is no longer equals 1
			System.out.println(num[0]);//100
				System.out.println(num[0] + num[2]); // 100+3
		
	//int [] grades = {5,7,8,9,5,6,3,2,2};  //in later versions of Java
	//	System.out.println(Arrays.toString(grades)); //you can print all of the elements/call for util.Arrays
															// in output it will be like this [5,7,8,9,5,6,3,2,2]
				
				
	}
}
