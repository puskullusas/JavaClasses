package com.Class12;

public class Review {

	public static void main(String[] args) {

//3 arrays of 4 elements
		// row col
//		int[][] a = new int[3][4];
//		a[1][2] = 5;
//		// etc.
//		for (int row = 0; row < a.length; row++) {
//			System.out.print("i am at row " + row + " --> ");
//			// array at row whatever index
//			for (int col = 0; col < a[row].length; col++) {
//				int value = a[row][col];
//				System.out.print(value + " ");
//			}
//			System.out.println();
//		}
		int[][] arr = { 
				{ 4, 5, 4, 5 }, 
				{ 3, 4, 3, 4 }, 
				{ 2, 3, 2, 3 } };
		int[] sumOfCol = new int[arr[0].length];
//		int c =0;
//		for (int r = 0; r < arr.length; r++) {
//			sumOfCol[c]+= arr[r][c];
//		}
//		//c++;//1
//		for (int r = 0; r < arr.length; r++) {
//			sumOfCol[c]+=arr[r][c];
//		} 
		
		for (int c=0; c<sumOfCol.length; c++) {
			for (int r=0; r<arr.length; r++) {
				sumOfCol[c]+=arr[r][c];
			}
			System.out.print(sumOfCol[c]+ " ");
		}
		 
	}
}
