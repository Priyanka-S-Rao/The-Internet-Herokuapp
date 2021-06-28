package com.automation.pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShadowDomPage {
	WebDriver driver;

	public ShadowDomPage(WebDriver ldriver) {
		this.driver = ldriver;
	}

	@FindBy(css = "span[slot='my-text']")
	WebElement textLine1;

	@FindBy(xpath = "//ul[@slot='my-text']//li")
	List<WebElement> listText;

	public void getFieldText() {
		System.out.println(textLine1.getText());
	}

	public void getListText() {
		for (WebElement listEle : listText) {
			System.out.println(listEle.getText());
		}
	}
}