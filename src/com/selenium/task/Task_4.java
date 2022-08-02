package com.selenium.task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement emailTxt = driver.findElement(By.id("email"));
		emailTxt.sendKeys("jith123@gmail.com");
		WebElement passTxt = driver.findElement(By.id("pass"));
		passTxt.sendKeys("12345678910");
	    WebElement linkTxt =driver.findElement(By.linkText("Forgotten password?"));
		linkTxt.click();
		driver.navigate().back();
		WebElement createPageLink = driver.findElement(By.linkText("Create a Page"));
		createPageLink.click();
		WebElement getStartedBut = driver.findElement(By.className("_43rm"));
		getStartedBut.click();
		Thread.sleep(5000);
		driver.quit();
	}

}
