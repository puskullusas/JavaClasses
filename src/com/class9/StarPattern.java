package com.class9;

public class StarPattern {
public static void main (String [] args) {
	
	//	*****
	//	*****
	//	*****
	//	*****
	/*for (int i = 1; i <=4; i++) { // Controls the number of ROWS
		for (int j = 1; j<=5; j++) {// Controls the number of COLUMNS
			System.out.print("*");//Prints out columns
		}
		System.out.println(); // makes rows
	}*/
	//another way
//	12345
//	12345
//	12345
//	12345
//	12345
	/*for (int b = 1; b<=5; b++) {
		System.out.println();
		for (int c = 1; c<=5; c++){
			System.out.print(c);
	}*/
	
		/*for (int g = 5; g>0; g--) {
			System.out.println();
			for (int h = 5; h>=1; h--){
				System.out.print(h);*/
		
//	*
//	**
//	***
//	****
//	*****
	/*for (int g = 1; g<=5; g++) {
		for (int h = 1; h<=g; h++){//h has dependency on g
			System.out.print("*");
			}
		System.out.println();
}*/
	for (int k=5; k>=1; k--) {// rows
		for (int l= 1; l<=k; l++) { //columns
			System.out.print (k); 
		}
		System.out.println();
	}
	/*for (int g = 1; g<=5; g++) {
		for (int h = 1; h<=g; h++){
			System.out.print("*");
		}
	System.out.println();
	}	
	for (int k = 4; k>=1; k-- ) {
		for (int d = 1; d<=k; d++) {
			System.out.print("*");
	}
	System.out.println();
}*/
	
}}