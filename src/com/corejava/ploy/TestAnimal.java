package com.corejava.ploy;

public class TestAnimal {
	
	/*
	 * 
	   Which method has  to executed is dynamically decided by the JVM during run time.
	   
	   During compile time the compiler will just check whether there is a method present in 
	   The parent class or not.. But which method needs to be executed is decided by JVM dynamically during run time.... ( DMD )
	 */

	public static void main(String[] args) {

		Animal a = new Tiger();
		
		a.age = 10;
		a.colour = "white";
		
		a.eat();
		a.sleep();
		
		//a.bark();  // using the parent reference we can only access the methods which are present in the parent
		// we cant access any child class specific methods using parent reference...
		
		byte b =(byte)150;
		
		//Dog d = (Dog)a;
		//d.bark();		
		if( a instanceof Dog)
		{
			((Dog)a).bark();
		}
		
		if( a instanceof Cat)
		{
			((Cat)a).huntRat();
		}
		
		if( a instanceof Tiger)
		{
			((Tiger)a).huntAnimals();
		}
		
		System.out.println("=====================================");
		
		//=========================
		
		
		Dog d = new Dog();
		d.age=5;
		d.colour = "Black";
		
		Animal.makeAnimalEat(d);
		
		
		Cat c = new Cat();
		c.age = 6;
		c.colour = "Pink";
		Animal.makeAnimalEat(c);
		
		
		Tiger t = new Tiger();
		t.age = 15;
		t.colour = "White and Black";
		Animal.makeAnimalEat(t);
		
		
		System.out.println("=======================");
		
		Animal a1 = Animal.getAnimalInstance("Cat");
		a1.eat();
		
		
		System.out.println("========================");
		
		Object obj = new Dog();
		((Dog)obj).eat();
		
		
		

		
		

	}

}
