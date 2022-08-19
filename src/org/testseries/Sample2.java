package org.testseries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "\\Users\\SivaramaKrishnan\\eclipse-workspace\\selenium2pm\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.google.com/mail/u/0/");
		driver.manage().window().maximize();
		
		driver.close();
		
		
	}
}
