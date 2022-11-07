package com.corejava.oops.poly2;

public class TestPet {

	public static void main(String[] args) {
		
		//Pet p = new SmallDog();
		//p.recognizeOwner();
		
		// Anonymous Inner class	
		
		Pet p = new Pet() {			
		
			public void recognizeOwner() {
				System.out.println(" The small dog can also recognize its owner...");				
			}
		};
		
		p.recognizeOwner();

	}

}
