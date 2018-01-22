package com.flipkart_test_yeshwanth.test;

import org.testng.annotations.Test;

import com.flipkart_test_yeshwanth.pom.FlipkarthomeTestPage;
import com.flipkart_test_yeshwanth.pom.SearchresultTestPage;
import com.qmetry.qaf.automation.core.QAFTestBase;

public class TestFlipkart {
	
	@Test
	public void verifyFlipkart()
	{
		FlipkarthomeTestPage home=new FlipkarthomeTestPage();
		home.openApplication();
		home.verifyHomePage();
		home.clickCategory("Electronics");
		home.clickSubCategory("Motorola");
		home.clickViewAll();
		home.clickOnSortByPriceLowToHigh();
		QAFTestBase.pause(5000);
		
		SearchresultTestPage search=new SearchresultTestPage();
		search.clickByIndex();
		
		
	}

}
