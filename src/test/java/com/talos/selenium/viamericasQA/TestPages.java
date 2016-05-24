package com.talos.selenium.viamericasQA;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.talos.selenium.objectpages.Carreers;
import com.talos.selenium.objectpages.HomePage;
import com.talos.selenium.objectpages.Login;
import com.talos.selenium.utility.Initialize;
import com.talos.selenium.utility.Utility;

public class TestPages {

	
	@BeforeSuite
	public void setup(){
		Initialize.Initiate("test");
	}
	@Test
	public void checkcustomeragreement() {
		Login.LogintoViamericas("cristhian.preciado@talosdigital.com", "viamericas1");
		HomePage.gotoMain();
		HomePage.gotoCustomerAgreement();
				
	}
	
	@Test
	public void checkprivacy() {
		
		Utility.goBack();
		HomePage.gotoPrivacyPolicy();
		
	}
	
	@Test
	public void checkCarrersPage(){
		
		Utility.goBack();
		HomePage.gotoCarrers();
		Assert.assertTrue(Utility.checkElement(Carreers.bannerIamge));
		Assert.assertTrue(Utility.checkElement(Carreers.emaillink));	
	}
	
	
	
	@Test
	public void checkNewsPage(){
	
		Utility.goBack();
		HomePage.gotoNews();	
	}
	
	
	@Test
	public void checkAgentsPage(){
		
		Utility.goBack();
		HomePage.gotoAgents();	
	}
	
	
	@AfterSuite
	public void closing(){
		
		Initialize.finish();
		
	}
}

