package com.corejava.oops;

import java.util.Scanner;

public class TestCar {

	public static void main(String[] args) {
		Car c = new Car();
		
		//c.colour = "Black";
		
		Scanner src = new Scanner(System.in);
		String col = src.nextLine();
		
		c.setColour(col);
		
		//c.engineCapacity = 100;
		c.setEngineCapacity(1000);
		
		//c.seatingCapacity = -5;
		c.setSeatingCapacity(5);
		
		c.drive();
		c.dropYourFriendsToMovie();
		
		System.out.println(" The engine capacity of the car is "+c.getEngineCapacity());

	}

}
