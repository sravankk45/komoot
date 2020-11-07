package com.komoot.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	@FindBy(xpath="//span[contains(text(),'Accept All')]")
	private WebElement acceptCookiesButton;
	
	@FindBy(xpath="//span[contains(text(),'Sign up or Log in')]")
	private WebElement loginButton;
	
	private  WebDriverWait wait;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver,30);
	}
	
	
	public void clickAcceptCookiesButton() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Accept All')]")));
		acceptCookiesButton.click();
	}
	public void clickLoginButton() {
		loginButton.click();
		System.out.print("Performed Click");
	}

}
