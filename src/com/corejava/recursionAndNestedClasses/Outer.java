package com.corejava.recursionAndNestedClasses;

public class Outer {	
	
	int outerAge = 20;	
	public void printOuterAge()
	{
		
		System.out.println(outerAge);
		Inner in = new Inner();
		System.out.println(in.innerAge);	
		in.printInnerAge();
		System.out.println(InnerStaticClass.innerStaticName);
		InnerStaticClass.printInnerStaticAge();
		
		
	}	
	class Inner{		
		int innerAge = 15;		
		public void printInnerAge()
		{
			System.out.println(innerAge);
			System.out.println(outerAge);
		
			
		}	
		
	}
		
	private class InnerPrivate
	{
		int innerPvtAge = 10;
		
		public void printPvtAge()
		{
			System.out.println(innerPvtAge);
			System.out.println(outerAge);
			
		}	
		
	} 
	
	abstract class InnerAbstract{
		
		int innerAbstractAge = 25;
		
		
		public void printAbstractAge()
		{
			System.out.println(innerAbstractAge);
			System.out.println(outerAge);
			
			
			
		}
		
		
	}
	
	
	static class InnerStaticClass{
		
		int innerStaticAge = 20;
		static String innerStaticName = "Ramu";
		
		public static void printInnerStaticAge()
		{
			System.out.println(innerStaticName);
			
		}
		
	}

		
	

}
