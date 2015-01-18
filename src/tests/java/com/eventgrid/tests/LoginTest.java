package com.eventgrid.tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.eventgrid.pages.HomePage;
import com.eventgrid.pages.LoginPage;

public class LoginTest extends BasicTestCase {

	private LoginPage loginPage = PageFactory.initElements(getWebDriver(), LoginPage.class);
	private HomePage homePage;

	@Test
	public void testLogin() throws Exception {
		
		loginPage.open();
		homePage = loginPage.loginAS(admin);
		assertTrue(homePage.isLoggedIn());
		homePage.logout();
		assertTrue(homePage.isLoggedOut());
		
		// driver.findElement(By.cssSelector("i.icon-caret-down")).click();
		//assertTrue(isElementPresent(By.linkText("Sign Out")));
	}

	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

//	private boolean isAlertPresent() {
//		try {
//			driver.switchTo().alert();
//			return true;
//		} catch (NoAlertPresentException e) {
//			return false;
//		}
//	}
//
//	private String closeAlertAndGetItsText() {
//		try {
//			Alert alert = driver.switchTo().alert();
//			String alertText = alert.getText();
//			if (acceptNextAlert) {
//				alert.accept();
//			} else {
//				alert.dismiss();
//			}
//			return alertText;
//		} finally {
//			acceptNextAlert = true;
//		}
//	}
}
