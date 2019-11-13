package com.Class17;

public class ObjectOfCOmputer {

	public static void main(String[] args) {
		ClassComputer laptop = new ClassComputer ();
		laptop.name = "laptop";
		laptop.brand = "Acer";
		laptop.color = "BlushPink";
		laptop.memory = 4;
		laptop.screenSize = 15;
		laptop.playGames();
		laptop.coding();
		
		System.out.println("I have a laptop " + laptop.brand + " " +
		laptop.color + " with memory of " + laptop.memory + " GB "+
				" and screensize " + laptop.screenSize);

	}

}
