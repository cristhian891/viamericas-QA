package com.talos.selenium.objectpages;

import org.openqa.selenium.By;

import com.talos.selenium.utility.Initialize;

public class FundingBankAccount {
		
	
	//Locators from Login Page by XPATH
	public static By bankaccount = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div/div/div/div[1]/div[2]/div/div[1]/div/div");
	
	public static By continueButton = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div/div/div/div[2]/button[2]");
	
	public static By accountholder = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div/div/div/div[1]/div[2]/form[1]/div[1]/input");
	
	public static By routingNumber = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div/div/div/div[1]/div[2]/form[1]/div[2]/input");
	
	public static By accountNumber = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div/div/div/div[1]/div[2]/form[1]/div[3]/input");
	
	public static By displaytypeofAccount = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div/div/div/div[1]/div[2]/form[1]/div[4]/div/dropdown-viamericas/div/i");
	
	public static By typeofAccount = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div/div/div/div[1]/div[2]/form[1]/div[4]/div/dropdown-viamericas/div/ul/li[1]");
	
	
	
	public static void addFundingInfo(String holder, String routing, String number){
		
		
		Initialize.driver.findElement(bankaccount).click();
		Initialize.driver.findElement(accountholder).sendKeys(holder);
		Initialize.driver.findElement(routingNumber).sendKeys(routing);
		Initialize.driver.findElement(accountNumber).sendKeys(number);
		Initialize.driver.findElement(displaytypeofAccount).click();
		Initialize.driver.findElement(typeofAccount).click();
		
	}
	public static void goContinue() throws InterruptedException{
		
		Initialize.driver.findElement(continueButton).click();
		Thread.sleep(2000);
	}
}