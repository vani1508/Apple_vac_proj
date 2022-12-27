package com.utilities;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import javax.swing.text.Highlighter.Highlight;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonFunctions {
	
	  public static WebDriver driver;
		
		public static void chromeBrowser() throws InterruptedException {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
										}
		
		public static void screenshots() throws IOException, InterruptedException{
			Date d = new Date();
			DateFormat abcd = new SimpleDateFormat("ddMMMyyyy_HHmmss");
			String timeStamp = abcd.format(d);
			 Thread.sleep(3000);
			//System will get the current screen as screenshot and store it into temp to RAM location
			File xyz =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//			From RAM location want to move it to specific folder,will use Selenium method FileHandler
			FileHandler.copy(xyz,new File(".\\Screenshots\\test_"+timeStamp+".png"));

	}
		
	      public static void sendKeysByAnyLocator(By locator,String Input){
	    	  if(driver.findElement(locator).isDisplayed()){
	    		  if(driver.findElement(locator).isEnabled()) {
	    			  driver.findElement(locator).clear();
	    			  driver.findElement(locator).sendKeys(Input);
	    		  }else {
	    			  System.out.println("given locator is not enabled:");
	    			      		  }
	    		  }else {
	    			  System.out.println("given locator is not diaplayed:");
	    		  }	}		  
	    			      		  
	    			  
	      public void clickByAnyLocator(By locator) {
	    	  if(driver.findElement(locator).isDisplayed()){
	    		  if(driver.findElement(locator).isEnabled()) {
	    			  driver.findElement(locator).click();
	    		  }else {
	    			  System.out.println("given locator is not enabled:");
	    		  }}}
	      
	      
	      public void selectByAnyVisibleText(By locator,String visibletext) {
	    	 WebElement element = driver.findElement(locator);
	    	 
	    	 if(element.isDisplayed()) {
	    		 if(element.isEnabled()) {
	    			 Select dropdown=new Select(element);
	    			 dropdown.selectByVisibleText(visibletext);
	    			 {
	    					System.out.println("The webelement is NOT Enabled, please check**************");
	    				}
	    			} else {
	    				System.out.println("The webelement is NOT displayed, please check**************");
	    			} } }
	      
	      public void selectCustomiseOptionFromTheDropdownValues(By locater, String visibleText) {
	    		WebElement element = driver.findElement(locater);
	    		if (element.isDisplayed()) {
	    			// isEnabled()
	    			if (element.isEnabled()) {

	    				Select dropdown = new Select(element);
	    				List<WebElement> dropdownValues = dropdown.getOptions();
	    				// Print the size of dropdown values
	    				System.out.println(dropdownValues.size());
	    				// Print the dropdown values
	    				for (int i = 0; i < dropdownValues.size(); i++) {
	    					System.out.println(dropdownValues.get(i).getText());

	    					// Select given option from the dropdown
	    					if (dropdownValues.get(i).getText().equals(visibleText)) {
	    						dropdown.selectByIndex(i);
	    						break;
	    					}}}}

//	  		} else {
//	  			System.out.println("The webelement is NOT Enabled, please check**************");
//	  		}
	      }
	      
	      public void getCaptchaFromConsole(By locator) throws InterruptedException {
	    	  WebElement ele = driver.findElement(locator);
	    	Scanner sc=new Scanner(System.in);
	    	  System.out.println("Enter the captcha:");
	    	  String captcha=sc.next();
	    	  Thread.sleep(3000);
	    	  if(ele.isDisplayed() && ele.isEnabled()) {
	    		  highlightElement(ele);
	    		  ele.clear();
	    		  highlightElement(ele);
	    		  ele.sendKeys(captcha);
	    		  
	    	  }
	      }

		private void highlightElement(WebElement ele) {
			// TODO Auto-generated method stub
			
		}

		private WebElement findElement(By locator) {
			// TODO Auto-generated method stub
			return null;
		}
		
		//date picker code
		
//		String year="2023";
//		String month="January";
//		String date="15";
//		
//		while(true)
//		{
//		   String monthyear = driver.findElement(By.xpath("//*[@id=\"datepicker-204-1338-title\"]/strong")).getText();
//		   
//		   String arr[]=monthyear.split("");
//		   String mon= arr[0];
//		   String yr=arr[1];
//		   if(mon.equalsIgnoreCase(month)&& yr.equals(year))
//            break;
//		   else 
//	driver.findElement(By.xpath("//*[@id=\"angular-res-tool-block-d27ed5bd-980c-44d8-b6d0-d456ab7e6bbb\"]/div/div/fieldset/div[6]/div/div[5]/div[1]/div/ul/li/div/div/div/table/thead/tr[1]/th[3]")).click();
//						}
//
//  List<WebElement> alldates=driver.findElements(By.xpath("//*[@id=\"angular-res-tool-block-d27ed5bd-980c-44d8-b6d0-d456ab7e6bbb\"]//td"));
//   for (WebElement ele : alldates) {
//	String dt= ele.getText();
//	if(dt.equals(date)) {
//		ele.click();
//		break;
//	}
		
	      
	      
	}
	    