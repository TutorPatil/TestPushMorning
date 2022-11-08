package com.java.oops.inheritance;

public abstract class Memal extends Animal {
	
	int age;
	String colour;
	
	public Memal()
	{
		super();
		
	}
	
	

	public void walk()
	{
		System.out.println(" The memal of the age "+age
				+" of the colour "+ colour + " is walking");
		System.out.println(age);
		System.out.println(super.age);
		
	}

}
