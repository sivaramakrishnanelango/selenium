package com.test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Sample22 {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SivaramaKrishnan\\eclipse-workspace\\selenium2pm\\drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
	TakesScreenshot tk = (TakesScreenshot)driver;
	
	File src = tk.getScreenshotAs(OutputType.FILE);
	
	File des = new File("C:\\Users\\SivaramaKrishnan\\eclipse-workspace\\selenium2pm\\screenshot\\scr.png");
	FileHandler.copy(src, des);
	
	}
}
