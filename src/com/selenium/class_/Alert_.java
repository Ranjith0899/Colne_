package com.selenium.class_;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_ {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/alert");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.findElement(By.xpath("//button[@id='accept']")).click();
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//button[@id='accept']")).click();
        driver.switchTo().alert().dismiss();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//button[@id='confirm']")).click();
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//button[@id='confirm']")).click();
		driver.switchTo().alert().dismiss();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//button[@id='prompt']")).click();
		driver.switchTo().alert().dismiss();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//button[@id='prompt']")).click();
		driver.switchTo().alert().sendKeys("Ranjith");
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//button[@id='modern']")).click();
		driver.findElement(By.xpath("//button[@class='modal-close is-large']")).click();
       Thread.sleep(10000);
       driver.quit();
	}

}
