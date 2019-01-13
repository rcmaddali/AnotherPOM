package com.setup.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeSeleniumHome {
	WebDriver driver;
	
	public void welcome() {
		WebElement element= driver.findElement(By.linkText("Welcome"));	
		element.click();
	}
	public void ourPassion() {
		WebElement element= driver.findElement(By.linkText("Our Passion"));
		element.click();
	}
	public void menu() {
		WebElement element=driver.findElement(By.linkText("Menu"));
		element.click();
	}
	public void letsTalkTea() {
		WebElement element=driver.findElement(By.linkText("Lets Talk Tea"));
		element.click();
	}
	public void checkOut() {
		WebElement element=driver.findElement(By.linkText("Check Out"));
		element.click();
	}
	

}
