package com.selenium.class_;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Robot_class {
	 private static void roboNewTab() throws AWTException {
		 Robot r = new Robot();
		 r.keyPress(KeyEvent.VK_DOWN);
		 r.keyRelease(KeyEvent.VK_DOWN);
		 r.keyPress(KeyEvent.VK_ENTER);
     	 r.keyRelease(KeyEvent.VK_ENTER);
     	
	}
static WebDriver driver;
public static void main(String[] args)throws AWTException, InterruptedException {	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
 driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.in");
WebElement element = driver.findElement(By.xpath("//div[@id='nav-xshop']/child::a"));
Actions a = new Actions(driver);
driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
List<WebElement> amazon = driver.findElements(By.xpath("//div[@id='nav-xshop']/child::a"));
for (int i = 0; i <amazon.size(); i++) {
	a.contextClick(amazon.get(i)).build().perform();;
	roboNewTab();
	if (amazon.get(i).getText().equals("Prime")) {break;
		}
	Thread.sleep(3000);
}

}
}
