package com.talos.selenium.objectpages;



import org.openqa.selenium.By;


import com.talos.selenium.utility.Initialize;

public class RecipientInformation {
	
	public static By recipientdisplay = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div[1]/div/div/div[1]/div[2]/form/div[1]/dropdown-viamericas/div/i");
	public static By mike = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div[1]/div/div/div[1]/div[2]/form/div[1]/dropdown-viamericas/div/ul/li[1]");
	
	
	public static By firstname = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div[1]/div/div/div[1]/div[2]/form/div[2]/input");
	public static By middlename = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div[1]/div/div/div[1]/div[2]/form/div[3]/input");
	public static By lastname = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div[1]/div/div/div[1]/div[2]/form/div[4]/input");
	public static By phonenumber = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div[1]/div/div/div[1]/div[2]/form/div[6]/input");
	public static By email = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div[1]/div/div/div[1]/div[2]/form/div[7]/input");
	public static By month = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div[1]/div/div/div[1]/div[2]/form/div[8]/div/div[1]/dropdown-viamericas/div/input");
	public static By day = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div[1]/div/div/div[1]/div[2]/form/div[8]/div/div[2]/dropdown-viamericas/div/input");
	public static By year = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div[1]/div/div/div[1]/div[2]/form/div[8]/div/div[3]/dropdown-viamericas/div/input");

	public static By address1 = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div[1]/div/div/div[1]/div[2]/form/div[9]/input");
	public static By address2 = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div[1]/div/div/div[1]/div[2]/form/div[10]/input");
	public static By country = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div[1]/div/div/div[1]/div[2]/form/div[11]/dropdown-viamericas/div/div/input");
	public static By state = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div[1]/div/div/div[1]/div[2]/form/div[12]/div/div[1]/dropdown-viamericas/div/div/input");
	public static By zipcode = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div[1]/div/div/div[1]/div[2]/form/div[12]/div/div[2]/input");
	public static By city = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div[1]/div/div/div[1]/div[2]/form/div[13]/dropdown-viamericas/div/div/input");
	
	public static By continueButton = By.xpath
	("html/body/div[1]/div/div[1]/div[2]/div[1]/div/div/div[2]/button[2]");
	
	
	public static void addanewRecipient(){
		
		
		Initialize.driver.findElement(firstname).sendKeys("MIKE");
		Initialize.driver.findElement(middlename).sendKeys("ANDRES");
		Initialize.driver.findElement(lastname).sendKeys("BENAVIDES");
		Initialize.driver.findElement(phonenumber).sendKeys("12345678");
		Initialize.driver.findElement(email).sendKeys("testing@email.com");
		Initialize.driver.findElement(month).sendKeys("4");
		Initialize.driver.findElement(day).sendKeys("6");
		Initialize.driver.findElement(year).sendKeys("1989");
		Initialize.driver.findElement(address1).sendKeys("CALL 13A #12- 45");
		Initialize.driver.findElement(address2).sendKeys(" CLL 45A #12 - 67");
		Initialize.driver.findElement(country).sendKeys("MEXICO");
		Initialize.driver.findElement(state).sendKeys("COAHUILA");
		Initialize.driver.findElement(zipcode).sendKeys();
		Initialize.driver.findElement(city).sendKeys("CASTANOS");
	}
	
	public static void addRecipientChoosing() throws InterruptedException{
			
		Initialize.driver.findElement(recipientdisplay).click();
		Initialize.driver.findElement(mike).click();
		Thread.sleep(2000);
		
	}
	public static void goContinue() throws InterruptedException{
		Initialize.driver.findElement(continueButton).click();
		Thread.sleep(2000);
		
	}
}
