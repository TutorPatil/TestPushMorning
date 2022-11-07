package com.corejava.finalsession;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFileData {

	public static void main(String[] args) throws IOException {
		
		
		
		System.out.println(readPropertyData("timeout"));
		
		
	}
	
	public static String readPropertyData(String key) throws IOException
	{
		
				
				
				
				File f = new File("configdata.properties");
				
				FileInputStream fio = new FileInputStream(f);
				
				
				Properties prop = new Properties();
				prop.load(fio);
				
				String val = prop.getProperty(key);
				
				
				
				return val;
				
				
	}

}
