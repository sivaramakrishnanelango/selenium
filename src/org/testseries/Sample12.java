package org.testseries;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample12 {
	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SivaramaKrishnan\\eclipse-workspace\\selenium2pm\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/?hl=en");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement user = driver.findElement(By.xpath("//input[@name='username']"));
		user.sendKeys("sivarm@123");
		Thread.sleep(3000);
		
		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys("123456");
		
		
		
		
		
	}

}
