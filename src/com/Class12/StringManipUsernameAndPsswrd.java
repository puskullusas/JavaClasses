package com.Class12;

import java.util.Scanner;

public class StringManipUsernameAndPsswrd {

	public static void main(String[] args) {

//		Accept username, password and confirm
//		password and check following requirements:
//		1. Username and Password cannot be  empty, if so
//		message=”Username and Password cannot be empty”.
//		2. Password should be minimum 8 characters, if
//		less message=”Password is too short”.
//		3. Password cannot contain username if so, 
//		message=”Password cannot contain username”.
//		4. Password should match confirmed password, if not  
//		message=“Passwords do not match”. Only after all requirements met 
//		message “Your username and password has been
//		created

		Scanner input = new Scanner(System.in);
		System.out.print("Please enter Username: ");
		String usrnm = input.nextLine();
		System.out.print("Please enter Password: ");
		String pswrd = input.nextLine();
		String confirmedPswrd = "kukuRuza";

		
		int minL = 8;
		if (usrnm.isEmpty() && pswrd.isEmpty()) {
			System.out.println("Username and Password cannot be empty");
		} else if (pswrd.length() <(minL)) {
			System.out.println("Too short");
		} else if (pswrd.equals(usrnm) && !(pswrd.isEmpty()) && !(usrnm.isEmpty())) {
			System.out.println("Password cannot contain username");
		} else if (pswrd.equals(confirmedPswrd)) {
			System.out.println("Your username and password has been created! Congratulations!");
		}else{
			System.out.println("Passwords do not match");
			
		}
	}
}	
