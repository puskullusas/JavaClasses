package com.class10;

public class ArrayTasks {
	public static void main (String []args) {
		
		char [] grades = {'A', 'B','C', 'D', 'E'};
		System.out.println(grades [1]);
		
		//or
		char[] grade = new char [5];
			grade [0] = 'A';
			grade [1] = 'B';
			grade [2] = 'C';
			grade [3] = 'D';
			grade [4] = 'E';
			System.out.println(grade.length);
			System.out.println(grade [3]);
			
		// create an array of names
			String []names = {"Seda", "Nuray","Ali","Emine","Sasha", "Ridvan"};
			System.out.println(names[4]);
			
		// create an array of words and print in a sentence
			String[] words = new String [5];
					words[0]= "Java";
					words[1]= "is";
					words[2]= "coding";
					words[3]= "Saturday";
					words[4]= "day";
					System.out.println(words [3] + " "+words [1] + " "+
					words [0] + " " +words [2]+ " "+ words [4]);
			}
			
		}
				
	


