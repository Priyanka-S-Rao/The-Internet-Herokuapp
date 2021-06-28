package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TheInternetPage {
	WebDriver driver;

	public TheInternetPage(WebDriver ldriver) {
		this.driver = ldriver;
	}

	@FindBy(id = "mce_0_ifr")
	WebElement iFrame;

	@FindBy(id = "tinymce")
	WebElement inputBox;

	@FindBy(xpath = "//p[normalize-space()='Text2']")
	WebElement Text2;

	@FindBy(xpath = "//button[@title='Bold']")
	WebElement bold;

	@FindBy(xpath = "//div[@title='Resize']")
	WebElement resizeEle;

	public void typeTest1(String text) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame));
		inputBox.click();
		inputBox.clear();
		inputBox.sendKeys(text);
	}

	public void typeTest2(String text2) {
		driver.switchTo().defaultContent();
		bold.click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame));
		inputBox.click();
		inputBox.sendKeys(text2);
	}
}