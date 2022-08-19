package com.test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Sample23 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SivaramaKrishnan\\eclipse-workspace\\selenium2pm\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("sivaram123");
		
		driver.findElement(By.id("pass")).sendKeys("759846");
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(3000);
		
		TakesScreenshot tk = (TakesScreenshot)driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File des= new File("C:\\Users\\SivaramaKrishnan\\eclipse-workspace\\selenium2pm\\screenshot\\scr2.png");
		FileHandler.copy(src, des);
	}
}
