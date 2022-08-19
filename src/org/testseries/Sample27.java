package org.testseries;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample27 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SivaramaKrishnan\\eclipse-workspace\\selenium2pm\\drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		Actions a=new Actions(driver);
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement bank = driver.findElement(By.id("credit2"));
		
		WebElement dest = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		Thread.sleep(2000);
		a.dragAndDrop(bank, dest).perform();
		
	}
}
