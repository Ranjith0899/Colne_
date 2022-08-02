package com.selenium.task;

public class MyExceptions extends Exception {
	public  MyExceptions(boolean flag,String a)  {
		
	if (flag=false) {
		System.err.println("The  WebElement "+a+" is not enabled");
		
		}		
	else {
		System.out.println("The  WebElement "+a+" is enabled");
	}		
	}

	}
