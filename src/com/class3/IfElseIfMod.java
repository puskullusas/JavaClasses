package com.class3;

public class IfElseIfMod {
	public static void main (String [] args1) {
		
		/*int n1=100;
		int n2=100;
		
		if (n1>n2) {
			System.out.println("N1 is larger than N2");
		}else {
			System.out.println("n1 is smaller than n2");//will be executed
		}
		//another example
		int a1=100;
		int a2=100;
		
		if (a1>a2) {
			System.out.println("N1 is larger than N2");// false
		}else if (a1==a2){
			System.out.println("n1 is equal to n2"); // will be executed
		}else {
			System.out.println("n1 is smaller than n2");// will be skipped
		}*/
		//1st task
		int month =5;
		if (month == 1) {
			System.out.println("1st Month of the year is January");
		}else if (month == 2) {
				System.out.println("2nd Month of the year is February");
		}else if (month == 3) {
					System.out.println("3d Month of the year is March");
		}else if (month == 4) {
			System.out.println("4th Month of the year is April");
		}else if (month == 5) {
			System.out.println("5th Month of the year is May");
		}else if (month == 6) {
			System.out.println("6th Month of the year is June");
		}else if (month == 7) {
			System.out.println("7th Month of the year is July");
		}else if (month == 8) {
			System.out.println("8th Month of the year is January");
		}else {
			System.out.println("there are only 8 months in the year!");
		}
			
			//2nd task, check whether number is positive or negative, (how do we check what is positive or neg)
			int num=-1;
			
			if (num<0) { // if condition is false, "else" block will be executed
							//5 is smaller than 0 or 0 is bigger than 5//not true
				System.out.println("Number is negative"); 
			}else {
				System.out.println("Number is positive");
									
			}
			//MOD MOD MOD MOD MOD MOD MOD MOD
			//check whether number is even or odd
			int mod = 7;
			int modRes =mod%2;// or if you skip this step
			if (modRes==0) {// (mod%2==0), (mod%2!=0)
				System.out.println("the number is even");
			}else {
				System.out.println("the number is odd");
			}/*OR
			* int x=19;
              if (x%2!=1) {
                 System.out.println("even");      
              }else if(x%2!=0){
                 System.out.println("odd");
               OR
               int z=18;
               if (!(z%2==1)) {
                  System.out.println("even");
               }else if(!(z%2==0)){
                  System.out.println("odd");*/
	}
	
	
}
