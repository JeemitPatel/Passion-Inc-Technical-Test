package com.pisf.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pisf.qa.base.TestBase;
import com.pisf.qa.pages.HomePage;
import com.pisf.qa.pages.Loginpage;

public class LoginpageTest extends TestBase {
Loginpage loginpage;
HomePage homepage;
	
public LoginpageTest() {
	super();
}

@BeforeMethod
public void setUp() {
	 initialization();
	loginpage = new Loginpage();
}

@Test(priority=1)
public void TC_PISF_Login_001() {
homepage =	loginpage.TC_PISF_Login_001(prop.getProperty("firstname"), prop.getProperty("lastname"), prop.getProperty("email"));
	
}

@Test(priority=2)
public void TC_PISF_Login_002() {
homepage =	loginpage.TC_PISF_Login_002( prop.getProperty("lastname"), prop.getProperty("email"));
	
}

@Test(priority=3)
public void TC_PISF_Login_003() {
homepage =	loginpage.TC_PISF_Login_003(prop.getProperty("firstname"),  prop.getProperty("email"));
	
}

@Test(priority=4)
public void TC_PISF_Login_004() {
homepage =	loginpage.TC_PISF_Login_004(prop.getProperty("firstname"), prop.getProperty("lastname"));
	
}

@Test(priority=5)
public void TC_PISF_Login_005() {
homepage =	loginpage.TC_PISF_Login_005(prop.getProperty("firstname"));
	
}

@Test(priority=6)
public void TC_PISF_Login_006() {
homepage =	loginpage.TC_PISF_Login_006(prop.getProperty("lastname"));
	
}

@Test(priority=7)
public void TC_PISF_Login_007() {
homepage =	loginpage.TC_PISF_Login_007(( prop.getProperty("email")));
	
}

@Test(priority=8)
public void TC_PISF_Login_009() {
homepage =	loginpage.TC_PISF_Login_009(prop.getProperty("firstname"), prop.getProperty("lastname"), prop.getProperty("email"));
	
}

@Test(priority=9)
public void TC_PISF_Login_010() {
homepage =	loginpage.TC_PISF_Login_010(prop.getProperty("firstname"), prop.getProperty("lastname"), prop.getProperty("email"));
	
}

@Test(priority=10)
public void TC_PISF_Login_11() {
homepage =	loginpage.TC_PISF_Login_011(prop.getProperty("firstname"), prop.getProperty("lastname"), prop.getProperty("email"));
	
}


@AfterMethod
public void tearDown() {
	driver.quit();
}


}
