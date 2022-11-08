package com.corejava.exceptions;

public class Student {
	
	int age;
	String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) throws InvalidAgeException {
		
		if( age <= 0)
		{
			//InvalidAgeException iae = new InvalidAgeException("Age less than zero not supported...");
			//throw iae;
			
			throw new InvalidAgeException("Age less than zero not supported...");
		}
		else
		{
			this.age = age;
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
