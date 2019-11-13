package com.class2;

public class PerimeterAndArea {
 public static void main (String [] args){
	//1st
	 
	 String name = "addition";
	 int n1 = 56;
	 int n2 = 2;
	 int sum = n1+n2;
	 System.out.println ("The addition of 2 numbers " + n1+ " and " + n2 + " is equal to " 
			  + sum+ "."  );
	 //another way
	 System.out.println ("The " + name + " of 2 numbers " + n1+ " and " + n2 + " is equal to "
	 + sum+ "."  );
	
	 //2nd 
	 
	 double x = 3.9;
	 double square = x*x;
	  System.out.println ("The square of the " + x + " is " + square);
	  
	  // 3. Write a program to print the area and perimeter of a rectangle with width = 5 and height = 8.
	  int width =  5;
	  int height = 8;
	//  int perimeter = (width+width)+(height+height);
	  // another way 
	  int perimeter = 2*width + 2*height; // == 2*(width+height); 
	  System.out.println (perimeter);
	  	  
	int area = width*height;
	
	  System.out.println ("The perimeter of a rectangle with width " + width + " and height "+height
	    + " is equal to " + perimeter + " and the area is " + area);
	  
	  
	 
	 
 }
 
}