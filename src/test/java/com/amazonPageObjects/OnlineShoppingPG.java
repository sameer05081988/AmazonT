package com.amazonPageObjects;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OnlineShoppingPG {
	
	  WebDriver driver; public OnlineShoppingPG(WebDriver driver) {
	  
	  this.driver=driver; PageFactory.initElements(driver, this); }
	 
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement searchbox;
	
	
	public void searchAndSelectProduct() {
		
		searchbox.sendKeys("vivo mobile under 15k");
		searchbox.sendKeys(Keys.ENTER);
		
		vivoMobile.click();
		//addToCartBtn.click();
	}
	@FindBy(xpath="//*[@class='a-price-whole'and text()='24,990']")
	
	WebElement vivoMobile;
	
	public void addToCart() {
		String parentWindow=driver.getWindowHandle();
		
		Set<String>allWindos=driver.getWindowHandles();
		ArrayList<String>allWindowList=new ArrayList<String>(allWindos);
	System.out.println("All wondow count is : "+allWindowList.size()+"  "+allWindowList.toString());
	driver.switchTo().window(allWindowList.get(1));
	addToCartBtn.click();
	String title=driver.getTitle();
	System.out.println(title);
	driver.switchTo().window(parentWindow);
	}
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	WebElement addToCartBtn;
	
}
