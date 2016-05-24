package com.talos.selenium.objectpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.talos.selenium.utility.Initialize;

public class HomePage {
	WebDriver driver;
	//Locators from Login Page by XPATH
	public static By getaQuoteLink = By.xpath
	("html/body/div[1]/div/div[1]/div[1]/header/nav-viamericas/nav/div[1]/ul/li[3]/a");
	public static By sendMoneyLink = By.xpath
	("html/body/div[1]/div/div[1]/div[1]/header/nav-viamericas/nav/div[1]/ul/li[1]/a");
	public static By transactionHistory = By.xpath
	("html/body/div[1]/div/div[1]/div[1]/header/nav-viamericas/nav/div[1]/ul/li[2]/a");
	public static By locationLink = By.xpath
	("html/body/div[1]/div/div[1]/div[1]/header/nav-viamericas/nav/div[1]/ul/li[4]/a");
	public static By howitworkLink = By.xpath
	("html/body/div[1]/div/div[1]/div[1]/header/nav-viamericas/nav/div[1]/ul/li[5]/a");
	public static By mainLink = By.xpath
	("html/body/div[1]/div/div[1]/div[1]/header/logo-viamericas/div/a/img");
	public static By signupbutton = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div/div/section[2]/div[5]/a[2]");
	public static By privacyPolicy = By.xpath
	("html/body/div[1]/div/div[2]/footer/div/nav/ul[2]/li[4]/a");
	public static By customerAgreement = By.xpath
	("html/body/div[1]/div/div[2]/footer/div/nav/ul[2]/li[5]/a");
	public static By coomingsoonimg = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div/div[6]/img");
	public static By carrerslink = By.xpath
	("html/body/div[1]/div/div[2]/footer/div/nav/ul[1]/li[3]/a");
	public static By newslink = By.xpath
	("html/body/div[1]/div/div[2]/footer/div/nav/ul[1]/li[4]/a");
	public static By agentslink = By.xpath
	("html/body/div[1]/div/div[2]/footer/div/nav/ul[1]/li[5]/a");
	public static By correspondentslink = By.xpath
	("html/body/div[1]/div/div[2]/footer/div/nav/ul[1]/li[6]/a");
	public static By complianceslink = By.xpath
	("html/body/div[1]/div/div[2]/footer/div/nav/ul[1]/li[7]/a");
	public static By contactustslink = By.xpath
	("html/body/div[1]/div/div[2]/footer/div/nav/ul[2]/li[3]/a");
	
	
	
	public static void gotoGetaQuote(){
		
		Initialize.driver.findElement(getaQuoteLink).click();
		
	}
	public static void gotoSendMoney(){
		
		Initialize.driver.findElement(sendMoneyLink).click();
		
	}
	public static void gotoTransactionHistory(){
	
		Initialize.driver.findElement(transactionHistory).click();
	
	}
	public static void gotoLocation(){
	
		Initialize.driver.findElement(locationLink).click();
	
	}
	public static void gotoHowitwork(){
	
		Initialize.driver.findElement(howitworkLink).click();
	
	}
	public static void gotoMain(){
		
		Initialize.driver.findElement(mainLink).click();
	
	}
	public static void gotoToSignup(){
		
		Initialize.driver.findElement(signupbutton).click();
	
	}
	public static void gotoPrivacyPolicy(){
		
		Initialize.driver.findElement(privacyPolicy).click();
	
	}
	public static void gotoCustomerAgreement(){
	
	Initialize.driver.findElement(customerAgreement).click();
	

	}
	public static void gotoCarrers(){
		
	Initialize.driver.findElement(carrerslink).click();
	
	}
	public static void gotoNews(){
		
	Initialize.driver.findElement(newslink).click();
		
	}
	public static void gotoAgents(){
		
	Initialize.driver.findElement(agentslink).click();
		
	}
	public static void gotoCorrespondents(){
		
	Initialize.driver.findElement(correspondentslink).click();
		
	}

}
