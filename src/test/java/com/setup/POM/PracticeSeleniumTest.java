package com.setup.POM;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PracticeSeleniumTest {
	static WebDriver driver = null;

	@BeforeClass
	public static void checkproperty() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://www.practiceselenium.com/");

	}

	@Test
	public void isWelcomeLinkworking() {
		PracticeSeleniumHome obj = new PracticeSeleniumHome();
		obj.welcome();
		String welcomeURL = driver.getCurrentUrl();
		AssertJUnit.assertEquals("http://www.practiceselenium.com/welcome.html", welcomeURL);
	}

	@Test
	public void isMenuLinkworking() {
		PracticeSeleniumHome obj = new PracticeSeleniumHome();
		obj.menu();
		String menuURL = driver.getCurrentUrl();
		AssertJUnit.assertEquals("http://www.practiceselenium.com/menu.html", menuURL);
	}

	@Test
	public void isLetsTalkLinkworking() {
		PracticeSeleniumHome obj = new PracticeSeleniumHome();
		obj.letsTalkTea();
		String letsTalkURL = driver.getCurrentUrl();
		AssertJUnit.assertEquals("http://www.practiceselenium.com/let-s-talk-tea.html", letsTalkURL);
	}

	@Test
	public void isCheckoutLinkworking() {
		PracticeSeleniumHome obj = new PracticeSeleniumHome();
		obj.checkOut();
		String checkOutURL = driver.getCurrentUrl();
		AssertJUnit.assertEquals("http://www.practiceselenium.com/let-s-talk-tea.html", checkOutURL);
	}
}
