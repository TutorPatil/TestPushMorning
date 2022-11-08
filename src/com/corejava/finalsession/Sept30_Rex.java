package com.corejava.finalsession;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sept30_Rex {

	//Used to define a pattern for searching or manipulating strings
		// Used for searching for strings with a particular pattern and to replace any particular pattern if  found.
		// Usually used for validating password and email validation
		// Matcher class and Pattern Class 
		
		// For email Id check use this pattern
		//email_pattern = "([a-zA-Z0-9\\_\\-\\.]+)@([a-zA-Z]+).(.+)"
		
		
		
		public static void main(String[] args) {	
			regexEx6();
			  
		}
		
		public static void regexEx1()
		{
			
			//1st Way
			Pattern p = Pattern.compile(".s");  //. represents single character  
			Matcher m = p.matcher("as");  
			boolean b = m.matches();  
			
			System.out.println(b);
			
			
			//2nd way  
			boolean b2=Pattern.compile(".s").matcher("as").matches();  
			
			
			//3rd way  
			boolean b3 = Pattern.matches(".s", "as");  
			
			
		}
		
		public static void regexEx2()
		{
			// .s == The pattern is only  of 2 charcters and the first character can be any thing but second one is s
			
			System.out.println(Pattern.matches(".s", "as"));//true (2nd char is s)  
			System.out.println(Pattern.matches(".s", "mk"));//false (2nd char is not s)  
			System.out.println(Pattern.matches(".s", "mst"));//false (has more than 2 char)  
			System.out.println(Pattern.matches(".s", "amms"));//false (has more than 2 char)  
			System.out.println(Pattern.matches("..s", "mas"));//true (3rd char is s)  
		}
		
		
		/*
		 * 
		* RegX Meta Characters
		
		Regex	Description
		.	Any character (may or may not match terminator)
		\d	Any digits, short of [0-9]
		\D	Any non-digit, short for [^0-9]
		\s	Any whitespace character, short for [\t\n\x0B\f\r]
		\S	Any non-whitespace character, short for [^\s]
		\w	Any word character, short for [a-zA-Z_0-9]
		\W	Any non-word character, short for [^\w]
		\b	A word boundary
		\B	A non word boundary
			
			[abc]	Find one character from the options between the brackets
			[^abc]	Find one character NOT between the brackets
			[0-9]	Find one character from the range 0 to 9
			
			[0-9]
			
			
			Quantifiers
			Quantifiers define quantities:
			
			Quantifier	Description
			
			n+	Matches any string that contains at least one n
			n*	Matches any string that contains zero or more occurrences of n
			n?	Matches any string that contains zero or one occurrences of n
			n{x}	Matches any string that contains a sequence of X n's
			n{x,y}	Matches any string that contains a sequence of X to Y n's
			n{x,}	Matches any string that contains a sequence of at least X n's

		 */
		
		public static void RegEx3()
		{
			System.out.println("metacharacters d....");
			//d means digit  
			  
			System.out.println(Pattern.matches("\\d", "abc"));//false (non-digit)  
			System.out.println(Pattern.matches("\\d", "1"));//true (digit and comes once)  
			System.out.println(Pattern.matches("\\d", "4443"));//false (digit but comes more than once)  
			System.out.println(Pattern.matches("\\d", "323abc"));//false (digit and char)  
			  
			System.out.println("metacharacters D....");//D means non-digit  ( character )
			  
			System.out.println(Pattern.matches("\\D", "abc"));//false (non-digit but comes more than once)  
			System.out.println(Pattern.matches("\\D", "1"));//false (digit)  
			System.out.println(Pattern.matches("\\D", "4443"));//false (digit)  
			System.out.println(Pattern.matches("\\D", "323abc"));//false (digit and char)  
			System.out.println(Pattern.matches("\\D", "m"));//true (non-digit and comes once)  
			  
			System.out.println("metacharacters D with quantifier....");  
			System.out.println(Pattern.matches("\\D*", "mak"));//true (non-digit and may come 0 or more times)  
			  
		}
		
		
		public static void regexEx4()
		{
			
			/*Create a regular expression that accepts alphanumeric characters only.  
			Its length must be six characters long only.*/  
			
			System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun32"));//true  
			System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "kkvarun32"));//false (more than 6 char)  
			System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JA2Uk2"));//true  
			System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun$2"));//false ($ is not matched) 
		}
		
		public static void regexEx5()
		{
			
			/*Create a regular expression that accepts 10 digit numeric characters 
			 starting with 7, 8 or 9 only.*/  
			
			
			System.out.println("by character classes and quantifiers ...");  
			System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9953038949"));//true  
			System.out.println(Pattern.matches("[789][0-9]{9}", "9953038949"));//true  
			  
			System.out.println(Pattern.matches("[789][0-9]{9}", "99530389490"));//false (11 characters)  
			System.out.println(Pattern.matches("[789][0-9]{9}", "6953038949"));//false (starts from 6)  
			System.out.println(Pattern.matches("[789][0-9]{9}", "8853038949"));//true  
			  
			System.out.println("by metacharacters ...");  
			System.out.println(Pattern.matches("[789]{1}\\d{9}", "8853038949"));//true  
			System.out.println(Pattern.matches("[789]{1}\\d{9}", "3853038949"));//false (starts from 3)  
		}
		
		public static void regexEx6()
		{
			System.out.println("? quantifier ....");  
			System.out.println(Pattern.matches("[amn]?", "a"));//true (a or m or n comes one time)  
			System.out.println(Pattern.matches("[amn]?", "aaa"));//false (a comes more than one time)  
			System.out.println(Pattern.matches("[amn]?", "aammmnn"));//false (a m and n comes more than one time)  
			System.out.println(Pattern.matches("[amn]?", "aazzta"));//false (a comes more than one time)  
			System.out.println(Pattern.matches("[amn]?", "n"));//false (a or m or n must come one time)  
			  
			System.out.println("+ quantifier ....");  
			System.out.println(Pattern.matches("[amn]+", "b"));//true (a or m or n once or more times)  
			System.out.println(Pattern.matches("[amn]+", "aaa"));//true (a comes more than one time)  
			System.out.println(Pattern.matches("[amn]+", "aammmnn"));//true (a or m or n comes more than once)  
			System.out.println(Pattern.matches("[amn]+", "aazzta"));//false (z and t are not matching pattern)  
			  
			System.out.println("* quantifier ....");  
			System.out.println(Pattern.matches("[amn]*", "ammmna"));//true (a or m or n may come zero or more times)  
			System.out.println(Pattern.matches("[amn]*", "ammmnabommana"));//false 
			  
		}
		

}
