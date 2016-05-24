package com.talos.selenium.viamericasQA;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.talos.selenium.objectpages.HomePage;
import com.talos.selenium.objectpages.Login;
import com.talos.selenium.objectpages.RegisterUser;
import com.talos.selenium.utility.Initialize;
import com.talos.selenium.utility.Utility;

public class TestSigup {
	@BeforeSuite
	public void setup(){
		Initialize.Initiate("dev");
	}
	@Test
	public void enternewuser() throws Exception {
		
		HomePage.gotoToSignup();
		RegisterUser.enterNewUser();
		
		
			
	}
}
