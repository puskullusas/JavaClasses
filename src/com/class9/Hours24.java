package com.class9;

public class Hours24 {
	public static void main (String [] args) {
		
	for (int h= 0; h<24; h++) {
			for (int m=0;m<60; m++) {
				System.out.println(h+ ":" + m);
			}
		
		//another way
		for(int i=0; i<24; i++) {
            for(int j=0; j<60; j++) {
                if (j<10) {
                    System.out.println(i +":0" +j);
                   
                }else {
                System.out.println(i +":" +j);
                }
                
	}
}}}}
