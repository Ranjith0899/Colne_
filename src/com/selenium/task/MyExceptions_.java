package com.selenium.task;

public class MyExceptions_ extends Exception {
	public MyExceptions_(boolean flag,String a) {
		if (flag==false) {
			System.err.println( a+" is an single Dropdown");	
		}
		else {
			System.err.println( a+" is an Multiple Dropdown");	

		}
		
	}

}
