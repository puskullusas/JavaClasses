package com.Replit;

public class Array89sumsOfEvenIndexAndEvenRow {
	public static void main(String[] args1) {
		int[][] a = { { -5, -2, -3, 7 }, { 1, -5, -2, 2 }, { 1, -2, 3, -4 } };
		int counterEvenRow = 0;
		int countEvenCol=0;
		int row = a.length;
		for (int i=0; i<row; i++) {
			if (i % 2 == 0) {
			counterEvenRow++;//index of rows
			
			}
			for (int j =0; j< a[i].length; j++){
				if(j%2==0) {
					countEvenCol++;
				}
			}
		}
		System.out.println(counterEvenRow);
		System.out.println(countEvenCol);
		
		
		

		}}
		//System.out.println(col);
	

