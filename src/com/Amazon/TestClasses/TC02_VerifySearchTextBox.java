package com.Amazon.TestClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Amazon.POMClasses.HomePOMClass;
import com.Amazon.POMClasses.POM_LoginClass;

public class TC02_VerifySearchTextBox
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is open");
		
		driver.manage().window().maximize();
		System.out.println("Browser is Maximize");
		
		driver.get("https://www.amazon.in/gp/css/homepage.html?ref_=nav_youraccount_btn");
		System.out.println("URL is opened");
		

		POM_LoginClass lc=new POM_LoginClass(driver);
		lc.clickHelloLogin();
		lc.sendusername();
		lc.ClickContinueButton();
		lc.sendpassword();
		Thread.sleep(15000);
		lc.ClickSigninButton();
		
		HomePOMClass hp=new HomePOMClass(driver);
		hp.sendkeySearchTextBox();
		hp.ClickSearchTextBoxButton();
		
	}

}
