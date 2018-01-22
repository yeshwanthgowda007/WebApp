package com.flipkart_test_yeshwanth.component;

import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class ProductComponent {
	
	@FindBy(locator = "lnk.productDetails.searchresultpage")
	private QAFWebElement lnkProductDetailsSearchresultpage;
	@FindBy(locator = "lnk.productName.searchresultpage")
	private QAFWebElement lnkProductNameSearchresultpage;
	@FindBy(locator = "lnk.productPrice.searchresultpage")
	private QAFWebElement lnkProductPriceSeearchresultpage;
	
	public QAFWebElement getLnkProductDetailsSearchresultpage() {
		return lnkProductDetailsSearchresultpage;
	}
	public QAFWebElement getLnkProductNameSearchresultpage() {
		return lnkProductNameSearchresultpage;
	}
	public QAFWebElement getLnkProductPriceSeearchresultpage() {
		return lnkProductPriceSeearchresultpage;
	}

	

}
