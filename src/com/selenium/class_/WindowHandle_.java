package com.selenium.class_;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.HttpURLConnection;
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

public class WindowHandle_ {	 
	private static void roboNewTab() throws AWTException {

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
    Actions a = new Actions(driver);
    a.moveToElement(driver.findElement(By.xpath("//body[@aria-hidden]//img[@alt='letcode']"))).contextClick().build().perform();
    roboNewTab();
    String letCode_Frame = driver.getWindowHandle();
    Set<String> all = driver.getWindowHandles();
    for (String links : all) {
		if (all.equals(letCode_Frame)) { continue;
			}
			driver.switchTo().window(links);
    }
		WebElement link_ = driver.findElement(By.xpath("//body[@aria-hidden='false']//following::div[@class='navbar-start']/a"));
		for (int i = 0; i < 4; i++) {
			a.moveToElement(driver.findElement(By.xpath("//body[@aria-hidden]//img[@alt='letcode']"))).contextClick().build().perform();
	        roboNewTab();
	        }
		Set<String> win = driver.getWindowHandles();
		List<String> s = new ArrayList<String>(win);
		driver.switchTo().window(s.get(2));
		driver.get("http://www.deadlinkcity.com/");
		driver.quit();
			
		}
		
		
	}
    










