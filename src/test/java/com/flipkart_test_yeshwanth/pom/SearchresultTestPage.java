package com.flipkart_test_yeshwanth.pom;

import java.util.List;
import java.util.TreeMap;

import org.hamcrest.Matchers;

import com.flipkart_test_yeshwanth.component.ProductComponent;
import com.qmetry.qaf.automation.core.QAFTestBase;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.util.Validator;

public class SearchresultTestPage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "lnk.productDetails.searchresultpage")
	private List<ProductComponent> lnkProductDetailsSearchresultpage;

	

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public List<ProductComponent> getLnkProductDetailsSearchresultpage() {
		return lnkProductDetailsSearchresultpage;
	}

	public void verifySearchResultPage()
	{
		getLnkProductDetailsSearchresultpage().get(1).getLnkProductNameSearchresultpage().waitForVisible();
		Validator.verifyThat(getLnkProductDetailsSearchresultpage().size(), Matchers.greaterThan(0));
	}
	
	public void clickByIndex()
	{
		getLnkProductDetailsSearchresultpage().get(0).getLnkProductNameSearchresultpage().click();
	}
	
	public void verifySortedByPrice()
	{
		TreeMap<Integer,Integer> tree=new TreeMap<Integer,Integer>();
		QAFTestBase.pause(4000);
		for(int i=0;i<getLnkProductDetailsSearchresultpage().size();i++)
		{
			getLnkProductDetailsSearchresultpage().get(i).getLnkProductPriceSeearchresultpage().waitForVisible();
			String str=getLnkProductDetailsSearchresultpage().get(i).getLnkProductPriceSeearchresultpage().getText();
			int price=Integer.parseInt(str.substring(1,str.length()));
			tree.put(i,price);
			System.out.println(tree.get(0));
		}
		Validator.verifyThat(tree.get(0),Matchers.greaterThanOrEqualTo((Integer.parseInt(getLnkProductDetailsSearchresultpage().get(0).getLnkProductPriceSeearchresultpage().getText()))));
	}

}
