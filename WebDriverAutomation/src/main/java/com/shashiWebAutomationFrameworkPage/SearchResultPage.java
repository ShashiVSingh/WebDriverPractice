package com.shashiWebAutomationFrameworkPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultPage {
    WebDriver driver;
	
	public SearchResultPage(WebDriver driver){
		this.driver=driver;
	}
	
	public String SearchResultsTitle(){
		return driver.getTitle();
	}
	
	public String searchResultMessage(){
		WebElement element = driver.findElement(By.className("searchResultTotalMessage"));
		return element.getText(); //inner text of an element
	}

}
