package com.automation.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.automation.pages.BaseClass;
import com.automation.pages.TheInternetPage;
import com.automation.utility.BrowserFactory;

public class TheInternet extends BaseClass {
	@Test
	public void openURL() {
		driver = BrowserFactory.startApplication(driver, config.getBrowser(), config.getTinymceURL());
	}

	@Test
	public void sendTest1() {
		TheInternetPage page = PageFactory.initElements(driver, TheInternetPage.class);
		page.typeTest1("test1 \n");
	}

	@Test
	public void sendTest2() {
		TheInternetPage page = PageFactory.initElements(driver, TheInternetPage.class);
		page.typeTest2("test2");
	}
}