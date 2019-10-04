package com.qa.automation.falconUI.constants;

import java.io.File;

public class Constant 
{
	public final static String USERS_HOME = System.getProperty("user.dir") + File.separator;

	public final static String PROJECT_BASE_PATH = System.getProperty("user.dir");

	public final static long PAGE_LODE_TIMEOUT = 3;

	public final static long IMPLICIT_WAIT = 30;



	public final static String CREDENTCIAL_HOME = USERS_HOME + "src/main/resources"+ File.separator+"testdata"+File.separator;

	public final static String CREDENTCIAL_FILE = CREDENTCIAL_HOME + "facebook_credentcials.xlsx";
	
	public final static String FBPOSTPATH_HOME = USERS_HOME + "src/main/resources"+ File.separator+"locators"+File.separator;

	public final static String FBPOSTPATH_FILE = FBPOSTPATH_HOME + "fbpost_path.properties";

	
	
}
