package com.flipkart_test_yeshwanth.pom;

import org.hamcrest.Matchers;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Validator;

public class FlipkarthomeTestPage
		extends
			WebDriverBaseTestPage<com.qmetry.qaf.automation.ui.api.WebDriverTestPage> {

	@FindBy(locator = "flipkarthomepage.category.lnk")
	private QAFWebElement flipkarthomepageCategoryLnk;
	@FindBy(locator = "flipkarthomepage.subcategory.lnk")
	private QAFWebElement flipkarthomepageSubcategoryLnk;
	@FindBy(locator = "flipkarthomepage.popup.btn")
	private QAFWebElement flipkarthomepagePopupBtn;
	@FindBy(locator = "flipkarthomepage.viewall.lnk")
	private QAFWebElement flipkarthomepageViewAllLnk;
	@FindBy(locator = "lnk.sortByPriceLowToHigh.searchresultpage")
	private QAFWebElement lnkSortByPriceLowToHighSearchresultpage;

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getFlipkarthomepageCategoryLnk() {
		return flipkarthomepageCategoryLnk;
	}
	
	public QAFWebElement getLnkSortByPriceLowToHighSearchresultpage() {
		Reporter.log("click low");
		return lnkSortByPriceLowToHighSearchresultpage;
	}

	public QAFWebElement getFlipkarthomepageSubcategoryLnk() {
		return flipkarthomepageSubcategoryLnk;
	}

	public QAFWebElement getFlipkarthomepagePopupBtn() {
		return flipkarthomepagePopupBtn;
	}
	
	public QAFWebElement getFlipkarthomepageViewAll() {
		return flipkarthomepageViewAllLnk;
	}
	
	
	public void openApplication()
	{
		driver.get("/");
	}
	
	public void verifyHomePage()
	{
		Validator.verifyThat(driver.getTitle(), Matchers.containsString("Online Shopping Site for Mobiles, Fashion, Books, Electronics, Home Appliances and More"));
	}
	
	public void clickCategory(String Menu)
	{
		getFlipkarthomepagePopupBtn().click();
		QAFExtendedWebElement category=new QAFExtendedWebElement(String.format(ConfigurationManager.getBundle().getString("flipkarthomepage.category.lnk"), Menu));
		category.waitForVisible();
		Actions action=new Actions(driver);
		action.moveToElement(category).perform();
	}
	
	public void clickSubCategory(String subMenu)
	{
		QAFExtendedWebElement subCategory=new QAFExtendedWebElement(String.format(ConfigurationManager.getBundle().getString("flipkarthomepage.subcategory.lnk"), subMenu));
		subCategory.waitForVisible();
		subCategory.click();
	}
	
	public void clickViewAll()
	{
		getFlipkarthomepageViewAll().click();
	}
	
	public void clickOnSortByPriceLowToHigh()
	{
		getLnkSortByPriceLowToHighSearchresultpage().click();
	}
	

}
