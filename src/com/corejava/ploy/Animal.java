package com.corejava.ploy;

import com.corejava.practice.Sample;

public class Animal {
	
	int age;
	String colour;
	
	public void eat()
	{
		System.out.println(" The animal of the age "+age+" of the colour "+colour+" is eating....");
	}
	
	public void sleep()
	{
		System.out.println(" The animal of the age "+age+" of the colour "+colour+" is sleeping....");
	}
	
	/*
	public static void makeAnimalEat(Object a)
	{
		Dog d = (Dog)a;	
		d.eat();
	}
	*/
	
	public static void makeAnimalEat(Animal a)
	{
		a.eat();
	}
	
	//public static Object getAnimalInstance(String animalType)
	public static Animal getAnimalInstance(String animalType)
	{
		if(animalType.equalsIgnoreCase("dog"))
		{
			Dog d = new Dog();
			return d;
		}
		if(animalType.equalsIgnoreCase("cat"))
		{
			Cat d = new Cat();
			return d;
		}
		if(animalType.equalsIgnoreCase("tiger"))
		{
			Tiger d = new Tiger();
			return d;
		}	
		
		//Sample s = new Sample();
		//return s;
		
		return null;
	}

}
