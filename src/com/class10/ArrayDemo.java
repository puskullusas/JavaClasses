package com.class10;

public class ArrayDemo {
public static void main (String[] args) {
	
	//another way of writing array without stating int[]nums = new int [4]; => nums[0] = 12 etc.
	int[] nums = {12,13,14,15};
	System.out.println(nums.length);// how many numbers of elements are stored in one array
							//0		1		2		3
	String [] bodyparts = {"leg", "arm","finger","nail"};
	System.out.println("Show me your " + bodyparts[2]); //finger
	//bodyparts.length will return an integer
	int bodypartsSize=bodyparts.length;
	System.out.println(bodypartsSize);
	//store score
	int [] score = {80,90,88,70,50};
	// another way would be writing
	//int score1=80;
	//int score2=90;
	//int score3=88; etc
	
	
}
}
