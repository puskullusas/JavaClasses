package com.class13;

public class TaskOnManip {

	public static void main(String[] args) {
//		//1
		String newS= "I like bananas ve patatas";
		System.out.println(newS.replace(" ", ""));
		System.out.println("_______");
		//2
		String abra = "AbraCad743432a**&&%$#bra";
		String kada = abra.replaceAll("[^A-z]","");
		System.out.println(kada);
		char[]bra=kada.toCharArray();
	System.out.println(bra.length);
	System.out.println("___________");
	//3
	String a= "Is it saturday? "
			+ "Is it raining? "
			+ "Do we have a Java Class today?";
	String [] array1 =  a.split("\\?");
	for (int i = 0; i<array1.length; i++) {
		//System.out.println(array1[i]);
	}
	System.out.println(array1.length);
	}

}
