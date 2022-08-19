package org.testseries;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample13 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SivaramaKrishnan\\eclipse-workspace\\selenium2pm\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		WebElement firstname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		firstname.sendKeys("sivaram");
		
		WebElement secondname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		secondname.sendKeys("elango");
		
		WebElement address = driver.findElement(By.xpath("//textarea[@rows='3']"));
		address.sendKeys("andimadam");
		
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("sivaram@123");
		
		WebElement phonenumber = driver.findElement(By.xpath("//input[@type='tel']"));
		phonenumber.sendKeys("7598461411");
		
	}
}
