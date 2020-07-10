package com.pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.base.Page;
import com.pages.locators.SignInPageLocator;

public class SignInPage extends Page {
	
	public SignInPageLocator SignInPageLoc;
	
	public SignInPage(){
		
		this.SignInPageLoc=new SignInPageLocator();
		AjaxElementLocatorFactory locator=new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(locator, this.SignInPageLoc);
		
		
	}

	
	public void loginIn(String Username,String password){
		
		type(SignInPageLoc.username,Username);
		type(SignInPageLoc.password,password);
		
		click(SignInPageLoc.submitSignBtn);
		
	}
	
	
	
	
	
	
	
	
	

}
