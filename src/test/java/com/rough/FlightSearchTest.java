package com.rough;

import com.base.Page;
import com.pages.actions.HomePage;

public class FlightSearchTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Page.initConfig();
		HomePage home=new HomePage();	
		home.goToFlights();
		Thread.sleep(1000);
		home.bookAFlight("Seattle, WA (SEA-All Airports)", "Cochin (COK-Cochin Intl.)", "2020-07-08", "2020-07-09");
		Thread.sleep(1000);
		Page.quitBrowser();
		

	}

}
