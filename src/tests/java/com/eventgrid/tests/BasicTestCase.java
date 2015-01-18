package com.eventgrid.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.eventgrid.data.UserData;

public class BasicTestCase {

	protected static WebDriver driver;

	public UserData admin = new UserData("miranatalia3@gmail.com", "Time4QA230284");

	private String baseUrl;

	protected WebDriver getWebDriver() {
		if (driver == null) {
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		return driver;

	}

	@BeforeTest
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://app.stable.eventgrid.com/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterTest
	public void tearDown() throws Exception {
		driver.quit();
	}

}
