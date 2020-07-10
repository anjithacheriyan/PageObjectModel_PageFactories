package com.base;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.pages.actions.TopNavigation;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.utilities.ExcelReader;
import com.utilities.ExtentManager;
import com.utilities.TestUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Page{

	public static WebDriver driver;
	public static Logger log=Logger.getLogger("devpinoyLogger");
	public static ExcelReader excel=new ExcelReader("/Users/anji/eclipse-UdemyTrainings/PageObjectModel_PageFactories/src/test/resources/excel/testdata.xlsx");
	public static WebDriverWait wait;	public static String browser;
	public  ExtentReports rep=ExtentManager.getInstance();
	public static ExtentTest test;
	public static TopNavigation topnavigation;
	
	
	
	public static void initConfig(){
		
		
			
			

			if(Constants.browser.equals("chrome")) {
				
				//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//src//test//resources//executables//chromedriver");
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
			
				log.debug("Chrome launched !!!");
			
			}else if(Constants.browser.equals("safari")){ 
	
				driver=new SafariDriver();
				log.debug("Safari launched !!!");
			
				
		}
			
			driver.get(Constants.testurl);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Constants.implicitwait, TimeUnit.SECONDS);
			topnavigation =new TopNavigation(driver);
			
		}
		
		
		

	
	public  static Boolean IsElementPrsent(By by) {
		
		try {
				driver.findElement(by);
				return true;
		    }
			
		catch(NoSuchElementException e) {
			
			
			return false;
		}
		
	}
	
	
	
	public void verifyEquals(WebElement expected,WebElement actual) throws IOException {
		
		try {
			Assert.assertEquals(actual, expected);
		}
		catch(Throwable t) {
			
		TestUtil.captureScreenshot();
		//reportng
		Reporter.log("<br>"+"Verification Failed:"+t.getMessage()+"<br>");	
		Reporter.log("<br>");	
		Reporter.log("<br>");	
		Reporter.log("<br><target=\"_blank\">"+"<href="+TestUtil.screenshotName+">"+"<img src="+TestUtil.screenshotName+">"+"<br>");	
			
		//extentReport
				test.log(LogStatus.FAIL,"Verification failed with exception"+t.getMessage());
				test.log(LogStatus.INFO, test.addScreenCapture(TestUtil.screenshotName));
				
		
		}
		
		
		
	}
	
	
	public static void click(WebElement locator){
		
		locator.click();
		test.log(LogStatus.INFO, "Clicking on:"+locator);
		log.debug(locator);
		
	}
	
	
	public void type(WebElement locator,String value) {
		
		locator.sendKeys(value);
		test.log(LogStatus.INFO, "typing on:"+locator);
		log.debug(locator);
		
	}
	
	
	public void waitForVisibility(WebElement locator){
			
			wait.until(ExpectedConditions.visibilityOfElementLocated((By) (locator)));
			test.log(LogStatus.INFO, "Waiting for:"+locator);
			
		}
	
	
	static WebElement dropdown;
	public void select(WebElement locator,String value){
		
		dropdown=locator;
		test.log(LogStatus.INFO, "selecting dropdown :"+locator);
		
		Select select=new Select(dropdown);
		select.selectByVisibleText(value);
		test.log(LogStatus.INFO, "selecting value :"+value);
		
	}
	
	
	
	
	public static void quitBrowser() {
		
		
			driver.close();
		
		
	}
	
}
