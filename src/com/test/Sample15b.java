package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample15b {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SivaramaKrishnan\\eclipse-workspace\\selenium2pm\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		Actions a = new Actions(driver);
		
		WebElement source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		
		WebElement target = driver.findElement(By.xpath("(//li[@class=\"placeholder\"])[1]"));
		
		a.dragAndDrop(source, target).perform();
		
		
	}

}
