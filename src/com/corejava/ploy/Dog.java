package com.corejava.ploy;



public class Dog extends Animal{
	
	public void eat()
	{
		System.out.println(" The Dog of the age "+age+
				" of the colour "+colour+" is eating....and moving its tail..");
	}
	
	public void bark()
	{
		System.out.println(" The Dog of the age "+age+
				" of the colour "+colour+" is barking bow bow....");
	}
	
	
	// This is the overridden implementation of equals Method.
	 public boolean equals(Object obj) {
	      
		  Dog d1 = (Dog)obj; // Down casting obj to Dog level to compare Age...
		  
		  if(this.age == d1.age)
		  {
			  return true;
		  }
		  else
		  {
			  return false;
		  }
		  
		  
	    }

}
