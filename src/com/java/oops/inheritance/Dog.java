package com.java.oops.inheritance;

public class Dog extends Memal {
	
	int age;
	String colour;
	
	public Dog()
	{
		super();
		
		
	}
	
	public static void dance()
	{
		System.out.println(" The Dog is dancing.....");
	}
	
	
	
	public void bark()
	{
		int x = 20;
		x = 30;
		
		final int y = 100;
		//y=200;
		System.out.println(" The Dog of the age "+age
				+" of the colour "+ colour + " is barking bow bow...");
		System.out.println(age);
		System.out.println(super.age);
		System.out.println(colour);
		System.out.println(super.colour);
		eat();
		super.eat();
		
		
	}
	
	public void eat()
	{
		System.out.println(" The Dogee of the age "+ age +
				" of the colour "+ colour+ " is eating" );
		
	}

	
	public void hunt() {
		System.out.println(" The Dog is hunting.....");		
	}
	
	// final methods cant be overriden in the child class
	/*
	 * public void sleep() { System.out.println(" The animal of the age "+ age +
	 * " of the colour "+ colour+ " is sleeping" );
	 * 
	 * }
	 */

}
