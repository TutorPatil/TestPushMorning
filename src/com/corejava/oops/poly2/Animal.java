package com.corejava.oops.poly2;

public interface Animal {
	
	public void eat();
	void sleep();
	//void dance1();
	
	// Post JDK 8 we can add static methods in Interfaces...
	public static void dance()
	{
		System.out.println(" The animal is dancing....");
	}
	
	// void dream(); // This is not allowed...
	
	// JDK 8 on wards
	// Default methods will be inherited by all the child classes which are impemnting the interfaces...
	default void dream()
	{
		System.out.println(" The enimals can also dream....");
	}

}
