package com.testscenarios;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.objectrepositories.Locators;
import com.utilities.CommonFunctions;

public class AccountCreation extends CommonFunctions {
	
	Locators loc=new Locators();
	
	  @BeforeClass
	  public void beforeClass() throws InterruptedException {
		  chromeBrowser();
		  driver.get("https://www.applevacations.com/#!/");
		  driver.manage().window().maximize();
		  Thread.sleep(3000);
	  }
		  
		  @Test
		  public void f() throws InterruptedException, IOException {
			  clickByAnyLocator(loc.Decline_offer);
			  Thread.sleep(3000);
			  clickByAnyLocator(loc.My_account);
			  clickByAnyLocator(loc.Sign_up);
			  
			  FileInputStream fle=new FileInputStream(".\\src\\test\\resources\\TestData\\apple.xlsx");
			   Workbook wb= new XSSFWorkbook(fle);
			   Sheet sh=wb.getSheet("NewAccount");
			  
			  for (int i=1; i<= sh.getLastRowNum();i++) {
				  Row row1=sh.getRow(i);
				 Cell Email = row1.getCell(0);
				Cell PhoneNumber = row1.getCell(1);
				Cell Password = row1.getCell(2);
				Cell ConfirmPassword = row1.getCell(3);
				Cell FirstName = row1.getCell(4);
				Cell LastName = row1.getCell(5);
				Cell Address = row1.getCell(6);
				Cell ApartmentNumber = row1.getCell(7);
				Cell City = row1.getCell(8);
				Cell State= row1.getCell(9);
				Cell PostalCode = row1.getCell(10);
				Cell SecurityQuestion = row1.getCell(11);
				Cell SecurityAnswer = row1.getCell(12);
			    	
				//Account creation
			  sendKeysByAnyLocator(loc.Email_id,Email.getStringCellValue());
			  sendKeysByAnyLocator(loc.Phone_Num,PhoneNumber.getStringCellValue());
			  sendKeysByAnyLocator(loc.Password,Password.getStringCellValue());
			  sendKeysByAnyLocator(loc.Confirm_pwd,ConfirmPassword.getStringCellValue());
			  sendKeysByAnyLocator(loc.First_Name,FirstName.getStringCellValue());
			  sendKeysByAnyLocator(loc.Last_Name,LastName.getStringCellValue());
			  sendKeysByAnyLocator(loc.Address,Address.getStringCellValue());
			  sendKeysByAnyLocator(loc.Appart_No,ApartmentNumber.getStringCellValue());
			  sendKeysByAnyLocator(loc.City,City.getStringCellValue());
			  selectByAnyVisibleText(loc.State,State.getStringCellValue());
			  sendKeysByAnyLocator(loc.Postal,City.getStringCellValue());
			  selectByAnyVisibleText(loc.Security_que,SecurityQuestion.getStringCellValue());
			  sendKeysByAnyLocator(loc.Security_Ans,SecurityAnswer.getStringCellValue());
			  
			 	  }
			  Thread.sleep(3000);
			  getCaptchaFromConsole(loc.Captcha);
			  clickByAnyLocator(loc.Account_setup);
			  
			//*[@id="ctl01_ContentPlaceHolder_account_BtnCreate"]
			 
		 
			  
			  
////			driver.findElement(By.cssSelector("#bx-element-1820631-B7dy9qj > button")).click();	
//			Thread.sleep(3000);
//			driver.findElement(By.xpath("/html/body/div[2]/div/header/div[1]/div/div[1]/div/div[2]/nav/ul/li[2]/a")).click();
//			driver.findElement(By.xpath("/html/body/div[2]/div/header/div[1]/div/div[1]/div/div[2]/nav/ul/li[2]/ul/li[3]/a")).click();
			  
		  }
		

		}
