package org.testseries;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample8 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SivaramaKrishnan\\eclipse-workspace\\selenium2pm\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI&ITM=nli_personalb_personal_login_btn&_gl=1*10n1ei9*_ga*MTA5NTc1NDUxMS4xNjUwOTg5MzIx*_ga_SKB78GHTFV*MTY1MDk4OTMyMS4xLjEuMTY1MDk4OTQxNy4yNg..");
		
		WebElement userid = driver.findElement(By.id("AuthenticationFG.USER_PRINCIPAL"));
		userid.sendKeys("7598461411");
	}
}
