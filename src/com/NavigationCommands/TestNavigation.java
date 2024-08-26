package com.NavigationCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNavigation {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver;
		System.setProperty("webdriver.chrome.driver", "./ChromeDriverJars/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.hollandandbarrett.com/u/login");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.google.co.in/");
		url = driver.getCurrentUrl();
		System.out.println(url);
		
		Thread.sleep(5000);
		driver.navigate().back();
		url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.navigate().forward();
		url = driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		url = driver.getCurrentUrl();
		System.out.println(url);
		

		//driver.close();   only current interface of browser
		driver.quit();// all browser instances
	}
}
