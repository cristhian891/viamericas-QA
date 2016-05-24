package com.talos.selenium.objectpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;

import com.talos.selenium.utility.Initialize;

public class RegisterUser {
	
	WebDriver driver;
	
	
	public static By firstname = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div/div/div[2]/div/form/div[1]/div[1]/input");
	
	public static By lastname = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div/div/div[2]/div/form/div[1]/div[3]/input");
	
	public static By mobilephone = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div/div/div[2]/div/form/div[1]/div[5]/input");
	
	public static By Addres1 = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div/div/div[2]/div/form/div[2]/div[1]/input");
	
	public static By zipcode = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div/div/div[2]/div/form/div[2]/div[3]/div/div[2]/input");
	
	public static By city = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div/div/div[2]/div/form/div[2]/div[4]/dropdown-viamericas/div/div/input");
	
	public static By email = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div/div/div[2]/div/form/div[2]/div[7]/input");
	
	public static By statej = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div/div/div[2]/div/form/div[2]/div[3]/div/div[1]/dropdown-viamericas/div/div/input");
	
	public static By monthdropdown = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div/div/div[2]/div/form/div[2]/div[6]/div/div[1]");
	
	public static By daydropdown = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div/div/div[2]/div/form/div[2]/div[6]/div/div[2]");
	
	public static By yeardropdown = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div/div/div[2]/div/form/div[2]/div[6]/div/div[3]");
	
	public static By countryofbirth = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div/div/div[2]/div/form/div[2]/div[5]/dropdown-viamericas/div/div/input");
	
	public static By createAccountButton = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div/div/div[2]/div/form/div[3]/button");
	
	
	public static void enterNewUser() throws InterruptedException {
		
		Initialize.driver.findElement(firstname).sendKeys("CAMILO");
		
		
		Initialize.driver.findElement(lastname).sendKeys("RODRIGUEZ");
		
		
		Initialize.driver.findElement(mobilephone).sendKeys("12345678");
		
	
		Initialize.driver.findElement(Addres1).sendKeys("CALLE 34# 12 34");
	
	
		Initialize.driver.findElement(city).sendKeys("ABBEVILLE");
		
		Initialize.driver.findElement(countryofbirth).sendKeys("MEXICO");
	
		/*WebElement state = Initialize.driver.findElement(statej);
		Select sel_state = new Select(state);
		sel_state.selectByIndex(0);
		
		
		/*WebElement month = Initialize.driver.findElement(monthdropdown);
		Select sel_month = new Select(month);
		sel_month.selectByValue("4");
		
		/*Thread.sleep(3000);
		WebElement day = Initialize.driver.findElement(daydropdown);
		Select sel_day = new Select(day);
		sel_day.selectByIndex(3);
		Thread.sleep(3000);
		
		WebElement year = Initialize.driver.findElement(yeardropdown);
		Select sel_year = new Select(year);
		sel_year.selectByIndex(9);*/
		
		
		Initialize.driver.findElement(zipcode).sendKeys("21044");
		
		Initialize.driver.findElement(email).sendKeys("demoviamericas1@hotmail.com");
		
		
	}
	
	public static void CreateAccount(){
		Initialize.driver.findElement(createAccountButton).click();
	}
}