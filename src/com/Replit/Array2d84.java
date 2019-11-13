package com.Replit;

public class Array2d84 {

	public static void main(String[] args) {
		//to check if array is SQUARE
		//means=> number of rows = number of cols;
		//
		int[][] a = { 
				{ 1, 1, 1}, 
				{ 1, 1, 1}, 
				{ 1, 1, 1} 
				};
		//to check rows
		boolean answer=true;
		int rowCount=a.length;//is 3
		
		for(int r=0;r <rowCount;r++) {
			//current row element is a[r]
			//current row element is an array
			//current array size is a[r].length
			int colCount = a[r].length;//is 3
			if (rowCount==colCount) {
			answer=true;
			}else {
				answer=false;
				break;
			}
		}
		if(answer==true) {
		System.out.println("The array is square");
		}else {
		System.out.println("The array is not square");
		}	
			
			
		
//		for (int b = 0; b < a.length; b++) {
//			for (int j = 0; j < a[b].length; j++) {
//				if (a[b].length == a.length) {
//				} else {
//					System.out.println("false");
//				}
//			}
//		}
//		System.out.println("true");

		// solution
//		int[][] array = { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };
//		boolean flag = false;
//		for (int i = 0; i < array.length; i++) {
//			if (array.length == array[i].length) {
//				flag = true;
//			}
//			break;
//		}
//		System.out.println(flag);
	}

}
