package com.automation.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.automation.pages.BaseClass;
import com.automation.pages.ShadowDomPage;
import com.automation.utility.BrowserFactory;

public class ShadowDom extends BaseClass {
	@Test
	public void openURL() {
		driver = BrowserFactory.startApplication(driver, config.getBrowser(), config.getShadowdomURL());
	}

	@Test
	public void printText() {
		ShadowDomPage page2 = PageFactory.initElements(driver, ShadowDomPage.class);
		page2.getFieldText();
	}

	@Test
	public void printListText() {
		ShadowDomPage page2 = PageFactory.initElements(driver, ShadowDomPage.class);
		page2.getListText();
	}
}