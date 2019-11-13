package com.class11;

public class TasksCarsandSum {
	public static void main(String[] args) {
		String[] cars = new String[6];
		cars[0] = "Mazda";
		cars[1] = "Toyota";
		cars[2] = "Mercedes";
		cars[3] = "BMW";
		cars[4] = "Honda";
		cars[5] = "Jiguli";
		for (String car : cars) {
			System.out.println(car);
		}
		System.out.println("__________________");

		int[] nums = { 5, 6, 7, 9, 3, 5 };
		int sum = 0;

		for (int element : nums) {
			// System.out.println(element);
			sum = sum + element;
		}
		System.out.println("The sum is " + sum);
		System.out.println("_________________________");
		int[] numbers = { 10, 20, 30, 40 };
		int sum1 = 0;
		for (int i = 0; i < numbers.length; i++) {

			sum1 += numbers[i];
		}
		System.out.println(sum1);
		System.out.println("++++++++++++++++++");

		String[] country = new String[3];
		country[0] = "Washington DC";
		country[1] = "Moscow";
		country[2] = "Minsk";
		String city;
		for (int i = 0; i < country.length; i++) {
			if (i == 0) {
				city = "USA"; // System.out.println("USA");
			} else if (i == 1) {
				city = "Russia"; // System.out.println("Russia");
			} else {
				city = "Belarus"; // System.out.println("Belarus");
			}
			System.out.println(city);
		}
		System.out.println("_______________");
		// another way
		String[] c = { "India", "Canada", "UK" };
		for (String getCity: c) {
			if (getCity.equals("UK")) {
				System.out.println("The capital of UK is London ");
			} // another way
		}
		for (int b = 0; b < c.length; b++) {

		}
	}
}
