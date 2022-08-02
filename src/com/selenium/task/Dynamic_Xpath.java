package com.selenium.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Xpath {
public static WebDriver driver;	
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\AutomationPractice\\Driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://facebook.com");
	WebElement emailTxt = driver.findElement(By.xpath("//div[@id='reg_pages_msg']//preceding::input//following::div//child::div//child::input[@id='email']"));
	WebElement passTxt = driver.findElement(By.xpath("//div[@id='reg_pages_msg']//preceding::input//following::div//child::div//child::input[@id='pass']"));
	emailTxt.sendKeys("rr2897352@gmail.com");
	passTxt.sendKeys("1223334444");
    driver.findElement(By.xpath("//div[@id='passContainer']//descendant::div//following::div/button")).click();
	driver.navigate().to("https://adactinhotelapp.com/");
	Thread.sleep(20000);
	WebElement userId = driver.findElement(By.xpath("//form[@id='login_form']//descendant::td[@width]//following::input[@id='username']"));
	WebElement pass = driver.findElement(By.xpath("//td[@align='center']//preceding::table[@class='login']//child::input[@id='password']"));
	userId.sendKeys("ranjith55");
	pass.sendKeys("554499");
	driver.findElement(By.xpath("//td[@class='login_register']//parent::td//ancestor::td//following::input[@id='login']")).click();
	Thread.sleep(20000);
	driver.findElement(By.xpath("//a[.='Logout']//preceding-sibling::a[.='Search Hotel']//following-sibling::a[starts-with(.,'Booked')]")).click();
	driver.quit();
	
	
}

}
