package com.corejava.oops.poly2;

public class TestAnimal {

	public static void main(String[] args) {
				
		//Object a = new Cat();
		Animal a = new Cat();	
		
		a.eat();
		a.sleep();
		Animal.dance();
		a.dream();
		
		
		
		//(Dog)a).bark(); // to access child class specific methods we need to down cast the reference to 
		// child level.
		
		//String[] s = {"java","Testing","selenium"};
		Object[] s = {"java","Testing","selenium"};
		
		//int[] x = {10,20,30,40};
		Object[] x = {10,20,30,40};
		
		//String[][] s1 = {{"java","selenium"},{"Testing","Automation"}};
		Object[][] s1 = {{"java","selenium"},{"Testing","Automation"}};
		
		addNumbers(10,20);
	}
	
	public static int addNumbers(int x, int y)
	{
		int sum = (x + y);
		return sum;
	}
	
	public static int addNumbers(int x, int y, int z)
	{
		int sum = (x + y + z);
		return sum;
	}

}
