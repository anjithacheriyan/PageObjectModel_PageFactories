package com.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class SignInPageLocator {
	
	@FindBy(xpath="//input[@id=\"signin-loginid\"]")
	public WebElement username;

	@FindBy(xpath="//input[@id=\"signin-password\"]")
	public WebElement password;
	
	@FindBy(xpath="//button[@id=\"submitButton\"]")
	public WebElement submitSignBtn;
	
	@FindAll({
		@FindBy(xpath="//button[@id=\"submitButton\"]"),
		@FindBy(xpath="//button[@id=\"submitButton\"]")
		
		
	})
	
	public WebElement hgskc;
}
