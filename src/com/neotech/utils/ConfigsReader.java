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

	/**
	 * This method will read the properties file
	 * 
	 * @param filePath
	 * @throws FileNotFoundException
	 */
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
	public static String getProperty(String key) {
		return prop.getProperty(key);
	}

}
