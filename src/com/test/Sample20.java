package com.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample20 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SivaramaKrishnan\\eclipse-workspace\\selenium2pm\\drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		WebElement first = driver.findElement(By.xpath("//a[text()='Alert with OK ']"));
		first.click();
		
		WebElement second = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		second.click();
		
		Alert a = driver.switchTo().alert();
		a.accept();
	}
}
