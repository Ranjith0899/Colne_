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
public class X_Path {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com");
		driver.manage().window().maximize();
		WebElement inputTxt = driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']"));
		inputTxt.sendKeys("jith12345@gmail.com");
		WebElement inputPass = driver.findElement(By.xpath("//input[contains(@aria-label,'Pass')]"));
        inputPass.sendKeys("12345678");
        TakesScreenshot tkss = (TakesScreenshot) driver;
		File source = tkss.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Screenshot_\\insta.png");
		FileUtils.copyFile(source, destination);
        WebElement loginBut = driver.findElement(By.xpath("//div[text()='Log In']"));
        loginBut.click();
        Thread.sleep(10000);
        File source1 = tkss.getScreenshotAs(OutputType.FILE);
		File destination1 = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Screenshot_\\instaAfterLogin.png");
		FileUtils.copyFile(source1, destination1);
       Thread.sleep(5000);
       WebElement errMsg =  driver.findElement(By.xpath("//p[contains(text(),'The')]"));
       WebElement inputRePass = driver.findElement(By.xpath("(//input[contains(@aria-label,'P')])[2]"));
       inputRePass.sendKeys("12345678910");
       loginBut.click();
       System.out.println("Log In Result  : "+errMsg.getText());
       Thread.sleep(5000);
       driver.quit();
		
	}

}
