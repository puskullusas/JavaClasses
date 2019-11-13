package com.class11;

public class ArrayVovka {
	public static void main(String[] args) {
		int[][] street = { //array of arrays
				//0  1  2  3  4  //5 columns
				{ 6, 7, 8, 9, 5 },  //0
				{ 1, 2, 3, 4, 6 },  //1
				{ 4, 7, 9, 3, 5 }   //2
				};
		//System.out.println(nums.length);// 3 elements
		for (int house = 0; house < street.length; house++) {//start outer loop
			//num.length => number of elements in the Array of arrays, where ea element in 'nums' is array
			for (int appartment = 0; appartment < street[house].length; appartment++) {//start inner loop// 
				//nums[rowsIdx] => one element{x,x,x,x,x} of array 'nums'
				//looks at length of each element in nums, which is an array(of elements)itself
				System.out.print(street[house][appartment]+ " ");
			}//end inner loop
			System.out.println();
		}//end of outer loop
	}
}
	