package com.selenium.class_;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frame_ {
	 private static void
	     roboNewTab() throws AWTException {
		 Robot r = new Robot();
		 r.keyPress(KeyEvent.VK_DOWN);
		 r.keyRelease(KeyEvent.VK_DOWN);
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
     	
	}
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(180));
		driver.get("https://www.letcode.in/frame");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.switchTo().frame("firstFr");
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("Ranjith");
		driver.findElement(By.xpath("//input[@name='lname']")).sendKeys("rgfyfut@gmail.com");
		WebElement in = driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
        driver.switchTo().frame(in);
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("dsfghjkl@gmail.com");
        driver.switchTo().defaultContent();
        driver.quit();

	}

}
