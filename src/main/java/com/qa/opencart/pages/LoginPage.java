package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.opencart.utils.Constants;
import com.qa.opencart.utils.ElementUtil;

public class LoginPage {
	
	private WebDriver driver;
	private ElementUtil eleutil;
	
	//1. Private by locators:
	private By emailId = By.id("user-name");
	private By password = By.id("password");
	private By logninBtn = By.id("login-button");
//	private By forgotPwd = By.id("web_forgot_password_link");
	
	//2. public page constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		eleutil = new ElementUtil(driver);
		
	}
	
	//3. public page actions:

	public String getLoginPageTitle() {
		return eleutil.waitForTitleIs(Constants.DEFAULT_TIME_OUT, Constants.LOGIN_PAGE_TITLE);
//		return driver.getTitle();
	}
	
	public String getLoginPageUrl() {
		eleutil.waitForUrl(Constants.DEFAULT_TIME_OUT, Constants.LOGIN_PAGE_FRACTION_URL);
		return driver.getCurrentUrl();
	}
	
//	public boolean isForgotPwdLinkExist() {
//		return driver.findElement(forgotPwd).isDisplayed();
//	
//	}
	
	public InventoryPage doLogin(String un, String pwd) {
//		driver.findElement(emailId).sendKeys(un);
//		driver.findElement(password).sendKeys(pwd);
//		
//		driver.findElement(logninBtn).click();
		
		eleutil.waitForElementToBeVisible(emailId, Constants.DEFAULT_TIME_OUT).sendKeys(un);
		eleutil.doSendKeys(password, pwd);
		eleutil.doClick(logninBtn);
		return new InventoryPage(driver);
	}
	
	public void clickCreateAnAccount() {
		driver.findElement(By.xpath("//a[@href=\"/account/register\"]")).click();
	}
	
	
	
}
