package com.testcases;

import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.base.Page;
import com.pages.actions.SignInPage;
import com.utilities.TestUtil;

public class SignInTest {
	
	
	
	@Test(dataProvider="dp",dataProviderClass=TestUtil.class)
	public void signInTest(Hashtable<String,String> data) throws InterruptedException{
		
		if(data.get("runmode").equalsIgnoreCase("n")) {
			
			throw new SkipException("Skipping the testcase !");
		}
		
		Page.initConfig(); 
		SignInPage signIn=Page.topnavigation.goToSignIn();
		signIn.loginIn(data.get("userid"),data.get("password"));
		
	}

	
	@AfterMethod
	public void tearDown() {
		
		if(Page.driver!=null) {
		
		Page.quitBrowser();
		}
		
	}
	
	
	
	
}
