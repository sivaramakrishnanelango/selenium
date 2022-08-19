package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample27 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SivaramaKrishnan\\eclipse-workspace\\selenium2pm\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement user = driver.findElement(By.id("email"));
		JavascriptExecutor je = (JavascriptExecutor) driver;
		
		//replacement of send keys
		je.executeScript("arguments[0].setAttribute('value','sivaram@123')", user);
		
		WebElement pass = driver.findElement(By.id("pass"));
		je.executeScript("arguments[0].setAttribute('value','sivaram123')", pass);
		
		WebElement login = driver.findElement(By.name("login"));
		
		//replacement of clicks
		je.executeScript("arguments[0].click()", login);
	}
}
