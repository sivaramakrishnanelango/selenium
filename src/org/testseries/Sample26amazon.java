package org.testseries;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample26amazon {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SivaramaKrishnan\\eclipse-workspace\\selenium2pm\\drivers\\chromedriver.exe");
		
		//windowahANDLING 
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/gp/css/homepage.html?ref_=nav_youraccount_btn");
		
		WebElement signin = driver.findElement(By.id("nav-link-accountList"));
		signin.click();
		
		WebElement user = driver.findElement(By.id("ap_email"));
		user.sendKeys("7598461411");
		
		WebElement select = driver.findElement(By.id("continue"));
		select.click();
		
		WebElement pass = driver.findElement(By.id("ap_password"));
		pass.sendKeys("sivaram@123");
		
		WebElement ok = driver.findElement(By.id("signInSubmit"));
		ok.click();
		
		WebElement type = driver.findElement(By.id("twotabsearchtextbox"));
		type.sendKeys("iphone 13 pro max");
		
		WebElement element = driver.findElement(By.id("nav-search-submit-button"));
		element.click();
		
		WebElement iphone = driver.findElement(By.xpath("(//span[text()='Apple iPhone 13 Pro Max (128GB) - Sierra Blue'])[3]"));
		iphone.click();
		
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		
		for (String srk : windowHandles) {
			if (!windowHandle.equals(srk)) {
				driver.switchTo().window(srk);
			}
		}
		driver.findElement(By.id("buy-now-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='radio'])[5]")).click();
		
			}

}
