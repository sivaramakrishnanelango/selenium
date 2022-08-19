package org.testseries;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample20 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SivaramaKrishnan\\eclipse-workspace\\selenium2pm\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("sivaram123");
		
		String attribute = user.getAttribute("value");
		System.out.println(attribute);
		
		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys("1234567890");
		
		String attribute2 = pass.getAttribute("value");
		System.out.println(attribute2);
	}

}
