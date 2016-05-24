package com.talos.selenium.objectpages;
import org.openqa.selenium.By;

import com.talos.selenium.utility.Initialize;


public class BankInfo {
		
	
	//Locators from Login Page by XPATH
	public static By displaybank = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div/div/div/div[1]/div[2]/form/div/dropdown-viamericas/div/i");
	public static By bancomer = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div/div/div/div[1]/div[2]/form/div/dropdown-viamericas/div/ul/li[2]");
	public static By continueButton = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div/div/div/div[2]/button[2]");
	
	
	public static void ChooseaBank() throws InterruptedException{
		
		
		Initialize.driver.findElement(displaybank).click();
		Initialize.driver.findElement(bancomer).click();
		Thread.sleep(2000);
	}
		
		
	public static void goContinue() throws InterruptedException{	
		Initialize.driver.findElement(continueButton).click();
		Thread.sleep(2000);

		
		
	}
}

