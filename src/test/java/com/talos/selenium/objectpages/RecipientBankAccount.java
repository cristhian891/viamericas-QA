package com.talos.selenium.objectpages;



import org.openqa.selenium.By;

import com.talos.selenium.utility.Initialize;


public class RecipientBankAccount {
		
	public static By bankdisplay = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div/div/div/div[1]/div[2]/form/div[1]/dropdown-viamericas/div/i");
	public static By bankinfo = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div/div/div/div[1]/div[2]/form/div[1]/dropdown-viamericas/div/ul/li[1]");
	public static By continueButton = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div/div/div/div[2]/button[2]");
	
	
	
	public static void addRecipientBankInfo() {
		
		
		Initialize.driver.findElement(bankdisplay).click();
		Initialize.driver.findElement(bankinfo).click();
		
	}
	public static void goContinue() throws InterruptedException{
		Initialize.driver.findElement(continueButton).click();;
		Thread.sleep(2000);
		
	}
}
