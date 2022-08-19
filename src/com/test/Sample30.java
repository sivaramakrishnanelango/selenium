package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample30 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SivaramaKrishnan\\eclipse-workspace\\selenium2pm\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		//to launch the browseer
		driver.get("https://demo.guru99.com/test/guru99home/");
		
		
		//to find the no of frames in DOM
		List<WebElement> frame = driver.findElements(By.tagName("iframe"));
		int size = frame.size();
		System.out.println(size);
		
		driver.close();
	}

}
