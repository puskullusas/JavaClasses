package com.InterviewQuestions;

import java.util.Arrays;

public class SecondLargestNumber {
	public static void main (String [] args) {
	int[] array = { 2, 4, 5, 7, 1 };
    int secondLargest = array[0];
    int max = array[0];
    int min = array[0];
    for (int i = 0; i < array.length; i++) {
        if (array[i] > max) {
            secondLargest = max;
            max = array[i];
        }
        if (array[i] < min) {
            min = array[i];
    }
    System.out.println("The largest number is " + max);
    System.out.println("The smallest number is " + min);
    System.out.println("The second largest is " + secondLargest);
    //
    int[] array1 = { 100, -90, 8787, 898, 0, 1, -90, 8787 };
	// 1 easiest way
	Arrays.sort(array1);
	int min1 = array1[0];
	int max1 = array1[array1.length - 1];
	System.out.println(min1);
	System.out.println(max1);
	// 2 way
	int[] myArray = { 100, -90, 8787, 898, 0, 1, -90, 8787 };
	int largest = myArray[0];
	int smallest = myArray[0];
	for (int i1 = 0; i1 < myArray.length; i1++) {
		if (myArray[i1] > largest) {
			largest = myArray[i1];
		}
		if (myArray[i1] < smallest) {
			smallest = myArray[i1];
		}
	}
	System.out.println("The smallest value in the array is " + smallest);
	System.out.println("The largest value in the array is " + largest);
	
	//
	int[] nums = { 100, -90, 8787, 898, 0, 1, -90, 8787};
	int large=nums[0];
	int secondLarge=nums[0];
	
	for(int i1=0; i1<nums.length; i1++) {
		
		if (nums[i1]>large) {
			secondLarge=large;
			large=nums[i1];
		}else if(nums[i1]>secondLarge&& nums[i1]<large ) {
			secondLarge=nums[i1];
		}
	}
	
	System.out.println("The 2 largest value in the array is " + secondLarge);
	System.out.println("The largest value in the array is " + large);


}
}}
