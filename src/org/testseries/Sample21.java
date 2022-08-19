package org.testseries;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample21 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SivaramaKrishnan\\eclipse-workspace\\selenium2pm\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(" http://adactinhotelapp.com/");
		
		WebElement id = driver.findElement(By.id("username"));
		id.sendKeys("srk@1234");
		
		String attribute = id.getAttribute("value");
		System.out.println(attribute);
		
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("7598461411");
		
		String attribute2 = pass.getAttribute("value");
		System.out.println(attribute2);
	}
}
