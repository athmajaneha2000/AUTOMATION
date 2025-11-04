package automationcore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import seleniumBasics.Base;

public class TestNGBase extends Base
{
	  public WebDriver driver;
      @BeforeMethod
	  public void initialiseBrowser()
	   {
		   driver = new ChromeDriver();
		   
		   driver.get(" https://www.saucedemo.com/v1/");
		   
		   driver.manage().window().maximize();
	  }
       @AfterMethod
	   public void driverCloseandQuit()
	   {
		  // driver.close();
		  // driver.quit();
}
}

