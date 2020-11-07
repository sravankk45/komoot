package com.komoot.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.komoot.base.TestBase;
import com.komoot.pages.HomePage;
import com.komoot.pages.LoginPage;
import com.komoot.pages.UserHomePage;

public class KomootTests extends TestBase{
	
	private HomePage homePage;
	private LoginPage loginPage;
	private UserHomePage userHomePage;
	
	
	@BeforeSuite
	public void setUp() {
		homePage=new HomePage(driver);
		loginPage=new LoginPage(driver);
		userHomePage=new UserHomePage(driver);
		
	}
	
	@BeforeTest
	public void login() {
		driver.get(getBaseUri());
		homePage.clickAcceptCookiesButton();
		homePage.clickLoginButton();
		loginPage.enterEmailAddress(getEmailAddress());
		loginPage.clickContinueButton();
		loginPage.enterPassword(getPassword());
		loginPage.clickLoginButton();
		
	}
	
	@Test
	public void Test1() {
		
	}
	
	@AfterTest
	public void logout() {
		userHomePage.clickDropDownLink();
		userHomePage.clickLogoutLink();
		
	}

}
