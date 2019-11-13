package com.Replit;

public class Array2D82 {

	public static void main(String[] args) {
		double[][] arr = {//
				{1.4,2.0,3.3,2},//0
				{4,1.5,6.1,1},  //1
				{1.2,3.1,4,1.6} //2
			};
			
			//Double and print array
		//System.out.println(a.length);
							
		for (int b=0; b<arr.length; b++){// length of array is 3 // b
			for (int j = 0; j<arr[b].length; j++) { //loops through each  (j)
				System.out.print(arr[b][j]*2 + " ");
			}
			System.out.println();
	}

}}
