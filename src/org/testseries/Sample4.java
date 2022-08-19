package org.testseries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample4 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SivaramaKrishnan\\eclipse-workspace\\selenium2pm\\drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/selenium-training-in-chennai.html");
		
		driver.manage().window().maximize();
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		
		
		driver.close();
	}
}
