package com.test.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleResults {

	WebDriver driver = new ChromeDriver();

	@BeforeTest
	public void setting() {
		System.setProperty("webdriver.chrome.driver", "/Users/ravimaddali/Desktop/chromedriver");
		driver.manage().window().maximize();
		driver.get("www.google.com");
		String Title = driver.getTitle();
		Assert.assertEquals(Title, "Google");
	}

	@Test
	public void validateResults() {
		GoogleSearch search = new GoogleSearch(driver);
		search.typeSearch();
		search.clickSearch();
	}
@AfterTest
public void quit(){
	driver.quit();
}
}
