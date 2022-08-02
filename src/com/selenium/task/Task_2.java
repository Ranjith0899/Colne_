package com.selenium.task;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Task_2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https:\\www.instagram.com");
		driver.manage().deleteAllCookies();
		String currentUrl = driver.getCurrentUrl();
		String title = driver.getTitle();
		driver.navigate().to("https:\\www.facebook.com");
		String naviUrl = driver.getCurrentUrl();
		String naviTitle = driver.getTitle();
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		System.out.println(" Current web page URL : "+currentUrl);
		System.out.println(" Web page TITLE : "+title);
		System.out.println(" Crrent web page URL after navigation : "+naviUrl);
		System.out.println(" Web page TITLE after navigation : "+naviTitle);
		Dimension di = new Dimension(800, 800);
		driver.manage().window().setSize(di);
		Thread.sleep(5000);
		driver.quit();
		
		

	}

}
