package com.talos.selenium.viamericasQA;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.talos.selenium.objectpages.GetaQuote;
import com.talos.selenium.objectpages.HomePage;
import com.talos.selenium.objectpages.Login;
import com.talos.selenium.utility.Initialize;


public class TestCases {
	

	@BeforeSuite
	public void setup(){	
		Initialize.Initiate("dev");
		
	}
	@Test
	public void CheckLogin(){
		Login.LogintoViamericas("viamericas1","viamericas1");
		
	}
	
	
	@Test
	public void CheckGetaQuote() throws InterruptedException{
	
	
	HomePage.gotoGetaQuote();
	Thread.sleep(1000);
	
	GetaQuote.selectCountry("MEXICO");
	HomePage.gotoMain();
	
	
	}
	
	@Test
	public void CheckTransactionHistory() throws InterruptedException{
			
		HomePage.gotoTransactionHistory();
		Thread.sleep(1000);
		HomePage.gotoMain();
		
	}
	
	@Test
	public void CheckLocation() throws InterruptedException{
	;
		HomePage.gotoLocation();
		Thread.sleep(1000);
		HomePage.gotoMain();
		
	}
		
		
	@Test
	public void CheckHowitWork() throws InterruptedException{
		
		HomePage.gotoHowitwork();
		Thread.sleep(1000);
		HomePage.gotoMain();
		
		
	}	
		
	
	@AfterSuite
	public void closing(){
		Initialize.finish();
	}
		
}


	

