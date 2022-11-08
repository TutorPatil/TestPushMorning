package com.corejava.interfaces;

public class TestAnimal {
	
	
	
	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.age = 10;
		d.eat();
		d.sleep();
		d.drink();
		d.bark();
		d.recognizeOwner();
		d.walk();
		d.showSuperPowersOfAnimal();
		System.out.println(d.noOFlegs);
		System.out.println(Dog.colour);
		
		
		
		System.out.println("=========================");
		
		
		Cat c = new Cat();
		c.age = 5;
		c.eat();
		c.sleep();
		c.drink();
		c.huntRat();
		c.showSuperPowersOfAnimal();
		System.out.println(Cat.colour);
		System.out.println(Animal.noOFlegs);
		
	}
	

}
