package com.talos.selenium.objectpages;

import org.openqa.selenium.By;

import com.talos.selenium.utility.Initialize;

public class Carreers {
		
	
	//Locators from Login Page by XPATH
	public static By bannerIamge = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div[1]/div[1]/img");
	public static By emaillink = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div/div/div/div/div[1]/div[2]/p[2]/a");
	
	
	
	public static void sendresume(){
		
		Initialize.driver.findElement(emaillink).click();
	
	}
}