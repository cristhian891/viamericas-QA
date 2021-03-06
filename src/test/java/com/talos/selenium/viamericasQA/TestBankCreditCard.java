package com.talos.selenium.viamericasQA;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.talos.selenium.objectpages.GetDestination;
import com.talos.selenium.objectpages.HomePage;
import com.talos.selenium.objectpages.Login;
import com.talos.selenium.objectpages.RecipientBankAccount;
import com.talos.selenium.objectpages.RecipientInformation;
import com.talos.selenium.objectpages.Review;
import com.talos.selenium.objectpages.AmountInfo;
import com.talos.selenium.objectpages.BankInfo;
import com.talos.selenium.objectpages.FundingCreditCard;
import com.talos.selenium.utility.Initialize;
import com.talos.selenium.utility.Utility;

public class TestBankCreditCard {
	
	
	@BeforeSuite
	public void setup(){
		Initialize.Initiate("dev");
	}
	
	@Test
	public void DestinationInfo() throws InterruptedException{
		
		Login.LogintoViamericas("viamericas1", "viamericas1");
		HomePage.gotoSendMoney();
		GetDestination.selectCountry();
		GetDestination.gocontinue();
		AmountInfo.enterSendAmountBankDeposit();	
		AmountInfo.gocontinue();
		BankInfo.ChooseaBank();
		BankInfo.goContinue();
		RecipientInformation.addRecipientChoosing();
		RecipientInformation.goContinue();
		RecipientBankAccount.addRecipientBankInfo();
		RecipientBankAccount.goContinue();
		FundingCreditCard.addFundingCreditCardInfo("JUAN", "BERNAL", "4124939999999990", "990");
		FundingCreditCard.goContinue();
		Review.sendMoney();	
		
	}
		

	@AfterMethod
	public static void aftertest(ITestResult result){
		
		if(ITestResult.FAILURE==result.getStatus()){		
			Utility.captureScreenshot(Initialize.driver, result.getName());
		}
	}
	
	@AfterSuite
	public void closing(){
		
	}
		
}
