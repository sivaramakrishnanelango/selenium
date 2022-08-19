package org.testseries;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample25 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SivaramaKrishnan\\eclipse-workspace\\selenium2pm\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://bazaar.shopclues.com/wholesale.html");
		
		WebElement search = driver.findElement(By.id("autocomplete"));
		search.sendKeys("iphone");
		
		WebElement findElement = driver.findElement(By.xpath("//a[@class='srch_action btn orange']"));
		findElement.click();
	}
}
