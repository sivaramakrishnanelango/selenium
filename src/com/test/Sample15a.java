package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import graphql.ThreadSafe;

public class Sample15a {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SivaramaKrishnan\\eclipse-workspace\\selenium2pm\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		
		Actions a = new Actions(driver);
		
		WebElement course = driver.findElement(By.xpath("//div[text()='Courses ']"));
		a.moveToElement(course).perform();
		
		WebElement testing = driver.findElement(By.xpath("//span[contains(text(),'Software ')]"));
		a.moveToElement(testing).perform();
		
		
		driver.quit();
		driver.close();
	}
}
