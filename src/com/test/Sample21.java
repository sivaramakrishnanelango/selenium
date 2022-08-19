package com.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample21 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SivaramaKrishnan\\eclipse-workspace\\selenium2pm\\drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("(//a[contains(text(),'Alert with')])[1]")).click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		
		Thread.sleep(3000);
		Alert a = driver.switchTo().alert();
		a.dismiss();
	}
}
