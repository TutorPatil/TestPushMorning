package com.corejava.oops.poly2;

public class TestFuncInterface {

	public static void main(String[] args) {

		/*
		FuncTest ft = new FuncTest() {		
			
			public int addNumbers(int x, int y) {			
				return (x+y);
			}
		};
		*/
		//System.out.println(ft.addNumbers(10,20));
		
		// Lambda Expression... ( Or arrow Functions )
		
		FuncTest ft = ( x , y) -> (x+y);
		
		FuncTest ft2 = (x, y ) -> {
			return (x - y );
		};
		
		System.out.println(ft2.addNumbers(30,20));
		
		
		
		// FUnctional Programming..... Coding for functional interfaces,,to implement the methods directly....( inline)
		
		System.out.println(ft.addNumbers(10,20));
		
		FuncInterface1 fi = (String s) ->
		{
			System.out.println("===========");
			System.out.println("+++++++++++++++++++");
			return s.length();
		};
		
		
		
		System.out.println(fi.getNumberOfCharactersInString("Ramu"));
		
		TestLambda1 t = () -> System.out.println(" Welcome to Lambda");			
		t.sayHello();
		
	}

}
