package org.testseries;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.ThreadSafe;

public class Sample6 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SivaramaKrishnan\\eclipse-workspace\\selenium2pm\\drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		WebElement from = driver.findElement(By.id("src"));
		from.sendKeys("Andimadam");
		
		
		WebElement to = driver.findElement(By.id("dest"));
		to.sendKeys("chennai");
		
	}
}
