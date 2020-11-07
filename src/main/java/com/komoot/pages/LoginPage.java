package com.komoot.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//Page Factory
	
	@FindBy(id="email")
	private WebElement emailTextBox;
	
	@FindBy(xpath="//span[contains(text(),'Continue with Email')]")
	private WebElement continueButton;
	
	@FindBy(id="password")
	private WebElement passwordTextBox;
	
	@FindBy(xpath="//span[contains(text(),'Log In')]")
	private WebElement loginButton;
	
	//Initializing the Page Objects:
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void enterEmailAddress(String emailAddress) {
		emailTextBox.sendKeys(emailAddress);
	}
	public void clickContinueButton() {
		continueButton.click();
	}
	public void enterPassword(String password) {
		passwordTextBox.sendKeys(password);
	}
	public void clickLoginButton() {
		loginButton.click();
	}

}
