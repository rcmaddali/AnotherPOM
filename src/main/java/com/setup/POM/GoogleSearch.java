package com.setup.POM;

/**
 * This class contain all element locators
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearch {
	WebDriver driver;
	WebElement element;
	By searchBox = By.name("q");
	By searchButton = By.name("btnK");

	public GoogleSearch(WebDriver driver) {
		this.driver = driver;
	}

	public void typeSearch() {

		driver.findElement(searchBox).sendKeys("Made It after resolving issues");
	}

	public void clickSearch() {
		
		driver.findElement(searchButton).click();
	}
}
