package com.test.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearch {
	WebDriver driver;
	By searchBox = By.name("q");
	By searchButton = By.name("btnK");
	

	public GoogleSearch(WebDriver driver) {
		this.driver = driver;
	}

	public void typeSearch() {

		driver.findElement(searchBox).sendKeys("First POM Project");
	}

	public void clickSearch() {
		driver.findElement(searchButton).click();
	}
}
