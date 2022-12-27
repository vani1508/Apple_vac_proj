package com.objectrepositories;

import org.openqa.selenium.By;

public class Locators {
	
	//Create Account
	
	public final By Decline_offer= By.cssSelector("#bx-element-1820631-B7dy9qj > button");
	public final By My_account = By.xpath("/html/body/div[2]/div/header/div[1]/div/div[1]/div/div[2]/nav/ul/li[2]/a");
	public final By Sign_up = By.xpath("/html/body/div[2]/div/header/div[1]/div/div[1]/div/div[2]/nav/ul/li[2]/ul/li[3]/a");
	public final By Email_id=By.xpath("//*[@id=\'ctl01_ContentPlaceHolder_account_txtEmail\']");
	public final By Phone_Num=By.xpath("//*[@id=\"ctl01_ContentPlaceHolder_account_txtPhone\"]");
	public final By Password=By.xpath("//*[@id=\"ctl01_ContentPlaceHolder_account_txtPassword\"]");
	public final By Confirm_pwd=By.xpath("//*[@id=\"ctl01_ContentPlaceHolder_account_ConfirmPassword\"]");
	public final By First_Name=By.xpath("//*[@id=\"ctl01_ContentPlaceHolder_account_txtFirstName\"]");
	public final By Last_Name=By.xpath("//*[@id=\"ctl01_ContentPlaceHolder_account_txtLastName\"]");
	public final By Address=By.xpath("//*[@id=\"ctl01_ContentPlaceHolder_account_txtAddress1\"]");
	public final By Appart_No=By.xpath("//*[@id=\"ctl01_ContentPlaceHolder_account_txtApartmentNumber\"]");
	public final By City=By.xpath("//*[@id=\"ctl01_ContentPlaceHolder_account_txtCity\"]");
	public final By State=By.xpath("//*[@id=\"ctl01_ContentPlaceHolder_account_txtState\"]");
	public final By Postal=By.xpath("//*[@id=\"ctl01_ContentPlaceHolder_account_txtPostal\"]");
	public final By Security_que=By.xpath("//*[@id=\"ctl01_ContentPlaceHolder_account_drpdwnSecurityQuestion\"]");
	public final By Security_Ans=By.xpath("//*[@id=\"ctl01_ContentPlaceHolder_account_txtSecurityAnswer\"]");
	public final By Captcha=By.xpath("//*[@id=\"ctl01_ContentPlaceHolder_account_CaptchaControl1_CaptchaText\"]");
	public final By Account_setup=By.xpath("//*[@id=\"ctl01_ContentPlaceHolder_account_BtnCreate\"]");	
	
	// Login account
	
	public final By Sign_in = By.xpath("/html/body/div[2]/div/header/div[1]/div/div[1]/div/div[2]/nav/ul/li[2]/ul/li[2]/a");
	public final By Login_validemail=By.xpath("//*[@id=\"ctl01_ContentPlaceHolder_ctl02_MyAccountLogin_UserName\"]");
	public final By Login_validpwd=By.xpath("//*[@id=\"ctl01_ContentPlaceHolder_ctl02_MyAccountLogin_Password\"]");
	public final By Login_click=By.xpath("//*[@id=\"ctl01_ContentPlaceHolder_ctl02_MyAccountLogin_LoginButton\"]");
	public final By Sign_out=By.xpath("/html/body/div[2]/div/header/div[1]/div/div[1]/div/div[2]/nav/ul/li[2]/ul/li[5]/a");
	public final By Message=By.xpath("//*[@id=\"siteContainer\"]/div[2]/div/div/h2");
	public final By Forgot_pwd=By.xpath("//*[@id=\"ctl01_ContentPlaceHolder_ctl02_MyAccountLogin_RequestPasswordResetToken\"]");
	

	//Hotel Search
	public final By Leaving_From=By.xpath("//*[@id=\"orgAC_value\"]");
	public final By Leaving_To=By.xpath("//*[@id=\"desAC_value\"]");
	public final By Depart_date=By.xpath("//*[@id=\"depDT_value\"]");	
//	public final By Month_yr=By.xpath("//*[@id=\"datepicker-204-1338-title\"]/strong");
//	public final By Next_month=By.xpath("//*[@id=\"angular-res-tool-block-c205277d-d8ce-4750-aeb2-2ccdffe977a1\"]/div/div/fieldset/div[6]/div/div[5]/div[1]/div/ul/li/div/div/div/table/thead/tr[1]/th[3]/button");
	
	public final By Next_month=By.id("datepicker-201-511-title");
	
	

}
