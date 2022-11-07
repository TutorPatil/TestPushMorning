package com.corejava.finalsession;

public class SingletonExample {
	
	// Create the object of the same calss in the global area
	public static SingletonExample st = new SingletonExample();
	
	// Make the constructor as private, so that one one is allowed to create the object of this class out side
	private SingletonExample()
	{
		
	}
	
	// Write a method which will retun the object which was created earlier...
	public static SingletonExample getInstance()
	{
		return st;
	}
	
	public void test()
	{
		System.out.println("inside the test method..");
	}
	
	
	

}
