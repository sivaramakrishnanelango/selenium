package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample29 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SivaramaKrishnan\\eclipse-workspace\\selenium2pm\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/guru99home/");
		
		driver.switchTo().frame("a077aa5e");
		
		WebElement ad = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		
		driver.switchTo().defaultContent();
		
		WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
		text.sendKeys("sivaram.e89@gmail");
	}

}
