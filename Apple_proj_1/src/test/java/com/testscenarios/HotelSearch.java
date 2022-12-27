package com.testscenarios;

import org.testng.annotations.Test;

import com.objectrepositories.Locators;
import com.utilities.CommonFunctions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;

public class HotelSearch extends CommonFunctions{
	Locators loc=new Locators();
	
	
	  @BeforeClass
	  public void beforeClass() throws InterruptedException {
		  chromeBrowser();
		  driver.get("https://www.applevacations.com/#!/");
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
	  }
  @Test
  public void f() throws InterruptedException {
	  
	  clickByAnyLocator(loc.Decline_offer);
	  Thread.sleep(2000);	  
	  sendKeysByAnyLocator(loc.Leaving_From,"RDD");
	  Thread.sleep(2000);
	  sendKeysByAnyLocator(loc.Leaving_To,"LON");
	   Thread.sleep(2000);
	   clickByAnyLocator(loc.Depart_date);
	  selectByAnyVisibleText(loc.Next_month,"01/15/2023");
	  
	  
	  
	  
//	  driver.findElement(By.id("scc_rt_vendorpackage_1_H01")).click();
//	  Thread.sleep(3000);
//	  //Calender date selection
//	  driver.findElement(By.id("depDT_value")).click();
//	  Thread.sleep(3000);
//	  //Click on > sysmbol for move to next month/year
//	  driver.findElement(By.xpath("(//table)[2]/thead/tr[1]/th[3]/button")).click();
//	  Thread.sleep(3000);
//	  driver.findElement(By.xpath("(//table)[2]/tbody/tr[4]/td[3]/button")).click();
//	  Thread.sleep(3000);
	  
	 
	}
  
  
    

  @AfterClass
  public void afterClass() {
  }

}
