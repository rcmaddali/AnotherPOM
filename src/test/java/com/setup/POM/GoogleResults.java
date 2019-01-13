package com.setup.POM;

import java.util.concurrent.TimeUnit;

/**
 * This class contains the test methods
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.setup.POM.GoogleSearch;

public class GoogleResults {

	static WebDriver driver = null;

	@BeforeClass
	public static void checkproperty() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");

	}

	@Test
	public void validateResults()  {
		GoogleSearch search = new GoogleSearch(driver);
		search.typeSearch();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		search.clickSearch();
		driver.quit();
	}

}
