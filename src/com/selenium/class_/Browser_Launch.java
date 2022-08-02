package com.selenium.class_;

import java.sql.Array;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Browser_Launch   {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/live-cricket-scores");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[.='Live Score']")).click();
        Thread.sleep(10000);
        List<String> l = new ArrayList<String>();
        List<String> m = new ArrayList<String>();
        List<WebElement> row = driver.findElements(By.xpath("//div[@class='cb-min-inf cb-col-100 ng-scope']/div"));
        for (int i = 0; i <row.size()-3; i++) {	
         int  x =i+1;
         List<WebElement> con = driver.findElements(By.xpath("//div[@class='cb-min-inf cb-col-100 ng-scope']/div["+x+"]/div"));
         for (int j = 0; j < con.size(); j++) {
        	 if (j<6) {
        		 l.add(con.get(j).getText());
				
			} 
        	 else {
       		 m.add(con.get(j).getText());
				
			}
        	 }
        }
      List a [] = {l,m};
      
      for (int i = 0; i <a.length; i++) {
			for (int j = 0; j <a[i].size(); j++) {
				System.out.print(a[i].get(j));
				if (j<a[i].size()-1) {
					System.out.print(" - ");
					}}
			System.out.println();
			
		}
	
	}}

    