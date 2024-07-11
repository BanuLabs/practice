package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.utils.Constants;
import com.qa.opencart.utils.ElementUtil;

public class InventoryPage {
	
	private WebDriver driver;
	private ElementUtil eleutil;
	
	private By products = By.xpath("//div[@class=\"product_label\"]");
	
	public InventoryPage(WebDriver driver) {
		this.driver=driver;
		eleutil = new ElementUtil(driver);
	}

	
	public String getInventoryPageTitle() {
//		return driver.getTitle();
		return eleutil.waitForTitleIs(Constants.DEFAULT_TIME_OUT, Constants.INVENTORY_PAGE_TITLE);
	}
	public boolean isInventoryPageHeaderExist() {
//		return driver.findElement(products).isDisplayed();
		return eleutil.doIsDisplayed(products);
		
	}
	
	
}
