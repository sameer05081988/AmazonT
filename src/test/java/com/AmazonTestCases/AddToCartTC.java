package com.AmazonTestCases;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.amazonPageObjects.OnlineShoppingPG;

@Listeners(com.AmazonTestCases.TestListener.class)
public class AddToCartTC extends AmazonBase {

	//AmazonBase ab=new AmazonBase();
	AmazonLoginTC login=new AmazonLoginTC();
	//OnlineShoppingPG hmpage= new OnlineShoppingPG(driver);
	
	@Test
	public void addToCart() {
		//driver.get(url);
		OnlineShoppingPG pg=new OnlineShoppingPG(driver);
		//ab.setup();
		
		login.validLogin();
		
		
		pg.searchAndSelectProduct();
		pg.addToCart();
		pg.scroll();
		
	}
	@Test
	public void checkBrowsingHistory() {
		OnlineShoppingPG pg=new OnlineShoppingPG(driver);
		pg.yourBrowsingHistory();
	}
	
}
