package com.komoot.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase{
	
	private static Properties properties;
	protected String baseDir=System.getProperty("user.dir");
	protected static WebDriver driver;
	
	public TestBase() {
		
		try {
			properties=new Properties();
			FileInputStream fileInputStream=new FileInputStream(baseDir+"/src/main/java/com/komoot/config/config.properties");
			System.setProperty("webdriver.chrome.driver", baseDir+"/driver/chromedriver.exe");	
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			properties.load(fileInputStream);
		}
		catch(IOException e) {
		e.printStackTrace();
		}
		
	}
	
	public String getBaseUri() {
		String baseUri=properties.getProperty("baseUri");
		return baseUri;
	}
}