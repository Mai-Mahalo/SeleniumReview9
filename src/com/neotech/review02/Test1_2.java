package com.neotech.review02;

import com.neotech.utils.ConfigsReader;
import com.neotech.utils.Constants;

// For self-study

public class Test1_2 {
	
	public static void main(String[] args) {
		
		ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);
		//ConfigsReader = class, readProperties = method
		
		String browser = ConfigsReader.getProperty("browser");
		System.out.println("browser (variable) -> " + browser);
		
		// or
		System.out.println("browser (just print) -> " + ConfigsReader.getProperty("browser"));
		
		// URL, Username, PW
		System.out.println("URL -> " + ConfigsReader.getProperty("url"));
		System.out.println("Username -> " + ConfigsReader.getProperty("username"));
		System.out.println("Password -> " + ConfigsReader.getProperty("password"));
		
	}

}
