package com.amazonPageObjects;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	
	@FindBy(xpath="//span[@class='a-size-base-plus a-color-base s-medium-weight-text'][text()='Customer Reviews']")
	WebElement custReview;
	
	@FindBy(xpath="//h2[@class='a-carousel-heading a-inline-block'][text()='Your browsing history']")
	WebElement browsinghistory;
	
	@FindBy(xpath = "//a[@aria-label='Your browsing history - View or edit your browsing history'][text()='View or edit your browsing history']")
	WebElement yourBrowsingHisLink;
	
	
	
public void scroll() {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	/*scroll to perticular value*/
	
	js.executeScript("window.scrollBy(0,7650)", "");
	
	/*or scroll to specific element*/
	//js.executeScript("arguments[0].scrollIntoView();", custReview);
	
	//If element is found because if that element is not render
	js.executeScript("arguments[0].scrollIntoView();", browsinghistory);
	//yourBrowsingHisLink.click();
	
}



public void yourBrowsingHistory() {
	yourBrowsingHisLink.click();
	WebDriverWait wait =new WebDriverWait(driver, 30);
	 wait.until(ExpectedConditions.titleContains("Amazon.in - Your Browsing History"));
	String title1=driver.getTitle();
	System.out.println("History page title is  : "+title1);
	
}
}
