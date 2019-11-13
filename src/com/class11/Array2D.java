package com.class11;

public class Array2D {
	public static void main (String [] args) {
	// Declare 2D Array
	//Data_Type [][] Array_Name = new int [Row_Size][Column_Size];
		
							  //rows	columns
//		int [] [] arr = new int [3]   	[4];
//		//1st row-col
//		arr   [0] [0]=44;
//		arr   [0] [1]=80;
//		arr   [0] [2]=33;
//		arr   [0] [3]=20;
//		// 2nd row-col
//		arr   [1]  [0]=10;
//		arr   [1]  [1]=5;
//		arr   [1]  [2]=7;
//		arr   [1]  [3]=8;
//		//3d row-col
//		arr  [2] [0]=10;
//		arr  [2] [1]=5;
//		arr  [2] [2]=7;
//		arr  [2] [3]=8;
//		
//	System.out.println(arr [1] [0]);
//	System.out.println("____________");
		
//	int [] [] numbers = {
//			{6,7,8,9,5},
//			{1,2,3,4,6},
//			{4,7,9,3,5}
//	};
//	System.out.println(numbers [1] [4]);
		
////to identify nums of rows
//	System.out.println(numbers.length);
//	//to identify nums of columns / elements in the first row
//	System.out.println(numbers [1].length);
//	System.out.println("______________");
//	
//	//retrieve arrays
//	for (int i = 0; i<numbers.length; i++) {
//		for (int j = 0; j<numbers[i].length; j++) {
//			System.out.print(numbers[i][j] + " ");
//		}
//		System.out.println();
	
//print even numbers only
		int newArr[][]= {
				{3,6,4,8},
				{5,8,9,10},
				{1,2,9,12}
		};
		int sum=0;
		int even =0;
		for (int i=0; i<newArr.length; i++) {
			sum = sum+newArr[i][1];
			System.out.println("Sum of row "+ i + ":"+ sum);
//			sum=0;
//			for (int j=0; j<newArr[i].length; j++) {
				
//				for (int arr[]:newArr) {
//					for (int getArr: arr) {
//						System.out.print(getArr + " ");
//					} 
//					System.out.println();
//				if (newArr[i][j]%2==0) {
//					even=newArr[i][j];
//					System.out.print(even+" ");
//				sum = sum + newArr[i][j];//sum of all numbers
				
//			System.out.println("Sum of row "+ newArr[1] + ":"+ sum);//sum of particular row
		}
		
		}
}
	
	


