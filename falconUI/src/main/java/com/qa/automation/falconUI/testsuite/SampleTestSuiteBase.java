/***
 *
 */
package com.qa.automation.falconUI.testsuite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.atmecs.falcon.automation.ui.selenium.Browser;
import com.atmecs.falcon.automation.util.logging.LogLevel;
import com.atmecs.falcon.automation.util.logging.LogManager;
import com.atmecs.falcon.automation.util.parser.PropertyParser;
import com.qa.automation.falconUI.constants.PropertyFileProvider;

public class SampleTestSuiteBase {
	
	
	
	protected Browser browser;
    
	protected static PropertyFileProvider propReader = PropertyFileProvider.getInstance();
	
	protected static String emailid=propReader.getValue("loc.input.gmailaddr");
	protected static String psw=propReader.getValue("loc.input.password");

	protected static String loginBtn=propReader.getValue("loc.input.login");
	protected static String postBtn=propReader.getValue("loc.button.post");
	
	protected static String postMsg=propReader.getValue("loc.link.post_msg");


	
    @BeforeSuite
    public void preSetup() {
    	
    	/*ChromeOptions options = new ChromeOptions();

		options.addArguments("--disable-notifications");
		
		WebDriver driver =new ChromeDriver(options);*/	
    	
        browser = new Browser();
        LogManager.setLogLevel(LogLevel.valueOf(PropertyParser.readEnvOrConfigProperty("LOG_LEVEL")));
    }

    @AfterSuite
    public void teardown() {
        browser.closeBrowser();
    }

}