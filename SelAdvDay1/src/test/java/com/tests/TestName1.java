package com.tests;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestName1 {
	
@Test	
public void testhdfc() {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_b7a.03.26\\Downloads\\chromedriver_win32\\chromedriver.exe" );
	 WebDriver driver = new ChromeDriver();
	  driver.get("http://hdfcbank.com");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  Actions action = new Actions(driver);
	  action.moveToElement(driver.findElement(By.xpath("//a[@href='/personal/products']"))).
	  moveToElement(driver.findElement(By.xpath("//a[@href='/personal/products/demat']"))).
	  moveToElement(driver.findElement(By.xpath("//a[@href='/personal/products/demat/demat-account']"))).click().perform();
	  String title = driver.getTitle();
	  Assert.assertTrue(title.contains("Demat Account"));
	  
}
}
