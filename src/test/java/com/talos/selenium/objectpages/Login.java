package com.talos.selenium.objectpages;

import org.openqa.selenium.By;

import com.talos.selenium.utility.Initialize;

public class Login {
		
	
	//Locators from Login Page by XPATH
	public static By username = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div/div/div[2]/div/form/div[1]/input");
	public static By password = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div/div/div[2]/div/form/div[2]/input");
	public static By loginLink = By.xpath
	("html/body/div[1]/div/div[1]/div[1]/header/div/ul/li[3]/a");
	public static By SigninButton = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div/div/div[2]/div/form/div[4]/button");
	
	
	public static void LogintoViamericas(String user, String pass){
		
		
		Initialize.driver.findElement(loginLink).click();
		Initialize.driver.findElement(username).sendKeys(user);
		Initialize.driver.findElement(password).sendKeys(pass);
		Initialize.driver.findElement(SigninButton).click();
		
	}
}

