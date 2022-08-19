package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample3 {

	public static void main(String[] args) {
		
		//configuration
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SivaramaKrishnan\\eclipse-workspace\\selenium2pm\\drivers\\chromedriver.exe");
		
		//launch the browser
		WebDriver driver = new ChromeDriver();
		
		//launch the url
		driver.get("https://www.amazon.in/");
		
		//to get the title in console
		String title = driver.getTitle();
		System.out.println(title);
		
		//to get the current url in console
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		//to maximize the window screen
		driver.manage().window().maximize();
		
		//to close the screeen
		driver.close();
		driver.quit();
	}
}
