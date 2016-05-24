package com.talos.selenium.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Initialize {

	public static WebDriver driver;
	
	public static void Initiate(String ser){
		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://"+ser+".govianex.com/#/");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}
	public static void finish(){
		
		driver.quit();
	}
}
