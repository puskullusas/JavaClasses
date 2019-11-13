package com.Class18;

public class Task {
	void maximumNumber(int n1, int n2) {
		int max;
		if (n1 > n2) {
			max = n1;
		} else if (n1<n2) {
			max = n2;
			System.out.println("The largest number is " + max);
	}else {
		System.out.println("The numbers are equal");
	}
		}
	

	void oddEvenNum(int n3) {
		int odd, even;
		if (n3 % 2 == 0) {
			even = n3;
			System.out.println("The number " + n3 + " is even");
		} else {
			odd = n3;
			System.out.println("The number " + n3 + " is odd");
		}
	}

	void Palindrome(String word) {
		String reverse = "";
		int size = word.length();
		for (int i = size - 1; i >= 0; i--) {
			reverse = reverse + word.charAt(i);

		}
		if (word.equals(reverse)) {
			System.out.println("The word " + word + " is Palindrome");
		} else {
			System.out.println("The word " + word + "is not Palindrome");
		}
	}

	public static void main(String[] args) {
		Task max = new Task();
		max.maximumNumber(5, 5);
		max.oddEvenNum(2);
		max.Palindrome("kavak");
	}

}
