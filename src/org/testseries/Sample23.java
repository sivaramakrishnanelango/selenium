package org.testseries;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample23 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SivaramaKrishnan\\eclipse-workspace\\selenium2pm\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		WebElement find = driver.findElement(By.xpath("//input[@type='text']"));
		find.sendKeys("iphone13 pro max");
		Thread.sleep(3000);
		
		WebElement cancel = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		cancel.click();
		Thread.sleep(2000);
		WebElement click = driver.findElement(By.xpath("//button[@type='submit']"));
		click.click();
		Thread.sleep(2000);
		WebElement iphone = driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 Pro Max (Alpine Green, 512 GB)']"));
		iphone.click();
		
		String srk1 = driver.getWindowHandle();
		System.out.println(srk1);
		
		Set<String> srk2 = driver.getWindowHandles();
		for (String srk3 : srk2) {
			if (!srk1.equals(srk3)) {
				
				driver.switchTo().window(srk3);
			}
		}
		
		Thread.sleep(2000);
        WebElement pincode = driver.findElement(By.id("pincodeInputId"));
        pincode.sendKeys("600044");

        driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Place Order']")).click();
	}
}

