package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample4 {

	public static void main(String[] args) {
		
		//configuration
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SivaramaKrishnan\\eclipse-workspace\\selenium2pm\\drivers\\chromedriver.exe");
		
		//to launch  browser
		WebDriver driver = new ChromeDriver();
		
		//to launch the url
		driver.get("https://licindia.in/");
		
		//to get title and print in console
		String title = driver.getTitle();
		System.out.println(title);
		
		//to get the url and print in console
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		//to maximize the page 
		driver.manage().window().maximize();
		
		
		
	}
}
