package org.testseries;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample30 {
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\SivaramaKrishnan\\eclipse-workspace\\selenium2pm\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.flipkart.com");
		
		Actions a = new Actions(driver);
		
        driver.manage().window().maximize();
		
		WebElement user = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		user.sendKeys("7598461411");
		
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("sivaram100296");
		
		WebElement ok = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		ok.click();
		Thread.sleep(2000);
		
		
	}

}
