package com.setup.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PractiseSeleniumHome {
	WebDriver driver;
	
	public void welcome() {
		WebElement element;
		element= driver.findElement(By.linkText("Welcome"));
		element.click();
	}
	public void ourPassion() {
		WebElement element;
		element= driver.findElement(By.linkText("Our Passion"));
		element.click();
	}
	public void menu() {
		WebElement element;
		element=driver.findElement(By.linkText("Menu"));
		element.click();
	}
	public void letsTalkTea() {
		WebElement element;
		element=driver.findElement(By.linkText("Lets Talk Tea"));
		element.click();
	}
	public void checkOut() {
		WebElement element;
		element=driver.findElement(By.linkText("Check Out"));
		element.click();
	}
	

}
