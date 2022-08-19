package org.testseries;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample9 {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SivaramaKrishnan\\eclipse-workspace\\selenium2pm\\drivers\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://netbanking.hdfcbank.com/netbanking/");
	Thread.sleep(3000);
	
	WebElement input = driver.findElement(By.xpath("//input[@type='text']"));
	input.sendKeys("789654"); 
}
}
