package com.shashiWebAutomationFrameworkBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	
	protected WebDriver driver;
	@BeforeClass

	
	public void beforeClass(){
		System.out.println("System.getProperty(user.dir)::"+System.getProperty("user.dir"));
		System.setProperty("Webdriver.chrome.driver", System.getProperty("user.dir")+"/resources/drivesr/chromedriver.exe ");
		driver = new ChromeDriver();
		driver.get("https://healthy.kaiserpermanente.org/");
	}
	
	@AfterClass
	public void afterClass(){
		driver.close();  // close the browser that is opened
	}

}


//1 hour