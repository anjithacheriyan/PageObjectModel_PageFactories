package com.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopNavigationLocator {
	
	
	@FindBy(xpath="//nav[@id=\"secondaryNav\"]//div[3]//button[@class=\"uitk-button uitk-button-small uitk-button-has-text uitk-menu-icon-trigger gc-header-custom-menu-trigger\"]")
	public WebElement signIn;
	@FindBy(xpath="//a[@class=\"uitk-button uitk-button-small uitk-button-fullWidth uitk-button-has-text uitk-button-primary\"]")
	public WebElement signInBtn;
}
