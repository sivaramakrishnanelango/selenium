package org.testseries;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample14 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SivaramaKrishnan\\eclipse-workspace\\selenium2pm\\drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		WebElement id = driver.findElement(By.id("username"));
		id.sendKeys("sivaram123");
		
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("789654");
	}
}
