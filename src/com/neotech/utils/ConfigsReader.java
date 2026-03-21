package com.neotech.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

// Part 1-3

public class ConfigsReader {
	
	//check exception, try-catch, or declaration
	//encapsulation
	
	private static Properties prop;
	// This used to be under try, but we've moved here because this is a local variable.
	// We only can use it in the same method but we want to use it for another method in the same class.
	// Need to be "static" to make it accessible.
	// Added "private" to not accessible from other classes.
	// = Encapsulation
	

	/**
	 * This method will read the properties file
	 * 
	 * @param filePath
	 * @throws FileNotFoundException
	 */
	
	// Type "//*" and Enter to make the documentation above.
	// "void" does not return anything.
	
	public static void readProperties(String filePath) {

		try {
			FileInputStream fileIS = new FileInputStream(filePath);
			prop = new Properties();
			prop.load(fileIS);
		} catch (FileNotFoundException e) {
			System.out.println("The file path is wrong!!!");
		} catch (IOException e) {
			System.out.println("I couldn't read the file!!!");
		}

	}

	/**
	 * This method will return the value for a specific key
	 * 
	 * @param String key
	 * @return String value
	 */
	
	// key = "url", "browser" on "conf.properties" file.
	// "String" means we want get a return with String.
	public static String getProperty(String key) {
		return prop.getProperty(key);
	}

}
