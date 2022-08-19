package org.testseries;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample22 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SivaramaKrishnan\\eclipse-workspace\\selenium2pm\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		WebElement username = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		username.sendKeys("sivaram123");
		
		String attribute = username.getAttribute("value");
		System.out.println(attribute);
		
		
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("srk@123");
		
		String attribute2 = pass.getAttribute("value");
		System.out.println(attribute2);
	}

}
