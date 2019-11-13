package com.Replit;

public class Array2D87findindex {

	public static void main(String[] args) {
		int[][] a = { { -5, -2, -3, 7 }, { 1, -5, -2, 2 }, { 1, -2, 3, -4 } };

		int negativeAndOdd = 0;
		for (int b = 0; b < a.length; b++) {
			for (int j = 0; j < a[b].length; j++) {
				if (a[b][j] % 2 != 0 && a[b][j] < 0) {
					negativeAndOdd++;
				}
			}
		}
		System.out.print(negativeAndOdd);
		
		//another way with for each loop
		
//		System.out.println(total);
//		 int counter=0;
//		   for( int i[]: a){
//		     for(int num:i){
//		       if( num%2!=0 && num<0){
//		          counter++;
//		       }
//		     }
//		   }
	}
}
