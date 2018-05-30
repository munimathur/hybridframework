package com.vil.web.init;

import org.openqa.selenium.WebDriver;



public class InitializePages {
	
	protected WebDriver driver;
	//public static LoginPage o_loginPage;
	
	
	public InitializePages(WebDriver driver) {
		this.driver = driver;
		//o_loginPage = new LoginPage(driver);
		
	}

}
