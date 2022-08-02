package com.selenium.class_;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_Url {
	public static WebDriver driver;

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe" );
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(180));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.get("http://www.deadlinkcity.com/");
		List<WebElement> l = driver.findElements(By.tagName("a"));
		for (WebElement web : l) {
	      String att = web.getAttribute("href");
	      if (att==null) {
	    	  continue;
		}
	      else if (att.startsWith("http")) {
	    	  URL u = new URL(att);
	    	  URLConnection o = u.openConnection();
	    	  HttpURLConnection http = (HttpURLConnection) o;
	    	  http.connect();
	    	  int code = http.getResponseCode();
	    	  String err = http.getResponseMessage();
	    	  if (code>=400) {
	    		  System.err.println(code +" - "+err);
				
			}
			
		}
	}

	}}
