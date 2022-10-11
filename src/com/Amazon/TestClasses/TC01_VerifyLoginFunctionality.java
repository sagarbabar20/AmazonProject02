
package com.Amazon.TestClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Amazon.POMClasses.POM_LoginClass;

public class TC01_VerifyLoginFunctionality
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", 
			"C:\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	System.out.println("Browser is open");
	
	driver.manage().window().maximize();
	System.out.println("Browser is Maximize");
	
	driver.get("https://www.amazon.in/gp/css/homepage.html?ref_=nav_youraccount_btn");
	System.out.println("URL is opened");
	
	POM_LoginClass s=new POM_LoginClass(driver);
	
	s.clickHelloLogin();
	
	s.sendusername();
	
	s.ClickContinueButton();
	
	s.sendpassword();
		
	s.ClickSigninButton();
	
}
}
