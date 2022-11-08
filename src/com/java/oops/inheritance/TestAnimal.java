package com.java.oops.inheritance;

public class TestAnimal {

	public static void main(String[] args) {

		/*
		 * Dog d = new Dog();
		
		d.age = 5;
		d.colour = "White";
		
		d.bark();
		
		
		 * Dog d = new Dog(2, "White", 5, "Black", 10, "Grey");
		 * 
		 * d.bark();
		 * 
		 * System.out.println("=============");
		 * 
		 * Memal m = new Memal(20,"Black",10,"Grey");
		 * 
		 * m.eat(); m.sleep(); m.walk();
		 */
				
		Dog d = new Dog();
		
		d.age = 5;
		d.colour = "White";
		
		d.bark();
		
		// d.dance() //
		
		 // this is  how we need to access static members of a class 
		// The static members will also get inherited 
		Dog.dance();
		
		// The static methods cant be overridden , they are always at the class level
		Animal.dance();
		d.hunt();
		
		//Animal a = new Animal(); // we cant create the objects of abstract class 
		
		
		Cat c = new Cat();
		c.eat();
		c.sleep();
		c.hunt();
		Cat.dance();
		
		
		
	

	}

}
