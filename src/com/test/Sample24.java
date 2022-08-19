package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample24 {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SivaramaKrishnan\\eclipse-workspace\\selenium2pm\\drivers\\chromedriver.exe");
	 
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.amazon.in/");
	
	WebElement input = driver.findElement(By.xpath("//input[@type='text']"));
	input.sendKeys("iphone");
	
	
	WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
	search.click();
	
}
}
