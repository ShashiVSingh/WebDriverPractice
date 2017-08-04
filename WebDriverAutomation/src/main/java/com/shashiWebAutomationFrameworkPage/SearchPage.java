package com.shashiWebAutomationFrameworkPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SearchPage {
WebDriver driver;
	
	public SearchPage(WebDriver driver){
		this.driver=driver;
	}
	
	public String SearchPageTitle(){
		return driver.getTitle();
		
	}
	
	public SearchResultPage search(){
		WebElement selectDropDown = driver.findElement(By.id("site-search-category-select"));
		Select select = new Select(selectDropDown);
		System.out.println("Default selected  option: "+ select.getFirstSelectedOption().getText());
		select.selectByVisibleText("Doctors");
		List<WebElement> Options = select.getOptions();
		for(WebElement elm : Options){
			System.out.println("Option : "+elm.getText());
		}
		
		WebElement element = driver.findElement(By.id("kp-site-search-input"));
		element.sendKeys("Doctors");
		
		driver.findElement(By.id("kp-site-search-button")).click();
		return new SearchResultPage(driver);
		
		
	}

}
