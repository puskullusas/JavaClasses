package com.class11;

public class LargestNumber {
	public static void main(String[] args) {

		int[] nums = { -1, 12, 45, 78, -140, 0 };
		int largest = 0;// or you can put nums[0];
		for (int i = 0; i < nums.length; i++) {// nums.length is 6
									// i=0; 0<6; if true goes into if conditional statement
			if (nums[i] > largest) {// nums of i is at index 0 = 12; 12> then value
									// of largest= 0; true, next step down
				largest = nums[i]; // nums if i which is 0 =12 becomes the largest
			}						// iteration happens i=0 + 1=1 now;
		}
		System.out.println("The largest number " + largest);

//2D Arrays

		int[][] num = { { 1, 2, 3 }, { 4, 9, 6}, { 7, 8, 5} };
		int large = 0;
		for (int b = 0; b < num.length; b++) {
			for (int j = 0; j < num[1].length; j++) {
				if (num[b][j] > large) {
				large = num[b][j];
			}
		}
		}
		System.out.println(large);
	System.out.println("_______________________");
	

	
//find the same numbers

	int [] arra= {2,3,6,3,2};
	for(int i = 0; i<arra.length; i++){
		for (int n = i + 1; n < arra.length; n++) {
			if (arra[i] == arra[n]) {
				System.out.println(arra[n]);
			}
		}
	}
	}}
