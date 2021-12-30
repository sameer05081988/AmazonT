package com.AmazonTestCases;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.apache.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.amazonPageObjects.LoginPgObjects;

@Listeners(com.AmazonTestCases.TestListener.class)
class AmazonLoginTC extends AmazonBase
{
	
	public static Logger log=Logger.getLogger(AmazonLoginTC.class);
	
	@Test	(priority = 1)
	public void validLogin() {
		
		driver.get(url);
		log.info("Amazon URL received as--->"+url);
		LoginPgObjects lp=new LoginPgObjects(driver);	
		lp.clicksininbtn();
		lp.setemail(usr);
		lp.contineu();
		lp.setpwd(pwd);
		//Thread.sleep(1000);
		/*
		 * if (driver.getTitle()=="Amazon Sign In") {
		 * 
		 * 
		 * String expectedTitle="Your password is incorrect ...";
		 * Assert.assertEquals(false, true); //return b; }
		 */
		
		
		lp.loginSubmit();	
		log.info("Logger Info");
		log.warn("Logger Warning");
		log.error("Logger Error");
		System.out.println("Completed");
				
	}
	
	@Test(priority=2)
	//@Test(invocationCount=2)
	public void getAllLinks() {
		
		List <WebElement> allLinks=driver.findElements(By.tagName("a"));
		
		for(WebElement links:allLinks) {
			
			//System.out.println(links.getText()+" - "+ links.getAttribute("href") );
			
		}
		System.out.println("Links count"+allLinks.size());
	}
	
	
	//@Parameters("browser")
	@Test(priority = 2)
	  public void logOut() { 
		LoginPgObjects lp=new LoginPgObjects(driver);
	  lp.hoverOnAccountList(); 
	  lp.logoutBTNClick(); 
	  String title=driver.getTitle();
	  System.out.println(title);
	  String actualtitle="Amazon Sign In"; 
	  System.out.println(actualtitle);
	  assertEquals(title, actualtitle,"logOut failed assersion"); 
	 
	  
	  
	}
	 
	

}