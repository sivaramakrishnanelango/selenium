package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) throws InterruptedException {
	
		//configuration
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SivaramaKrishnan\\eclipse-workspace\\selenium2pm\\drivers\\chromedriver.exe");
	
	//To launch the Browser
	WebDriver driver = new ChromeDriver();
	
	//to launch the url
	driver.get("https://www.facebook.com/");
	
	//to get the title and print in cosole
	String title = driver.getTitle();
	System.out.println(title);
	
	
	//to maximize the window screens
	driver.manage().window().maximize();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
