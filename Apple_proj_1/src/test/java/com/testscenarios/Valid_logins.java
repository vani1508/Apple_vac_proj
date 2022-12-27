package com.testscenarios;

import org.testng.annotations.Test;

import com.objectrepositories.Locators;
import com.utilities.CommonFunctions;
import org.testng.annotations.BeforeClass;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Valid_logins extends CommonFunctions {
	Locators loc=new Locators();
	
	
	 @BeforeClass
	  public void beforeClass() throws InterruptedException {
		  chromeBrowser();
		  driver.get("https://www.applevacations.com/#!/");
		  driver.manage().window().maximize();
		  Thread.sleep(3000);
	  }
  @Test
  public void f() throws IOException, InterruptedException  {
	  
	  clickByAnyLocator(loc.Decline_offer);
	  Thread.sleep(2000);
	  clickByAnyLocator(loc.My_account);
	  clickByAnyLocator(loc.Sign_in);
	  
	  FileInputStream fle=new FileInputStream(".\\src\\test\\resources\\TestData\\apple.xlsx");
	   Workbook wb= new XSSFWorkbook(fle);
	   Sheet sh=wb.getSheet("ValidInvalid");
	   
	   
		  for (int i=2; i<= sh.getLastRowNum();i++) {
			  Row row1=sh.getRow(i);
			 Cell Email = row1.getCell(0);
			Cell Password = row1.getCell(1);
	  
	  sendKeysByAnyLocator(loc.Login_validemail,Email.getStringCellValue());
	  sendKeysByAnyLocator(loc.Login_validpwd,Password.getStringCellValue());
	  clickByAnyLocator(loc.Login_click);
	  screenshots();
	  Thread.sleep(2000);
	  clickByAnyLocator(loc.My_account);
	  clickByAnyLocator(loc.Sign_out);
	  Thread.sleep(3000);
//	  screenshots();
//	  String error = driver.findElement(loc.Message).getText();
//	  screenshots();
//	  System.out.println(error);
//	  clickByAnyLocator(loc.Forgot_pwd);
//	  screenshots();
	   
		  }
	   }
 
}
