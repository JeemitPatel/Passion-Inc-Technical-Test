package com.pisf.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pisf.qa.base.TestBase;

public class Loginpage extends TestBase {

	@FindBy(xpath = "//input[@type='text' and @id='firstName']")
	WebElement firstname;
	
	@FindBy (xpath ="//input[@type='text' and @id='lastName']")
	WebElement lastname;
	
	@FindBy (xpath = "//input[@type='text' and @id='emailAddress']")
	WebElement email;
	
	@FindBy (id = "bySubmit")
	WebElement submitbutton;
	
	public Loginpage() {
		PageFactory.initElements(driver, this);
	}
	
	public HomePage TC_PISF_Login_001(String fn, String ln, String emailid) {
		firstname.sendKeys(fn);
		lastname.sendKeys(ln);
		email.sendKeys(emailid);
		submitbutton.click();
		return new HomePage();
	}
		public HomePage TC_PISF_Login_002( String ln, String emailid) {

			lastname.sendKeys(ln);
			email.sendKeys(emailid);
			submitbutton.click();
			return new HomePage();
	}
		public HomePage TC_PISF_Login_003(String fn, String emailid) {
			firstname.sendKeys(fn);
			email.sendKeys(emailid);
			submitbutton.click();
			return new HomePage();
	}
		public HomePage TC_PISF_Login_004( String fn, String ln) {
            firstname.sendKeys(fn);
			lastname.sendKeys(ln);
			
			submitbutton.click();
			return new HomePage();
	}

		public HomePage TC_PISF_Login_005(String fn) {
			firstname.sendKeys(fn);
			submitbutton.click();
			return new HomePage();
		}
		public HomePage TC_PISF_Login_006(String ln) {
	
			lastname.sendKeys(ln);
			submitbutton.click();
			return new HomePage();
		}
		public HomePage TC_PISF_Login_007( String emailid) {
		
			email.sendKeys(emailid);
			submitbutton.click();
			return new HomePage();
		}
		public HomePage TC_PISF_Login_009(String fn, String ln, String emailid) {
			firstname.sendKeys(fn);
			lastname.sendKeys(ln);
			email.sendKeys(emailid);
			submitbutton.click();
			return new HomePage();
		}
		
		public HomePage TC_PISF_Login_010(String fn, String ln, String emailid) {
			firstname.sendKeys(fn);
			lastname.sendKeys(ln);
			email.sendKeys(emailid);
			submitbutton.click();
			return new HomePage();
		}
		public HomePage TC_PISF_Login_011(String fn, String ln, String emailid) {
			firstname.sendKeys(fn);
			lastname.sendKeys(ln);
			email.sendKeys(emailid);
			submitbutton.click();
			return new HomePage();
		}
		
	}


