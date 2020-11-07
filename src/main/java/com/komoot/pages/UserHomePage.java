package com.komoot.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserHomePage {
	
	@FindBy(xpath="//a[@data-toggle='dropdown']")
	private WebElement dropDownLink;
	
	@FindBy(xpath="//a[@href='/logout']")
	private WebElement logoutLink;
	
	//Initializing the Page Objects:
		public UserHomePage(WebDriver driver){
			PageFactory.initElements(driver, this);
		}
		public void clickDropDownLink() {
			dropDownLink.click();
			
		}
		public void clickLogoutLink() {
			logoutLink.click();
		}
		

}
