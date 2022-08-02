package com.selenium.task;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.asm.Advice.AllArguments;

public class Task_9 {
	public static Select s0, s1, s2, s3;
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, MyExceptions_, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/dropdowns");
		WebElement fruits = driver.findElement(By.xpath("//select[@id='fruits']"));
		s0 = new Select(fruits);
		boolean multiple = s0.isMultiple();
		new MyExceptions_(multiple, "Fruits"); // MyExceptuon_
		System.out.println("Options in Fruits");
		List<WebElement> all_Fruits = s0.getOptions();
		for (WebElement fruits_ : all_Fruits) {
			System.out.println(fruits_.getText());
		}
		for (WebElement fru : all_Fruits) {
			String frui = fru.getText();
			if (frui.equalsIgnoreCase("mango")) {
				System.out.println(frui + " is selected in fruits ");
				s0.selectByVisibleText(frui);
			}
		}
		WebElement supe = driver.findElement(By.xpath("//select[@id='superheros']"));
		s1 = new Select(supe);
		boolean multiple1 = s1.isMultiple();
		new MyExceptions_(multiple1, "SUPER HEROS");
		List<WebElement> supers = s1.getOptions();
		System.out.println("Options in Super Heros");
		for (int k = 0; k < supers.size(); k++) {
			System.out.println(supers.get(k).getText());
		}
		for (int i = 0; i < supers.size(); i++) {
			String supes = supers.get(i).getText();
			if (supes.equalsIgnoreCase("batman") || supes.equalsIgnoreCase("daredevil")
					|| supes.equalsIgnoreCase("Spider-Man")) {
				System.out.println(supes + " is selected in Super Heros ");
				s1.selectByVisibleText(supes);
			}
		}
		WebElement langu = driver.findElement(By.xpath("//select[@id='lang']"));
		s2 = new Select(langu);
		boolean multiple2 = s2.isMultiple();
		new MyExceptions_(multiple2, "Language");
		List<WebElement> langus = s2.getOptions();
		System.out.println("Options in Language");
		for (WebElement l : langus) {
            
			System.out.println(l.getText());

		}
		for (int j = 0; j < langus.size(); j++) {
			String lang = langus.get(j).getText();
			if (lang.equalsIgnoreCase("java")) {
				System.out.println(lang + " is selected in language");
				s2.selectByVisibleText(lang);
			}
		}
		WebElement co = driver.findElement(By.xpath("//select[@id='country']"));
		s3 = new Select(co);
		boolean multiple4 = s3.isMultiple();
		new MyExceptions_(multiple4, "Country");
		List<WebElement> con = s3.getOptions();
		System.out.println("Options in Country");
		for (WebElement c : con) {
			System.out.println(c.getText());
		}
		for (WebElement coun : con) {
			String count = coun.getText();
			if (count.equalsIgnoreCase("india")) {
				System.out.println(count + " is selected in country ");
				s3.selectByVisibleText(count);

			}
		}
		TakesScreenshot tkss = (TakesScreenshot) driver;
		File source = tkss.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Screenshot_\\drodown.png");
		FileUtils.copyFile(source, destination);
		driver.quit();
	}

}
