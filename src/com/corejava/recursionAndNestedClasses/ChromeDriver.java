package com.corejava.recursionAndNestedClasses;

public class ChromeDriver implements WebDriver, WebDriver.Window,WebDriver.TimeOut{

	
	public void get(String s) {
		System.out.println(" Taking to the Page The page is "+s);
		
	}

	
	public WebDriver.Window manage() {
		
		
		WebDriver.Window ww = new WebDriver.Window() {
			
			
			public void maximize() {
			
				System.out.println(" Maximize method implementation..");
			}
			
		};
		
		return ww;
		
		
	}


	
	public void implicitTimeOut() {
		
		System.out.println(" Inner inerface Timeout method...");
	}


	
	public void maximize() {
		
		System.out.println("Maximize method...method.");
	}


	
	
	
	

}
