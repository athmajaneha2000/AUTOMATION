package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingAlerts extends Base
{
  public void verifySimplealert() 
  {
	driver.navigate().to("https://demoqa.com/alerts");
	WebElement clickbutton1 = driver.findElement(By.id("alertButton"));
	clickbutton1.click();
	 Alert al = driver.switchTo().alert();
	 al.accept();
	}
     public void verifyConfirmalert()
     {
    	 driver.navigate().to("https://demoqa.com/alerts");
    	 WebElement clickbutton3 = driver.findElement(By.id("confirmButton"));
    	 clickbutton3.click();
    	 Alert al = driver.switchTo().alert();
    	 al.accept();
     }
     public void verifyPromptalert()
     {
    	 driver.navigate().to("https://demoqa.com/alerts");
    	 WebElement clickbutton4 = driver.findElement(By.id("promtButton"));
    	 clickbutton4.click();
    	 Alert al = driver.switchTo().alert();
    	 al.sendKeys("NEHA");
    	 al.accept();
     }
	public static void main(String[] args)
	{
		HandlingAlerts alert = new HandlingAlerts();
		//alert.initialiseBrowser();
		//alert.verifySimplealert();
		//alert.verifyConfirmalert();
		alert.verifyPromptalert();
		// TODO Auto-generated method stub

	}

}
