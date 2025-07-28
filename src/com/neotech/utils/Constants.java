package com.neotech.utils;

// Part 1-2
// We saved to the different package because we want to use it for other classes.

public class Constants {
	
	public static final String CONFIGURATION_FILEPATH = System.getProperty("user.dir") + "/configs/conf.properties";
	// copied from "Test1" "String filePath = System.getProperty("user.dir") + "/configs/conf.properties";"
	// Need to add "public" (to visible to in another package) and "static" (to visible another static class)
	// Need to add "final" = can't change
	// "/configs/conf.properties" comes from the file url of "conf.properties". 
	public static final int EXPLICIT_WAIT_TIME = 25;
	public static final int IMPLICIT_WAIT_TIME = 20;

}
