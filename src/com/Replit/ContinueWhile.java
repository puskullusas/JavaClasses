package com.Replit;

public class ContinueWhile {
	public static void main(String[] args) {
		/*
		 * Print 1 to 10 Numbers except 7, 8, 9, 5 using the While loop Step 1:
		 * Initialize the i value as int i=1 Step 2: Create the while loop to check the
		 * condition Step 3: Write the if condition for validation part Step 4 : It
		 * should print 1 2 3 4 6 10
		 */

		/*int i = 1;
		while (i <= 10) {
			if (i != 7 && i != 8 && i != 9 && i != 5) {
				System.out.println(i);
			}
			i++;
		}*/
// 2 another way
		/*int c= 1;
		while ( c<= 10) {
			if (c >=1 && c<=4 || c==6||c==10) {
				System.out.println(c);
			}
			c++;
		}*/
		// 3 ANOTHER WAY
		int b = 1;
		while (b <= 10) {
			if (b == 5 || b == 7 || b == 8 || b == 9) {
				b++;
				continue;
			} else {
				System.out.println(b);
				b++;

	}
}}}