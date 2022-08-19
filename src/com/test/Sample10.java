package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample10 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SivaramaKrishnan\\eclipse-workspace\\selenium2pm\\drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.instagram.com/?hl=en");
		
		String url = driver.getTitle();
		System.out.println(url);
		
		Thread.sleep(3000);
		
		WebElement user = driver.findElement(By.xpath("(//input[@autocapitalize='off'])[1]"));
		user.sendKeys("sivaram@123");
		
        Thread.sleep(3000);
        
		WebElement pass = user.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("7598461411");
		
		Thread.sleep(3000);
		
		WebElement mouse = driver.findElement(By.xpath("//div[text()='Log In']"));
		mouse.click();
				
	}

}
