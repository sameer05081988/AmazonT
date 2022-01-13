/*

@Author Sameer 

*/
package com.AmazonTestCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class AmazonBase {
	public String url1="//www.google.com";
	public String url="https://www.amazon.in/";
	public String usr="8007307400";
	public String pwd="sameerd1988";
	public static WebDriver driver;
	
	@SuppressWarnings("deprecation")
	@BeforeClass
	public void setup() {
		
		//System.setProperty("webdriver.gecko.driver", ".//driver//geckodriver.exe");
		//System.setProperty("webdriver.edge.driver", ".//driver//msedgedriver.exe");
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		//driver=new FirefoxDriver();
		//driver=new EdgeDriver();
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		System.out.println("@BeforeClass method executed");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
	}
	
	public void takeScreenshot(String testMethodname) {
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(srcFile, new File ("C:\\Users\\Sameer Dhumal\\eclipse-workspace\\AmazonTest\\src\\"
		+"screenshots\\"+testMethodname+".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@AfterClass
	public void tearDown() {
		
		driver.quit();
	}
}
