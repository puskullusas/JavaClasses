package com.class7;

public class WhileLoop {
	public static void main(String[] args) {

		//int time = 8;// declaring and initializing/assigning
		//if (time < 12) {// testing the condition
			//System.out.println("Good Morning");// code executes one time
	//	}
		// to execute code several times
		//int clock = 7;
		//while (clock < 12) {// if condition is true,
		//	System.out.println("Good Morning");// this way it will execute infinite times
		//}
		// you have to add a certain point to stop the loop, by adding increment or
		// decrement
//	}

	/*int clock1 =9;//the code is read from 9 to 12
	while(clock1<12)
	{// if condition is true,
	System.out.println("Good Morning");// this way it will execute three times (12-9=3times)
	clock1++;
	}*/
		//i want to print numbers from 1-20;
	int i=1;					//1. assigns
	while (i<=20) {				// 2. checks the condition, if false, goes out of the loop.
		System.out.println(i); 	//3. if true goes inside and executes
	i++;						//4. increments initial value and assigns new, after
	}							//5. goes back to while and repeats step 2.
	// i want to print from 10-1;
	int y = 10;
	while (y>=1) {//to print inclusive 1 we have to put>=
		System.out.println(y);
	y--;
	}
	}
}