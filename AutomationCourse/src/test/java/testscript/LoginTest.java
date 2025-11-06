package testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import automationcore.TestNGBase;
import pages.LoginPage;
import utilities.ExelUtility;

public class LoginTest extends TestNGBase
{
	@Test
   public void verifyUserLoginWithValidCredentials() throws IOException
	{
		String username= ExelUtility.getStringData(0, 0, "LoginPage");
		String password = ExelUtility.getStringData(0, 1, "LoginPage");
		
	//  WebElement usernamefield  = driver.findElement(By.id("user-name"));
	//  usernamefield.sendKeys("standard_user");
	//  WebElement passwordfield = driver.findElement(By.id("password"));
	//  passwordfield.sendKeys("secret_sauce");
	//  WebElement loginbutton = driver.findElement(By.id("login-button"));
	//  loginbutton.click();
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnLoginButton();
    }

	@Test
	public void verifyLoginWithInvalidUsernameandValidPassword() throws IOException
	{
		String username = ExelUtility.getStringData(1, 0,"LoginPage");
		String password = ExelUtility.getStringData(1, 1, "LoginPage");
		
		/* WebElement usernamefield  = driver.findElement(By.id("user-name"));
		  usernamefield.sendKeys("neha@123");
		  WebElement passwordfield = driver.findElement(By.id("password"));
		  passwordfield.sendKeys("secret_sauce");
		  WebElement loginbutton = driver.findElement(By.id("login-button"));
		  loginbutton.click();*/
		  
		  LoginPage loginpage = new LoginPage(driver);
			loginpage.enterUsernameOnUsernameField(username);
			loginpage.enterPasswordOnPasswordField(password);
			loginpage.clickOnLoginButton();
	}
	@Test
	public void verifyLoginWithValidUsernameandInvalidPassword() throws IOException 
	{
		String username = ExelUtility.getStringData(2, 0,"LoginPage");
		String password = ExelUtility.getStringData(2, 1, "LoginPage");
		
   		/* WebElement usernamefield  = driver.findElement(By.id("user-name"));
		  usernamefield.sendKeys("standard_userr");
		  WebElement passwordfield = driver.findElement(By.id("password"));
		  passwordfield.sendKeys("secret");
		   WebElement loginbutton = driver.findElement(By.id("login-button"));
		  loginbutton.click(); */
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameOnUsernameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnLoginButton();
	}
	@Test
	public void verifyInvalidCredentials() throws IOException
	{
		String username = ExelUtility.getStringData(3, 0,"LoginPage");
		String password = ExelUtility.getStringData(3, 1,"LoginPage");
		
		/*
		  WebElement usernamefield  = driver.findElement(By.id("user-name"));
		  usernamefield.sendKeys("neha");
		  WebElement passwordfield = driver.findElement(By.id("password"));
		  passwordfield.sendKeys("ahen");
		   WebElement loginbutton = driver.findElement(By.id("login-button"));
		  loginbutton.click();
		  */
		  
		  LoginPage loginpage = new LoginPage(driver);
			loginpage.enterUsernameOnUsernameField(username);
			loginpage.enterPasswordOnPasswordField(password);
			loginpage.clickOnLoginButton();
	}
	
}
