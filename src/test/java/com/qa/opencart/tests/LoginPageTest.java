package com.qa.opencart.tests;



import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;
import com.qa.opencart.utils.Constants;

public class LoginPageTest extends BaseTest{

@Test
	public void loginPageTitleTest() {
		String actTitle = loginPage.getLoginPageTitle();
		System.out.println("page title : "+ actTitle);
		Assert.assertEquals(actTitle, Constants.LOGIN_PAGE_TITLE);
	}
	
	@Test
	public void loginPageUrlTest() {
		String url = loginPage.getLoginPageUrl();
		System.out.println("login page url :" + url);
		Assert.assertTrue(url.contains(Constants.LOGIN_PAGE_FRACTION_URL));
	}
	
	@Test
	public void loginTest() throws InterruptedException {
		
		ivp = loginPage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
		Assert.assertTrue(ivp.isInventoryPageHeaderExist());
	}
	
	
//	@Test
//	public void forgotPwdLinkTest() {
//		
//		Assert.assertTrue(loginPage.isForgotPwdLinkExist());
//	}
	
//	@Test
//	public void createAccountTest() {
//		loginPage.clickCreateAnAccount();
//		
//	}
}
