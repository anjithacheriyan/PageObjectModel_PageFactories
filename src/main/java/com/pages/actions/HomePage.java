package com.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.base.Page;
import com.pages.locators.HomePageLocators;

public class HomePage extends Page {
	
	public HomePageLocators homeloc;
	
	public HomePage() {
		
		this.homeloc=new HomePageLocators();
		AjaxElementLocatorFactory factory=new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(factory,this.homeloc);
		
		
		
		
	}
	
	
	
	public void goToStays(){
		
	}
	
	
	
	public HomePage goToFlights(){
		
		click(homeloc.flightTab);
		
	return this;
		
	}
	
	public void goToCars(){
		
	}



	public void goToPackages(){
	
	}
	
	
	public void goToThingsToDo(){
		
	}
	

	public int tabCount() {
		
		return homeloc.tabcount.size();
		
	}
	
	public void bookAFlight(String flyingfrom ,String flyingto ,String departingDate,String returningDate) throws InterruptedException {
		
		
		type(homeloc.flyingFrom, flyingfrom);
		
		
		Thread.sleep(1000);
		click(homeloc.firstFromFlyingFromList);
	

		type(homeloc.flyingTo,flyingto);
		
		
		Thread.sleep(1000);
		click(homeloc.firstFromFlyingToList);
	
		
		type(homeloc.departingDate, departingDate);
		type(homeloc.returningDate, returningDate);
	
		click(homeloc.flightClass);
		click(homeloc.businessClassRadio);
		Thread.sleep(1000);
		click(homeloc.searchButton);
		
	}


}
