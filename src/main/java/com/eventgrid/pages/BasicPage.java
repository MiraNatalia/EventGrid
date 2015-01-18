package com.eventgrid.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class BasicPage {

	protected WebDriver driver;

	public BasicPage(WebDriver pDriver) {
		this.driver = pDriver;
	}

	protected void type(WebElement webElement, String text) {
		webElement.clear();
		webElement.sendKeys(text);
	}

	public abstract void open();

	public boolean isElementPresent(WebElement webElement) {
		try {
			webElement.isDisplayed();
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

}
