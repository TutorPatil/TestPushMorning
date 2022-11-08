package com.corejava.recursionAndNestedClasses;

public interface WebDriver {

	public abstract void get(String s);
	
	public Window manage();
	
	
	interface Window
	{
		public void maximize();
		
	}
	
	
	static interface TimeOut{
		
		public void implicitTimeOut();
		
	}


	
	
}
