package com.talos.selenium.objectpages;

import org.openqa.selenium.By;

import com.talos.selenium.utility.Initialize;

public class Review {
		

	public static By sendMoneyButton = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div/div/div/div[2]/button[2]");
	public static By fee = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div/div/div/div[1]/div[2]/form/div[11]/div[3]/div[2]");
	public static By total = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div/div/div/div[1]/div[2]/form/div[11]/div[4]/div[2]/b");
	public static By recievedamount = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div/div/div/div[1]/div[2]/form/div[11]/div[1]/div[3]/div/div[2]");
	
	
	public static String getfee(){
		
		String a = Initialize.driver.findElement(fee).getText();
		return a;
	}
	public static String gettotal(){
		
		String b = Initialize.driver.findElement(total).getText();
		return b;
		
	}
	public static String getrecievedamount(){
		
		String c = Initialize.driver.findElement(recievedamount).getText();
		return c;
	}
		
	public static void sendMoney() throws InterruptedException{
		Thread.sleep(3000);
		Initialize.driver.findElement(sendMoneyButton).click();
	}
}

