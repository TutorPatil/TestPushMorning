package com.corejava.interfaces;

public interface Animal extends SuperAniaml,MagicalAnimal{
	
	/*
	 * 
	 * An interface is 100 % abstract
	 * By default all the methods of an interface are public and abstract
	 * An interface can have variables , by default all the variables of an interface are public static and final
	 * An interface will not have any constructor
	 * WHen a class implements an interface , the contract is the class must give the body to all the abstract methods soming from the interface...
	 * Otherwise the class will need to become abstract....
	 * 
	 * 
	 * A class can only extend one class at a time
	 * A class can extend another class and can implement an interface at a time
	 * A class can implement any number of interfaces at a time...
	 * 
	 * An interface can extend another interface
	 * An interface can extend more than one interface ( which is not allowed in Classes)	 * 
	 * 
	 * 
	 * 
	 */
	
	
	public static final int noOFlegs = 4;
	String colour = "white";
	
	
	public abstract void eat();
	
	void sleep(); // By default all the methods of an interface are public and abstract
	
	void drink();

}
