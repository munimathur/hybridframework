package com.vil.web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vil.web.utils.TestDataHeadingsConstants;

public class DemoPage implements TestDataHeadingsConstants{
	
	
	WebDriver driver;

	public DemoPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	/*@FindBy(xpath = "//td[text()='From date']/..//span[@class='siebui-icon-datetime']")
	private WebElement eleFromDateDtePck;

	public WebElement getEleFromDateDtePck() {
		return eleFromDateDtePck;
	}*/


}
