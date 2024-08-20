package com.BrowserCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestBrowserCommands {
	WebDriver driver;
	@Test
	public void BrowserCommandTest() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriverJars/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.hollandandbarrett.com/u/login");
		driver.manage().window().maximize();

		System.out.println(driver.getTitle());
		
//		String pageSource = driver.getPageSource();// gets the html code for the page
//		System.out.println(pageSource);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.quit();
	}
}
