package com.syntax.review;

import java.util.Scanner;

public class Task2InstructorSolution {
	public static void main (String [] args) {
	Scanner scan= new Scanner(System.in);
    boolean snow, rain, sunny;
    int temp = scan.nextInt();
    String activity;
    System.out.println("Please enter a temperature");
    	if (temp >= 40 && temp < 80) {
        System.out.println("Is it raining?");
        rain = scan.nextBoolean();
        if (rain) {
            activity = "Watch a movie";
        } else {
            activity = "Go hiking";
        }
    } else if (temp >= 25 && temp < 40) {
        System.out.println("Is it snowing?");
        snow = scan.nextBoolean();
        if (snow) {
            activity = "Snowboarding";
        } else {
            activity = "Let’s code";
        }
    } else if (temp >= 80) {
        System.out.println("Is it sunny");
        sunny = scan.nextBoolean();
        if (sunny) {
            activity = "Go to the beach";
        } else {
            activity = "Do more coding";
        }
    } else {
        System.out.println("Please enter different temperature");
        activity = "Unknown";
    }
    
    System.out.println("My activity for today is " + activity);
}}
