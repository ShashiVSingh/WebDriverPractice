package com.shashi.WebDriverAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.shashiWebAutomationFrameworkBase.BaseTest;
import com.shashiWebAutomationFrameworkPage.HomePage;
import com.shashiWebAutomationFrameworkPage.SearchPage;

public class HomePageTest extends BaseTest {
	
	HomePage hm;
	
	@Test
	public void clickSearchButton(){
		WebDriver driver = new ChromeDriver();
		hm = new HomePage(driver);
		SearchPage sp = hm.clickSearchButton();
		//to-do asssertions
		
		Assert.assertEquals("Custom care  & coverage just for you - Kaiser Permanente",sp.SearchPageTitle());
		
	}

}
