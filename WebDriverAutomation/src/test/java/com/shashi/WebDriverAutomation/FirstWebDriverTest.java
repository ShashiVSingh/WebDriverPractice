package com.shashi.WebDriverAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class FirstWebDriverTest {
	
	@Test
	
	public void loginTest(){
		// creat webdriver object
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Bhushan\\myjava\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhushan\\myjava\\chromedriver.exe");
	//	WebDriver driver = new ChromeDriver();
		
		//load the browser with url
		driver.get("http://whiteboxqa.com");
		//locate the element
		WebElement element = driver.findElement(By.id("loginButton"));
		
		//perform action
		element.click();
		
		//get actual
		 String actual = driver.getTitle();
		 
		 //Assert expected with actual
		 Assert.assertEquals(actual,"QA/QE/SDET Training.");
		 
		 //list of elements 
		 
		 List<WebElement> elements = driver.findElements(By.cssSelector("[class*='nav-item']"));
		 Assert.assertEquals(elements.size(),8);
		 
	}

}
