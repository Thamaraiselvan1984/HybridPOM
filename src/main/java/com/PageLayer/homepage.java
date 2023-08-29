package com.PageLayer;

import org.openqa.selenium.WebDriver;

public class homepage 
{	
	private WebDriver driver;
	
	public homepage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String GetHomePageTitle() 
	{
		return driver.getTitle();
	}

}
