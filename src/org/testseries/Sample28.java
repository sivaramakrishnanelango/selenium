package org.testseries;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample28 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SivaramaKrishnan\\eclipse-workspace\\selenium2pm\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		Actions a = new Actions(driver);
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		WebElement courses = driver.findElement(By.xpath("//div[@class='header-browse-greens']"));
		a.moveToElement(courses).perform();
		
		WebElement softwaretesting = driver.findElement(By.xpath("//div[@title='Software Testing']"));
		a.moveToElement(softwaretesting).perform();
	}

}
