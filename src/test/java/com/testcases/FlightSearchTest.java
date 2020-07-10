package com.testcases;

import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.Page;
import com.errorcollectors.ErrorCollector;
import com.pages.actions.HomePage;
import com.utilities.TestUtil;

public class FlightSearchTest {


	
	@Test(dataProvider="dp",dataProviderClass=TestUtil.class)
	public static void flightSearchTest(Hashtable<String,String> data) throws InterruptedException{
		// TODO Auto-generated method stub
		
	
		if(data.get("runmode").equalsIgnoreCase("n")) {
			
			throw new SkipException("skipping the test case");
		
		}
		
		
		Page.initConfig();  
		HomePage home=new HomePage();	
		//Assert.assertEquals(home.tabCount(),6);
		//ErrorCollector.verifyEquals(home.tabCount(),6);
		home.goToFlights();
		//Thread.sleep(1000);
		home.bookAFlight(data.get("flyingfrom"),data.get("flyingto"),data.get("departingDate"),data.get("returningDate"));
		//Thread.sleep(1000);
		
		
		

	}
	
	
	
	@AfterMethod
	public void tearDown() {
		
		if(Page.driver!=null)
		{
		Page.quitBrowser();
		}
		
	}

}
