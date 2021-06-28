package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import com.automation.utility.BrowserFactory;
import com.automation.utility.ConfigDataProvider;

public class BaseClass {
	public WebDriver driver;
	public ConfigDataProvider config;

	@BeforeSuite
	public void setUpSuite() {
		config = new ConfigDataProvider();
	}

	@AfterClass
	public void tearDown() {
		BrowserFactory.quitBrowser(driver);
	}
}