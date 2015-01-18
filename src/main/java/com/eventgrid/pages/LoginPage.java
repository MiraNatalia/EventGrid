package com.eventgrid.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eventgrid.data.UserData;

public class LoginPage extends BasicPage {

	@FindBy(id = "Username")
	public WebElement fieldUserName;

	@FindBy(id = "Password")
	public WebElement fieldPassword;

	@FindBy(css = "input.btn.btn-primary")
	public WebElement buttonLogin;

	public LoginPage(WebDriver pDriver) {
		super(pDriver);

	}

	public HomePage loginAS(UserData admin) {

		type(fieldUserName, admin.name);
		type(fieldPassword, admin.password);
		buttonLogin.click();
		return PageFactory.initElements(driver, HomePage.class);

	}

	@Override
	public void open() {
		driver.get(ConfigProperies.getProperty("login.url"));

	}

}
