package com.Amazon.TestClasses;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Amazon.POMClasses.HomePOMClass;
import com.Amazon.POMClasses.POMClassMobilePage;
import com.Amazon.POMClasses.POM_LoginClass;
import com.Amazon.POMClasses.SwitchWindowPOMClass;

public class TC04_VerifySwitchToWindowFunctionality 
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
	

	POM_LoginClass lc=new POM_LoginClass(driver);
	lc.clickHelloLogin();
	lc.sendusername();
	lc.ClickContinueButton();
	lc.sendpassword();
	lc.ClickSigninButton();
	
	HomePOMClass hp=new HomePOMClass(driver);
	hp.sendkeySearchTextBox();
	hp.ClickSearchTextBoxButton();
	
	POMClassMobilePage mp=new POMClassMobilePage(driver);
	mp.clickSamsungmobile();
	
	List<String> allpagesAddress=new ArrayList<String>(driver.getWindowHandles());
		
	driver.switchTo().window(allpagesAddress.get(1));
	
	SwitchWindowPOMClass sw=new SwitchWindowPOMClass(driver);
	
	sw.ClickonAddtoCart();
	
	
	
	}
}
