package com.selenium.class_;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Upload_file {
	public static void wait(WebDriver driver ,String xpath,int sec ) {
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(sec));
		w.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(xpath))));
	}
	static WebDriver driver;
	public static void main(String[] args)throws AWTException, InterruptedException {	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	 driver = new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(30000);
	driver.get("https://www.monsterindia.com/");
	driver.findElement(By.xpath("//div[@id='user-signup-actions']//div/a/span[.='Upload Resume']")).click();
	driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:\\Users\\ELCOT\\Documents\\RANJITH\\CUSTOMER CARE.pdf");
	wait(driver, "//input[@id='pop_upload']", 200);
	driver.findElement(By.xpath("//input[@id='pop_upload']")).click();
	Thread.sleep(30000);
    driver.quit();
}}
