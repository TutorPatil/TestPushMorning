package com.corejava.recursionAndNestedClasses;

public class TesterClass {

	public static void main(String[] args) {

		//TestAnonimous t = new TestImpl();
		//t.clikOnButton();

		
		/*
		 * TestAnonimous t = new TestAnonimous() {
		 * 
		 * 
		 * public void clikOnButton() {
		 * 
		 * System.out.println(" This is the anonimous  implementation...."); } };
		 * 
		 * t.clikOnButton();
		 */
		
		TestAnonimous t = () -> System.out.println("Lambda Implementation");
		t.clikOnButton();
		
	}

}
