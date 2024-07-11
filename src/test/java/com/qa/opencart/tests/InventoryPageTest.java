package com.qa.opencart.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;
import com.qa.opencart.utils.Constants;

public class InventoryPageTest extends BaseTest{

	@BeforeClass
	public void inventoryPageSetup() {
		ivp = loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test
	public void inventoryPageTitleTest() {
		String inventoryPageTitle = ivp.getInventoryPageTitle();
		System.out.println("inventory page title : " + inventoryPageTitle);
		Assert.assertEquals(inventoryPageTitle, Constants.INVENTORY_PAGE_TITLE);
	}
	
	@Test
	public void inventoryPageHeaderTest() {
		Assert.assertTrue(ivp.isInventoryPageHeaderExist());
	}
	
	
}
