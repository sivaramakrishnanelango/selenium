package org.testseries;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample24flip {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SivaramaKrishnan\\eclipse-workspace\\selenium2pm\\drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		
		
		driver.get("https://www.flipkart.com/");
		
		WebElement cancel = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		cancel.click();
		
		WebElement login = driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
		login.click(); 
		Thread.sleep(2000);
		
		WebElement user = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		user.sendKeys("7598461411");
		
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("sivaram100296");
		
		WebElement ok = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		ok.click();
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		search.sendKeys("iphone13 pro max");
		
		WebElement done = driver.findElement(By.xpath("//button[@type='submit']"));
		done.click();
		Thread.sleep(2000);
		WebElement iphone = driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 Pro Max (Graphite, 1 TB)']"));
		iphone.click();
		
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		
		Set<String> srk = driver.getWindowHandles();
		System.out.println(srk);
		
		for (String child : srk) {
			if (!windowHandle.equals(child)) {
				
				driver.switchTo().window(child);
			}
		}
		
		driver.findElement(By.xpath("//span[@class='_2P_LDn']")).click();
		WebElement pincode = driver.findElement(By.id("id=\'pincodeInputId\'"));
		pincode.sendKeys("621801");
		driver.findElement(By.xpath("//span[@class='_2P_LDn']")).click();
		driver.findElement(By.xpath("(//button[@class='_2KpZ6l _1t_O3S _2ti6Tf _3AWRsL'])[1]")).click();
	}
}
