package com.PageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
	    
		private WebDriver driver;
		
		//1. locator
		private By emailid = By.id("email");
		private By Password = By.id("pass");
		private By loginBtn = By.name("login");
		private By forgottenPwd = By.xpath("//a[normalize-space()='Forgotten password?']");
		
		
        
		//2. Constructor of page class:
		public Loginpage(WebDriver driver)
		{
			this.driver = driver;
		}
		
		//3. page actions:
		public String GetLoginPageTitle() {
			return driver.getTitle();
		}
		
		public boolean isForgottenPasswordLinkExist() {
			return driver.findElement(forgottenPwd).isDisplayed();
	    }
		
		public void enterUsername(String username)
		{
			driver.findElement(emailid).sendKeys(username);
		}
		
		public void enterPassword(String pwd) {
			driver.findElement(Password).sendKeys(pwd);
		}
		
		public void clicklogin()  {
			driver.findElement(loginBtn).click();
				}		
}
