package com.shashi.WebDriverAutomation;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.shashiWebAutomationFrameworkBase.BaseTest;
import com.shashiWebAutomationFrameworkPage.HomePage;
import com.shashiWebAutomationFrameworkPage.SearchPage;
import com.shashiWebAutomationFrameworkPage.SearchResultPage;



public class SearchPageTest extends BaseTest {
	
	HomePage hm;
	
	@Test
	public void searchTest(){
		
		hm = new HomePage(driver);
		SearchPage sp = hm.clickSearchButton();
		SearchResultPage spr = sp.search();
		Assert.assertEquals("Search results - Kaiser Permanente", spr.SearchResultsTitle());
		
	}

}
