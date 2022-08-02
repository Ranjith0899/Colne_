package com.selenium.task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class Task_8 {
	public static void main(String[] args) throws InterruptedException,MyExceptions {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com");
Thread.sleep(20000);
WebElement emailTxt = driver.findElement(By.xpath("//input[@id='email'] "));
WebElement passTxt = driver.findElement(By.xpath("//input[@id='pass'] "));
WebElement logBut = driver.findElement(By.xpath("//button[@name='login']"));
boolean email_ = emailTxt.isEnabled();
boolean Pass_= emailTxt.isEnabled();
new MyExceptions(email_, "'Email Textbox'");
new MyExceptions(Pass_,"'Password Textbox'");
emailTxt.sendKeys("rr2897352@gmail.com");
passTxt.sendKeys("1223334444");
Dimension size = emailTxt.getSize();
Point location = emailTxt.getLocation();
Rectangle rect = emailTxt.getRect();
System.out.println("Location of email text box : "+location);
System.out.println("Rectangle of email text box : "+rect);
System.out.println("size of email text box : "+size);
WebElement fbImg = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
String email = emailTxt.getAttribute("value");
String pass = passTxt.getAttribute("value");
System.out.println("Input email : "+email);
System.out.println("Input password : "+pass);
String attribute = fbImg.getAttribute("alt");
System.out.println("Attribute value of alt : "+attribute);
boolean displayed = fbImg.isDisplayed();
if (displayed==true) {
String cssValue = fbImg.getCssValue("font-size");
String cssValue2 = fbImg.getCssValue("height");
String css = fbImg.getCssValue("margin");
String cssValue3 = fbImg.getCssValue("color");
System.out.println("Fornt size : "+cssValue);
System.out.println("Height of img : "+cssValue2);
System.out.println("Margin of img : "+css);
System.out.println("color of img : "+cssValue3);
}
WebElement fbTxt = driver.findElement(By.xpath("//h2[@class='_8eso']"));
String attribute2 = fbTxt.getAttribute("alt");
boolean displayed2 = fbTxt.isDisplayed();
if (displayed2==true) {
String text = fbTxt.getText();
String cssValue4 = fbTxt.getCssValue("font-size");
String cssValue5 = fbTxt.getCssValue("height");
String cssValue6 = fbTxt.getCssValue("margin");
String cssValue7 = fbTxt.getCssValue("color");
System.out.println("Text : "+text);
System.out.println("Fornt size of the text : "+cssValue4);
System.out.println("Fornt height of the text : "+cssValue5);
System.out.println("Fornt margin of the text : "+cssValue6);
System.out.println("Fornt color of the text : "+cssValue7);}
logBut.click();
Thread.sleep(30000);
String idE = driver.findElement(By.xpath("//span[@class='a8c37x1j ni8dbmo4 stjgntxs l9j0dhe7']")).getText();
System.out.println("Account Holder Name : "+idE);
driver.get("https://www.calculator.net/age-calculator.html\r\n");
WebElement el = driver.findElement(By.className("calendarDateInput"));
Select s = new Select(el);
boolean s_Or_m = s.isMultiple();
if (s_Or_m==true) {
	System.out.println("It is multiple Dropdown");	
}
else {
	System.out.println("It is single Dropdown");
}
List<WebElement> options = s.getOptions();

s.selectByIndex(0);
WebElement al = driver.findElement(By.xpath("(//select[@class='calendarDateInput'])[2]" ));
Select s1 = new Select(al);
List<WebElement> options2 = s1.getOptions();
s1.selectByVisibleText("1");
System.out.println("Options in Month");
for (int i = 0; i <options.size(); i++) {
	System.out.println(options.get(i).getText());
	}
System.out.println("Options in dates");

for (WebElement option : options2) {
	System.out.println(option.getText());
	}
WebElement month = s.getFirstSelectedOption();
WebElement date = s1.getFirstSelectedOption();
System.out.println("Option selected in Month : "+month.getText());
System.out.println("Option selected in date : "+date.getText());
driver.quit();


}
}