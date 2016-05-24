package com.talos.selenium.objectpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.talos.selenium.utility.Initialize;

public class GetDestination {
	
	WebDriver driver;
	
	public static By countryField = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div/div/div[2]/div[1]/div[2]/form/div[1]/dropdown-viamericas/div/div/input");
	public static By MexicoElement = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div/div/div[2]/div[1]/div[2]/form/div[1]/dropdown-viamericas/div/ul/li[21]");
	public static By continueButton = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div/div/div[2]/div[2]/button[2]");
	
	
	public static void selectCountry(){
		
		
		Initialize.driver.findElement(countryField).click();
		Initialize.driver.findElement(MexicoElement).click();
		
		
	}
	public static void gocontinue(){
		Initialize.driver.findElement(continueButton).click();
	}
}
