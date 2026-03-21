package com.neotech.review02;

import com.neotech.utils.ConfigsReader;
import com.neotech.utils.Constants;

// Part 1-1

public class Test1 {
	
	// 1. Create "confic" folder. -> Create "conf.properties" file
	// 2. Constants
	// 3. ConfigReader
	
	public static void main(String[] args) {
		
		// String filePath = System.getProperty("user.dir") + "/configs/conf.properties";
		// until "Review9..." = different from everyone depending on users and pc.
		// after "/config..." must be the same.
		// this is to read properties.
		
		// Read property file
		// I read the configuration file with only one line.
		ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);
		//ConfigsReader = class, readProperties = method
		
		String browser = ConfigsReader.getProperty("browser");
		System.out.println("browser -> " + browser);
		
		System.out.println("url -> " + ConfigsReader.getProperty("url"));
		System.out.println("username -> " + ConfigsReader.getProperty("username"));
		System.out.println("password -> " + ConfigsReader.getProperty("password"));
	}

}
