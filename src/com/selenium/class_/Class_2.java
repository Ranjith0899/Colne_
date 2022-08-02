package com.selenium.class_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement emailTxt = driver.findElement(By.id("email"));
		emailTxt.sendKeys("9025001371");
		WebElement passTxt = driver.findElement(By.id("pass"));
		passTxt.sendKeys("1234567");
		WebElement loginBut = driver.findElement(By.name("login"));
	    WebElement linkTxt =driver.findElement(By.linkText("Forgotten password?"));
		linkTxt.click();
		driver.quit();
	
}

}
