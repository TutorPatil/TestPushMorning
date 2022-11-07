package com.corejava.finalsession;

public class TestSingleton {

	public static void main(String[] args) {
	
		SingletonExample	s = SingletonExample.getInstance();
		s.test();
		
		System.out.println("==============="); 
		
		System.out.println("===============");
		System.out.println("===============");
		System.out.println("===============");
		
		
		SingletonExample s1 = SingletonExample.getInstance();
		s1.test();
		
		
		

	}

}
