package com.class13;

public class ReplaceAll {

	public static void main(String[] args) {
		
// .replaceAll
		String str = "skdlfdfsldkfjv"
				+ "blablablakjlkjlkj"
				+ "lkjkjljljlkjlkj";
	System.out.println(str.replaceAll("bla(.*)",""));
	//starting with bla inclusive will replace the rest
	String str2="Video provides a powerful way to help you prove your point. ";
			System.out.println(str2.replaceFirst(" ", ""));
	}

}
