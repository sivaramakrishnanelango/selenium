package org.testseries;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample16 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SivaramaKrishnan\\eclipse-workspace\\selenium2pm\\drivers\\chromedriver.exe");
		
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("sivaram");
		
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("sivaram123");
		
		WebElement findElement = driver.findElement(By.xpath("//button[@name='login']"));
		findElement.click();
		
	}
}
