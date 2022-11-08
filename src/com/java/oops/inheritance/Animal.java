package com.java.oops.inheritance;

//final class Animal{  // if the class is final then it cant be inherited 
// final class cant have a sub class


 public abstract class Animal {
	
	/*
	  
	  Tasks of Java Complier


		1. Checks for syntax
		2. Converts .java to .class
		3.Implicit Type casting for eg double d = 50; int x = 'a';
		4. Adds default constructor when not added by the programer
		5. Calls the super class constructor from the child class constructor
		
		Variable Masking or Variable hiding
		When we have the same instance variables both in parent and child class
		and on setting the values to the child class instance variables, 
		The values will only be set to the child class object and not cascade to the parent class object
	 */
	
		
	int age;
	
	//public final abstract void hunt(); // we cant use final and abstract together 
	// it becomes a illegal combination in java  
	// An abstract method cant be final....
	
	public abstract void hunt();
	
	
	//final abstract public void sleep() // a final method cant be abstract...
	final  public void sleep()
	{
		System.out.println(" The animal of the age "+ age +
				" of the colour "+ colour+ " is sleeping" );
		
	}
	
	

	String colour;
	
	public void eat()
	{
		System.out.println(" The animal of the age "+ age +
				" of the colour "+ colour+ " is eating" );
		
	}
	
	
	
	public Animal()
	{
		super();
		
	}
	
	public static void dance()
	{
		System.out.println(" The animal is dancing.....");
	}
	
	

}
