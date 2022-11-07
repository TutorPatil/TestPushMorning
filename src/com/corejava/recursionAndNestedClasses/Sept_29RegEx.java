package com.corejava.recursionAndNestedClasses;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sept_29RegEx {

	public static void main(String[] args) {
		regexEx1();
	}
		public static void regexEx1()
		{
			
			//1st Way
			Pattern p = Pattern.compile(".s");  //. represents single character  
			
			Matcher m = p.matcher("as");  
			boolean b = m.matches();  
			
			System.out.println(b);
			
			
			//2nd way  
			boolean b2=Pattern.compile(".s").matcher("ax").matches();  
			
			System.out.println(b2);
			
			
			//3rd way  
			boolean b3 = Pattern.matches(".s", "Ys");  
			System.out.println(b3);
			
			
		}

	

}
