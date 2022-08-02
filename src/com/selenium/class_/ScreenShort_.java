package com.selenium.class_;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShort_ {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		TakesScreenshot tkss = (TakesScreenshot) driver;
		File source = tkss.getScreenshotAs(OutputType.FILE);
		File destination = new File("c:\\Eclipse\\Selenium\\Screenshot_\\screensort_0.png");
		FileUtils.copyFile(source, destination);
		WebElement emailText = driver.findElement(By.id("email"));
		WebElement passText = driver.findElement(By.id("pass"));
		WebElement logInBut = driver.findElement(By.name("login"));
		emailText.sendKeys("jith5544@gmail.com");
		passText.sendKeys("12345678910");
		File source_1 = tkss.getScreenshotAs(OutputType.FILE);
		File destination_1 = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Screenshot_\\screenshot_1.png");
		FileUtils.copyFile(source_1, destination_1);
		logInBut.click();
		File source_2 = tkss.getScreenshotAs(OutputType.FILE);
		File destination_2 = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Screenshort_\\screenshot_2.png");
		FileUtils.copyFile(source_2, destination_2);
		Thread.sleep(5000);
		driver.quit();
		
		
		

	}

}
