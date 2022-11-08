package com.corejava.interfaces;

public class Cat implements Animal{
	
	int age;

	
	public void eat() {
		System.out.println(" The cat of the age "+age+" is eating");
		
	}

	
	public void sleep() {
		System.out.println(" The cat is Sleeping");
		
	}

	
	public void drink() {
		System.out.println(" The cat is drinking....");
		
	}
	
	
	public void huntRat()
	{
		System.out.println(" The cat of the age "+age +" is hunting....");
	}


	
	public void showSuperPowersOfAnimal() {
		System.out.println(" The cat has lot of super pwoers...");
		
	}



	public void hasMagicalPowers() {
		System.out.println(" The Catdoes not have Magical Powers");
		
	}
	

}
