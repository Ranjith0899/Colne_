package com.selenium.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Task_7 {public static void main(String[] args) throws InterruptedException  {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	WebElement emailTxt = driver.findElement(By.xpath("//input[@id='email'] "));
	WebElement passTxt = driver.findElement(By.xpath("//input[@id='pass'] "));
	WebElement logBut = driver.findElement(By.xpath("//button[@name='login']"));
	emailTxt.sendKeys("rr2897352@gmail.com");
	passTxt.sendKeys("1223334444");
	logBut.click();
	Thread.sleep(20000);
	WebElement wel = driver.findElement(By.xpath("//span[text()='Ranjith']"));
    wel.click();
	Thread.sleep(20000);
    WebElement addBio = driver.findElement(By.xpath("//span[text()='Edit Bio']"));
    addBio.click();
    Thread.sleep(10000);
    WebElement entBio = driver.findElement(By.xpath("//textarea[contains(text(),'Nothing to say')]"));
    entBio.clear();
    Thread.sleep(3000);
    entBio.sendKeys("Nothing to say");
    WebElement savBut = driver.findElement(By.xpath("//span[text()='Save']"));
    savBut.click();
    Thread.sleep(5000);
    WebElement ediBut = driver.findElement(By.xpath("//span[text()='Edit details']"));
    ediBut.click();
    Thread.sleep(5000);
    WebElement work = driver.findElement(By.xpath("(//span[@dir='auto'])[46]"));
    work.click();
    Thread.sleep(10000);
    WebElement work1 = driver.findElement(By.xpath("(//span[@dir='auto'])[23]"));
    work1.click();
    Thread.sleep(20000);
    WebElement compTxt = driver.findElement(By.xpath("(//input[@dir='ltr'])[2]"));
    WebElement posTxt = driver.findElement(By.xpath("(//input[@dir='ltr'])[3]"));
    WebElement citTxt = driver.findElement(By.xpath("(//input[@dir='ltr'])[4]"));
    WebElement desTxt = driver.findElement(By.xpath("(//textarea[@dir='ltr'])"));
    WebElement cheBox = driver.findElement(By.xpath("(//input[@dir='ltr'])[5]"));
    compTxt.sendKeys("ABC");
    posTxt.sendKeys("ABC");
    citTxt.sendKeys("Cuddalore");
    desTxt.sendKeys("ABCDEFGH");
    WebElement year = driver.findElement(By.xpath("//div[@aria-haspopup='listbox']"));
    year.click();
    Thread.sleep(10000);
    WebElement yearTxt = driver.findElement(By.xpath("(//span[text()='2022'])"));
    yearTxt.click();
    WebElement saveBut = driver.findElement(By.xpath("(//span[text()='Save'])"));
    saveBut.click();
    Thread.sleep(10000);
    WebElement univ = driver.findElement(By.xpath("(//span[@dir='auto'])[33]"));
    univ.click();
    Thread.sleep(10000);
    WebElement schTxt = driver.findElement(By.xpath("(//input[@dir='ltr'])[2]"));
    WebElement curTxt = driver.findElement(By.xpath("(//input[@dir='ltr'])[4]"));
    WebElement degTxt = driver.findElement(By.xpath("(//input[@dir='ltr'])[9]"));
    WebElement desTxt1 = driver.findElement(By.xpath("(//textarea[@dir='ltr'])"));
    WebElement year1 = driver.findElement(By.xpath("//div[@aria-haspopup='listbox']"));
    WebElement year2 = driver.findElement(By.xpath("(//div[@aria-haspopup='listbox'])[2]"));
    WebElement saveBut1 = driver.findElement(By.xpath("(//span[text()='Save'])"));
    schTxt.sendKeys("SRMMHSS");
    curTxt.sendKeys("Bio");
    degTxt.sendKeys("BE.Mech");
    desTxt1.sendKeys("Oru Payanum illai");
    year1.click();
    Thread.sleep(50000);
    WebElement yearTxt1 = driver.findElement(By.xpath("(//span[text()='2016'])"));
    yearTxt1.click();
    Thread.sleep(3000);
    WebElement yearTxt2 = driver.findElement(By.xpath("(//span[text()='2020'])"));
    yearTxt2.click();
    saveBut1.click();
    Thread.sleep(60000);
    driver.quit();
    
    



  

    
	
	}

}
