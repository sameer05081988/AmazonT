package com.amazonPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OnlineShoppingPG {
	WebDriver driver;
	public OnlineShoppingPG(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement searchbox;
	
	public void searchbox() {
		
		searchbox.sendKeys("vivo mobile under 15k");
	}

}
