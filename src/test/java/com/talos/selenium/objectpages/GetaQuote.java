package com.talos.selenium.objectpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.talos.selenium.utility.Initialize;

public class GetaQuote {
	
	WebDriver driver;
	
	//Locators from GetaQuote Page by XPATH
	public static By country = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div/div/div/div[1]/form/div/div[1]/dropdown-viamericas/div/div/input");
	public static By amount = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div/div/div/div[1]/form/div/div[2]/input");
	public static By getaQuoteButton = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div/div/div/div[1]/form/div/div[2]/input");
	

	public static void selectCountry(String count){
		
		Initialize.driver.findElement(country).click();
		Initialize.driver.findElement(country).sendKeys(count);
		Initialize.driver.findElement(getaQuoteButton).click();;
			
	}

}
