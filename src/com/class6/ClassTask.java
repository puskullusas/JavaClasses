package com.class6;

import java.util.Scanner;

public class ClassTask {
	public static void main (String [] args) {
	Scanner input = new Scanner(System.in);
	/*System.out.println("Please enter the Birth Month");
	String month = input.nextLine();
	String season;
	if (month.equals ("Jan")||month.equals ("Feb") ||month.equals ("Dec") ) {
		season = "Winter";
		//month.equalsIgnoreCase("Mar") ignores Case Low or Cap
	} else if (month.equalsIgnoreCase("Mar") || month.equals("Apr") || month.equals ("May")) {
		season = "Spring";
	}else if (month.equals("Jun") || month.equals("Jul") || month.equals ("Aug")) {
		season = "Summer";
}else if (month.equals("Sep") || month.equals("Oct") || month.equals ("Nov")) {
	season = "Autumn";
}else {
	season = "Unknown";
}
	System.out.println("You were born in " + season);
	System.out.println(month);*/
	
	//#2
	/* ask the user to enter boolean value for sale. If no sale --> i am not buying,
	 * if sale --> check the price of the item.
	 * based on the amount we will have to calculate the price after discount
	 * if price < 20 --> 10%; if 20-100 --> 20%; if 100-500 --> 30%; else 50%
	 * sysout " The price after discount of __ Price reduced form ___ to ____
	 */
	
	
	/*System.out.println("Is there sale?");
	boolean sale = input.nextBoolean();
	
	 double price;
	 double disc;
	 double total;
	 
	if (!sale) {
		System.out.println("I am not shopping");
	}else {
		System.out.println("What is the price?");
	 price = input.nextDouble();
		
		 
	 		if (price<20) {
			disc = price*0.10;
			total = (price - disc);
			//System.out.println(total);
			
		}else if (price >=20 && price <=100) {
			disc = price*0.20;
			total = (price - disc);
			//System.out.println(total);
			
		}else if (price >100 && price <500) {
			disc = price*0.30;
			total = (price - disc);
			//System.out.println(total);
		}else {
			disc = price*0.50;
							
	}
	 		total = (price - disc);
			System.out.println(total);
			
		System.out.println("The price after discount " +disc+ " is reduced from " +price + " to " + total);*/
	
	String discount = "";
	double totalDisc = 0;
	double price = 85;
	if (price<20) {
		discount = "10%";
		totalDisc = price*0.90;
	}else if (price >20 && price <80) {
		discount = "20%";
		totalDisc = price*0.80;
	}else if (price >80 && price <100) {
		discount = "30%";
		totalDisc = price*0.70;
	}
	System.out.println("The price after " + discount + " is reduced from " + price + " to " + totalDisc);
	}}	
