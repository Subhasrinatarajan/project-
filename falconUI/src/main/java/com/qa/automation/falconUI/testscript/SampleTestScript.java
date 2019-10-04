package com.qa.automation.falconUI.testscript;

import java.util.concurrent.TimeUnit;

import org.apache.tools.ant.taskdefs.WaitFor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.atmecs.falcon.automation.ui.selenium.Click;
import com.atmecs.falcon.automation.ui.selenium.Find;
import com.atmecs.falcon.automation.ui.selenium.Verify;
import com.atmecs.falcon.automation.ui.selenium.WaitElement;
import com.atmecs.falcon.automation.ui.seleniuminterfaces.IKeys.KeyType;
import com.atmecs.falcon.automation.util.enums.LocatorType;
import com.atmecs.falcon.automation.util.reporter.ReportLogService;
import com.atmecs.falcon.automation.util.reporter.ReportLogServiceImpl;
import com.qa.automation.falconUI.constants.Constant;
import com.qa.automation.falconUI.constants.ExcelDataReader;
import com.qa.automation.falconUI.testsuite.SampleTestSuiteBase;

public class SampleTestScript extends SampleTestSuiteBase {

	private ReportLogService report = new ReportLogServiceImpl(SampleTestScript.class);
	public static WebDriver driver;

	@Test
	@Parameters({ "os", "osVersion", "browser", "browserVersion" })
	public void sampleTest(String os, String osVersion, String br, String browserVersion) throws InterruptedException {
		// write your first test script here
		// sample
		report.info("Opening browser: " + br);
		browser.openURL("https://www.facebook.com/", os, osVersion, br, browserVersion);
		report.info("Maximizing browser window");
		browser.maximizeWindow();

		

		ExcelDataReader config = new ExcelDataReader(Constant.CREDENTCIAL_FILE);
		
		report.info("Enter the user emailid or phone number....");

		browser.getTextField().enterTextField(LocatorType.XPATH, emailid, config.getKeyValue(0, 0, 1));
		
		report.info("Enter the password...");

		browser.getTextField().enterTextField(LocatorType.XPATH, psw, config.getKeyValue(0, 0, 2));
		
		report.info("Login into Facebook.....");

		browser.getClick().performClick(LocatorType.XPATH, loginBtn);

		report.info("Post a 'Hello World!!!'....");
		
		browser.getClick().performClick(LocatorType.XPATH, postMsg);

		browser.getTextField().enterTextField(LocatorType.XPATH, postMsg, "Hello World");

		browser.getClick().performClick(LocatorType.XPATH, postBtn);

		
	}

}
