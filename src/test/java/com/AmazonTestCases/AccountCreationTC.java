package com.AmazonTestCases;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.amazonPageObjects.AccountCreationObjects;
import com.utility.test.ExcelTestData;
@Listeners(com.AmazonTestCases.TestListener.class)
public class AccountCreationTC extends AmazonBase {
	//AccountCreationObjects account=new AccountCreationObjects(driver);
	
	@DataProvider
	public Iterator<Object[]> getTestData() {
	ArrayList<Object[]>testData=ExcelTestData.excelsetup();
	return testData.iterator();
		
		
	}
	
	@Test
	public void navigateToAccountFrm() throws Exception {
		//String s = "GFG";
		driver.get(url);
		Thread.sleep(3000);
		AccountCreationObjects account=new AccountCreationObjects(driver);
		account.clickEvent();
	}
	
	@Test(dataProvider ="getTestData")
public void validAccountcreationTC(String Yournm, String mobile, String eamil, String pwd) {
		
		
	AccountCreationObjects account=new AccountCreationObjects(driver);
	//account.clickEvent();
	
	account.accountCreationInput(Yournm, mobile, eamil, pwd);
	driver.navigate().refresh();
	
}
	
	
	
}
