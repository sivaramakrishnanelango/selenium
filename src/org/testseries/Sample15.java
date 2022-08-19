package org.testseries;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample15 {
	public static void main(String[] args) throws AWTException {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SivaramaKrishnan\\eclipse-workspace\\selenium2pm\\drivers\\chromedriver.exe");
	 
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.amazon.in/");
	
	WebElement input = driver.findElement(By.xpath("//input[@type='text']"));
	input.sendKeys("iphone");
	
	Robot r = new Robot();
	 
	WebElement findElement = driver.findElement(By.id("nav-search-submit-button"));
	findElement.click();
	
	WebElement iphone = driver.findElement(By.xpath("(//span[text()='Apple iPhone 12 (128GB) - Blue'])[1]"));
	iphone.click();
	}
}
