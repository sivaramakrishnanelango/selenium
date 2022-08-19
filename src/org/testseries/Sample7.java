package org.testseries;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample7 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SivaramaKrishnan\\eclipse-workspace\\selenium2pm\\drivers\\chromedriver.exe");
		
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		WebElement input = driver.findElement(By.name("q"));
		input.sendKeys("Greenstechnology");
	}
}
