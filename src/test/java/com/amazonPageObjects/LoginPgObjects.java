package com.amazonPageObjects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPgObjects {
	
	
WebDriver ldriver;

public LoginPgObjects(WebDriver driver) {
	
	ldriver=driver;
	PageFactory.initElements(driver, this);
	
}

@FindBy(xpath = "//*[@id=\"twotabsearchtextbox\"]")//*[@id="twotabsearchtextbox"]
//*[@id="twotabsearchtextbox"]
WebElement searchBox;

@FindBy(xpath="//*[@class='nav-a nav-a-2   nav-progressive-attribute']")
WebElement signintab;

@FindBy (className = "nav-action-inner")
WebElement signbtn;               


@FindBy (name="email")
WebElement emailinput;

@FindBy(id="continue")

WebElement contineubtn;

@FindBy(name="password")
WebElement pwd;

@FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div/div[1]/div/div/div/div/ul/li/span")
WebElement loginfailed;

@FindBy(id="signInSubmit")
WebElement signinbtn;

@FindBy (xpath = "//*[@id=\"nav-link-accountList\"] ")
WebElement accountlist;

@FindBy(xpath = "//*[@id=\"nav-item-signout\"]/span")
WebElement signoutbtn;

public void search() {
	searchBox.sendKeys("Sameer");
	System.out.println("Search called");
}


  public void clicksininbtn() 
  { signintab.click(); }
  
  public void setemail(String email) { emailinput.sendKeys(email);
  
  }
  public void contineu() {
	  contineubtn.click();
  }
  
  public void setpwd(String password) { pwd.sendKeys(password);
  
  //String loginError=loginfailed.getText();
//return loginError;
  }
  
  public void loginSubmit() {
  
  signinbtn.click(); 
  
  }
  
	
	  public void hoverOnAccountList() {
		  
	  Actions action=new Actions(ldriver);
	  
	  action.moveToElement(accountlist).build().perform();
	  
	  
	  
	  }
	  
	  public void logoutBTNClick() { 
		  signoutbtn.click(); 
	  
	  //System.out.println("=======test====="+title);
	  String actualtitle="Amazon Sign In"; 
	  
	  
	 //return title;
	  
	  }
	 
}
