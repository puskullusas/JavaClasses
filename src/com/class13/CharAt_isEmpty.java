package com.class13;

public class CharAt_isEmpty {

	public static void main(String[] args) {
	
		//type string reverse using charAt method
		
        String str2="Sunday";
        
        for(int i=5; i>=0; i--) {// or instead int i=5, can use int i=day.length()-1
            System.out.print(str2.charAt(i));
        }
        System.out.println("______________");
//        Create a String and if the String is not 
//        empty perform the following: if the String has an 
//        odd number of characters and has 3 or more characters, 
//        print the character in the middle of the String.
//        
        String str3="Hello";
        
       int middle= str3.length()/2;
       System.out.println();
        if (!(str3.isEmpty())){
        	if(str3.length()%2!=0&& str3.length()>=3) {
        		System.out.println(str3.charAt(middle));
      	}
      }
      //  another way
        String str="Wednesday";
        int l=str.length();
        if (!(str.isEmpty())) {
            if (l%2==1 && l>=3) {
                System.out.println(str.charAt(l/2));
            }}
}}
