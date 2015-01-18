package com.eventgrid.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasicPage {

	public HomePage(WebDriver pDriver) {
		super(pDriver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(linkText = "Sign out")
	public WebElement linkLogout;

	@FindBy(xpath = "//a[@class = 'login']")
	public WebElement lickLogin;

	@Override
	public void open() {

	}

	public boolean isLoggedIn() {

		return isElementPresent(linkLogout);
	}

	public void logout() {
		linkLogout.click();

	}

	public boolean isLoggedOut() {

		return isElementPresent(lickLogin);
	}
}
