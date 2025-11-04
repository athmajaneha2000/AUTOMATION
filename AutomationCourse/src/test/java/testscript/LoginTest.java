package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import automationcore.TestNGBase;

public class LoginTest extends TestNGBase
{
	@Test
   public void verifyUserLoginWithValidCredentials()
	{
	  WebElement usernamefield  = driver.findElement(By.id("user-name"));
	  usernamefield.sendKeys("standard_user");
	  
	WebElement passwordfield = driver.findElement(By.id("password"));
	  passwordfield.sendKeys("secret_sauce");
	  
	 WebElement loginbutton = driver.findElement(By.id("login-button"));
	  loginbutton.click();
    }

	@Test
	public void verifyLoginWithInvalidUsernameandValidPassword()
	{
		 WebElement usernamefield  = driver.findElement(By.id("user-name"));
		  usernamefield.sendKeys("neha@123");
		  
		  WebElement passwordfield = driver.findElement(By.id("password"));
		  passwordfield.sendKeys("secret_sauce");
		  
		  WebElement loginbutton = driver.findElement(By.id("login-button"));
		  loginbutton.click();
	}
	@Test
	public void verifyLoginWithValidUsernameandInvalidPassword()
	{
		 WebElement usernamefield  = driver.findElement(By.id("user-name"));
		  usernamefield.sendKeys("standard_user");
		  
		  WebElement passwordfield = driver.findElement(By.id("password"));
		  passwordfield.sendKeys("1256455");
		  
		  WebElement loginbutton = driver.findElement(By.id("login-button"));
		  loginbutton.click();
	}
	@Test
	public void verifyInvalidCredentials()
	{
		 WebElement usernamefield  = driver.findElement(By.id("user-name"));
		  usernamefield.sendKeys("4521");
		  
		  WebElement passwordfield = driver.findElement(By.id("password"));
		  passwordfield.sendKeys("166544");
		  
		  WebElement loginbutton = driver.findElement(By.id("login-button"));
		  loginbutton.click();
	}
	
}
