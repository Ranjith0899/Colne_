package com.selenium.task;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		driver.manage().deleteAllCookies();
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		System.out.println("URL : "+url);
		System.out.println("Web title : "+title);
		driver.navigate().to("https://www.facebook.com");
		String naviUrl = driver.getCurrentUrl();
		String naviTitle = driver.getTitle();
		System.out.println("URL after navigation : "+naviUrl);
		System.out.println("Web title after navigation : "+naviTitle);
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		Dimension di = new Dimension(750, 750);
		driver.manage().window().setSize(di);
		Thread.sleep(5000);
	    driver.quit();
		
	}
}
