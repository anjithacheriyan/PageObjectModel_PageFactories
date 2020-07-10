package com.pages.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.base.Page;
import com.pages.locators.TopNavigationLocator;

public class TopNavigation {

	public  TopNavigationLocator topnav;
	
	public TopNavigation(WebDriver driver){
		
		
		this.topnav=new TopNavigationLocator();
		AjaxElementLocatorFactory factory=new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(factory,this.topnav);
		
	}
	
	
	public SignInPage goToSignIn() throws InterruptedException{
		
		
		Page.click(topnav.signIn);
		Page.click(topnav.signInBtn);
		Thread.sleep(1000);
		
		
		
		return new SignInPage();
	}
	
	
	
	
	public void createAccount() {
		
		
	}
	
	
	public void goToMoreTravel() {
		
	}
	
	public void goToTrips(){
		
	}
	
	
	
}
