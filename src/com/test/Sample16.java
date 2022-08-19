package com.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample16 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SivaramaKrishnan\\eclipse-workspace\\selenium2pm\\drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.manage().window().maximize();
		
		WebElement simalert = driver.findElement(By.xpath("//a[text()='Alert with OK ']"));
		simalert.click();
		
		WebElement salert = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		salert.click();
		
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		driver.quit();
		driver.close();
	}
}
