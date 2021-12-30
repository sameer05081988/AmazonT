package com.amazonPageObjects;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AmazonTestCases.AmazonBase;

public class AccountCreationObjects {

	WebDriver ldriver;
	
	
	public AccountCreationObjects(WebDriver driver) {
		
	ldriver=driver;
	PageFactory.initElements(driver,this);
	
	}
	@FindBy(xpath="//a[@class='nav-a nav-a-2   nav-progressive-attribute']")
	WebElement signintab;
	
	@FindBy(xpath="//span[text()='Sign in']")
	WebElement signbtn;
	
	@FindBy(xpath="//a[@id='createAccountSubmit']")
	WebElement createYourAccountBtn;
	
	@FindBy(xpath="//input[@type='text']")
	WebElement yourNmtexbox;
	
	@FindBy(xpath="//input[@type='tel']")
	WebElement mobile;
	
	@FindBy(xpath="//input[@type='email']")
	WebElement email;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement pwd;
	public void clickEvent() {
		System.out.println("33333333333333"+ldriver.getTitle()+"###############");
		
		  signintab.click(); 
		  //signbtn.click();
		  createYourAccountBtn.click();
		 
		
		
	}
	public void accountCreationInput(String name, String mobileNo, String emailId, String password) {
		yourNmtexbox.sendKeys(name);
		mobile.sendKeys(mobileNo);
		email.sendKeys(emailId);
		pwd.sendKeys(password);
	}
	
	
}
