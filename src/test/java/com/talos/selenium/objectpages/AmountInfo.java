package com.talos.selenium.objectpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.talos.selenium.utility.Initialize;

public class AmountInfo {
	
	WebDriver driver;
	
	public static By sendField = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div/div/div/div[2]/div[2]/form/div[1]/div[1]/div/input");
	
	public static By receiveField = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div/div/div/div[2]/div[2]/form/div[1]/div[1]/div/input");
	
	public static By sendCurrency = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div/div/div/div[2]/div[2]/form/div[1]/div[2]/div/dropdown-viamericas/div/i");
	
	public static By sendCurrencyitem = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div/div/div/div[2]/div[2]/form/div[1]/div[2]/div/dropdown-viamericas/div/ul/li");
	
	public static By recieveCurrency = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div/div/div/div[2]/div[2]/form/div[2]/div[2]/div/dropdown-viamericas/div/i");
	
	public static By recieveCurrencyItem = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div/div/div/div[2]/div[2]/form/div[2]/div[2]/div/dropdown-viamericas/div/ul/li[2]");
	
	public static By continueButton = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div/div/div/div[3]/button[2]");
	
	public static By bankDepositField = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div/div/div/div[2]/div[2]/form/div[3]/div[1]/div[1]/div");
	
	public static By cashPickup = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div/div/div/div[2]/div[2]/form/div[3]/div[1]/div[2]/div");
	
	
	public static void enterSendAmountBankDeposit() throws InterruptedException{
		
		Initialize.driver.findElement(sendField).sendKeys("10");
		Initialize.driver.findElement(sendCurrency).click();
		Initialize.driver.findElement(sendCurrencyitem).click();
		Initialize.driver.findElement(recieveCurrency).click();
		Initialize.driver.findElement(recieveCurrencyItem).click();
		Initialize.driver.findElement(bankDepositField).click();
		Thread.sleep(3000);
		
	}
	public static void enterSendAmountCashPickup() throws InterruptedException{
		
		Initialize.driver.findElement(sendField).sendKeys("10");
		Initialize.driver.findElement(sendCurrency).click();
		Initialize.driver.findElement(sendCurrencyitem).click();
		Initialize.driver.findElement(recieveCurrency).click();
		Initialize.driver.findElement(recieveCurrencyItem).click();
		Initialize.driver.findElement(cashPickup).click();
		Thread.sleep(3000);
		
	}
	public static void gocontinue(){
		Initialize.driver.findElement(continueButton).click();
	}
}
