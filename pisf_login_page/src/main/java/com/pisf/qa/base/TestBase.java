package com.pisf.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
public static WebDriver driver;
public static Properties prop;

	public TestBase() {
		try {
	
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\LearnJAVA\\pisf_login_page\\src\\main\\java\\com\\pisf\\qa\\configuration\\testdata.properties");
			prop.load(ip);
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
}
	public static void initialization(){
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\jeemi\\\\Downloads\\\\chrome webdriver\\\\chromedriver.exe");	
			driver = new ChromeDriver(); 
		}
		else if(browserName.equals("FF")){
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\jeemi\\Downloads\\GeckoDriver\\geckodriver.exe");	
			driver = new FirefoxDriver(); 
}	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
driver.get(prop.getProperty("url"));
	
}}
