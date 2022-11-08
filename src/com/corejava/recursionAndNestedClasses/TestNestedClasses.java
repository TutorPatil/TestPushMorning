package com.corejava.recursionAndNestedClasses;

public class TestNestedClasses {

	public static void main(String[] args) {
		
		Outer out = new Outer();
		System.out.println(out.outerAge);
		out.printOuterAge();
		
		// Creating the object of inner class out side of outer class		
		Outer.Inner in = out.new Inner();
		System.out.println(in.innerAge);
		
		// Creating the object of the static inner class out side of outer class
		Outer.InnerStaticClass inStatic = new Outer.InnerStaticClass();
		System.out.println(inStatic.innerStaticAge);
		
		//Accessing static members of a static innner class
		System.out.println(Outer.InnerStaticClass.innerStaticName);
		
		
		

	}

}
