package com.InterviewQuestions;

public class StringManipulations {

	public static void main(String[] args) {
////		Write a program to swap 2 numbers without a temporary variable?
//
//		int a =3;
//        int b =5;
//        
//        a = a+b; // a = 8;3+5
//        b = a-b; // b = 3; 8-5
//        a = a-b; // a = 5; 8-3
//        System.out.println("a="+a+" "+" b="+ b);
//        
////		Swap 2 strings without a temporary variable?
//        String c = "Yellow";
//        String d = "Green";
//        
//        c = c+d;
//        System.out.println(c);//YellowGreen
//        System.out.println(c.length()); //11
//        System.out.println(d.length()); //5
//        d = c.substring(0, c.length()- d.length());//
//        c = c.substring(d.length());//green
//        System.out.println(c);//green
//        System.out.println("c is now "+c +" " +"d is now"+ d);
//Find out how many alpha characters present in a string?
       
        String alpha = "abasdf5323&*%$)(dfgH";
        String newAlpha=alpha.replaceAll("[^A-z]","");
//        System.out.println(newAlpha);
//        System.out.println(newAlpha.length());
        //another way
        System.out.println(alpha.replaceAll("[^A-z]", "").length());
  //How to find a part of a String? What is substring? Find how many words are in the string.
        
        String anyWord= "Anywhere";
       System.out.println(anyWord.substring(3));
       System.out.println("---------------");
       String anySentence = "Somewhere over the rainbow";
       String[]words=anySentence.split(" ");
       for (int i=0; i<words.length; i++) {
    	   System.out.println(words[i]);
    	  }
       System.out.println("The length of the sentence is : " + words.length + " words.");
      System.out.println("___________");
       String str="Today is Sunday";
       System.out.println(str.substring(9, str.length()-1));
	}

}
