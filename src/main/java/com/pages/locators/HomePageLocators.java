package com.pages.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {
	
	
	
	@FindBy(xpath = "//a[@href=\"?pwaLOB=wizard-flight-pwa\"]")
	public WebElement flightTab;
	
	
	
	@FindBy(xpath = "//button[@data-stid=\"location-field-leg1-origin-menu-trigger\"]")
	public WebElement flyingFrom;
	
	
	@FindBy(xpath = "//ul[@data-stid=\"location-field-leg1-origin-results\"]//li[1]")
	public WebElement firstFromFlyingFromList;
	
	
	@FindBy(xpath = "//button[@data-stid=\"location-field-leg1-destination-menu-trigger\"]")
	public WebElement flyingTo;
	
	@FindBy(xpath = "//ul[@data-stid=\"location-field-leg1-destination-results\"]//li[1]")
	public WebElement firstFromFlyingToList;
	
	
	@FindBy(xpath = "//button[@id=\"d1-btn\"]")
	public WebElement departingDate;
	
	@FindBy(xpath = "//button[@id=\"d2-btn\"]")
	public WebElement returningDate;
	
	@FindBy(xpath = "//a[@aria-label=\"Preferred flight class\"]")
	public WebElement flightClass;
	
	@FindBy(xpath = "//div[@class=\"uitk-menu-container elevation-8 uitk-menu-open uitk-menu-pos-left\"]//div[@class=\"uitk-list uitk-type-400\"]//a[4]")
	public WebElement businessClassRadio;
	
	@FindBy(xpath = "//button[@data-testid=\"preferred-class-dialog-confirm-button\"]")
	public WebElement classSelectionDoneBtn;
	
	@FindBy(xpath = "//div[@class=\"uitk-layout-grid uitk-layout-grid-gap-three uitk-layout-grid-columns-small-1 uitk-layout-grid-columns-medium-8 all-b-margin-two all-t-margin-six\"]")
	public WebElement block;
	
	
	@FindBy(xpath="//li[@role=\"presentation\"]")
	public List<WebElement> tabcount;
	
	
	@FindBy(xpath = "//button[@data-testid=\"submit-button\"]")
	public WebElement searchButton;
	
	
}
