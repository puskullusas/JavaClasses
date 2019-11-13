package com.class13;

public class ReplaceStringMethod {

	public static void main(String[] args) {
		
		/*.replace()
		 * this method returns a new string resulting
		 * from replacing all occurrences of oldChar
		 * in this string with newChar
		 */
		String str = "Hello Dear, how are you?";
		System.out.println(str.replace('e', 'z'));//replaces all occurrences
		System.out.println();
		System.out.println(str.replaceFirst("e","a"));//replaces first occurrence
		
		
		
		
		
	}

}
