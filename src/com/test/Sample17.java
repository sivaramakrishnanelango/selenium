package com.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample17 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SivaramaKrishnan\\eclipse-workspace\\selenium2pm\\drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		
		WebElement first = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		first.click();
		
		WebElement second = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		second.click();
		
		Alert alert=driver.switchTo().alert();
		Thread.sleep(3000);
		alert.dismiss();
	}

}
