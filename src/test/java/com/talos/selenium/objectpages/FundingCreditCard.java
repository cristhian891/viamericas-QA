package com.talos.selenium.objectpages;

import org.openqa.selenium.By;

import com.talos.selenium.utility.Initialize;

public class FundingCreditCard {
		
	
	//
	public static By creditDebit = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div/div/div/div[1]/div[2]/div/div[2]/div/div");
	public static By typecardDisplay = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div/div/div/div[1]/div[2]/form[2]/div[1]/dropdown-viamericas/div/i");
	public static By typeofCard = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div/div/div/div[1]/div[2]/form[2]/div[1]/dropdown-viamericas/div/ul/li[1]");
	public static By firstName = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div/div/div/div[1]/div[2]/form[2]/div[2]/div[1]/input");
	public static By lastName = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div/div/div/div[1]/div[2]/form[2]/div[2]/div[2]/input");
	public static By cardNumber = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div/div/div/div[1]/div[2]/form[2]/div[3]/input");
	public static By ccvcode = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div/div/div/div[1]/div[2]/form[2]/div[5]/input");
	public static By displaymonth = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div/div/div/div[1]/div[2]/form[2]/div[4]/div[1]/div/dropdown-viamericas/div/i");
	public static By month = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div/div/div/div[1]/div[2]/form[2]/div[4]/div[1]/div/dropdown-viamericas/div/ul/li[3]");
	public static By displayYear = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div/div/div/div[1]/div[2]/form[2]/div[4]/div[2]/div/dropdown-viamericas/div/i");
	public static By year = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div/div/div/div[1]/div[2]/form[2]/div[4]/div[2]/div/dropdown-viamericas/div/ul/li[3]");
	public static By continueButton = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div/div/div/div[2]/button[2]");
			
	
	public static void addFundingCreditCardInfo(String first, String last, String number, String ccv){
		
		
		Initialize.driver.findElement(creditDebit).click();
		Initialize.driver.findElement(typecardDisplay).click();
		Initialize.driver.findElement(typeofCard).click();
		Initialize.driver.findElement(firstName).sendKeys(first);
		Initialize.driver.findElement(lastName).sendKeys(last);
		Initialize.driver.findElement(cardNumber).sendKeys(number);
		Initialize.driver.findElement(displaymonth).click();
		Initialize.driver.findElement(month).click();
		Initialize.driver.findElement(displayYear).click();
		Initialize.driver.findElement(year).click();
		Initialize.driver.findElement(ccvcode).sendKeys(ccv);
		
		
	}
	public static void goContinue() throws InterruptedException{
		
		Initialize.driver.findElement(continueButton).click();
		Thread.sleep(2000);
		
	}
}
