package com.talos.selenium.objectpages;

import org.openqa.selenium.By;

import com.talos.selenium.utility.Initialize;

public class FundingCash {
		
	
	public static By cash = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div/div/div/div[1]/div[2]/div/div[3]/div/div");
	public static By zipcode = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div/div/div/div[1]/div[2]/div[2]/div[1]/div[3]/input");
	public static By continueButton = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div/div/div/div[2]/button[2]");
	public static By place = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div/div/div/div[1]/div[2]/div[2]/div[1]/div/div[2]/ul/li[2]");
	
	
	public static void selectCashFunding(String zip) throws InterruptedException{
		
		Initialize.driver.findElement(cash).click();
		Initialize.driver.findElement(zipcode).sendKeys(zip);
		Initialize.driver.findElement(continueButton).click();
		Thread.sleep(2000);
		Initialize.driver.findElement(place).click();
		
	}
}

