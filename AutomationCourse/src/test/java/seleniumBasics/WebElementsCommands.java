package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementsCommands extends Base
{
  public void verifyCommands()
  {
	  driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	  
	  WebElement messageinputfield =driver.findElement(By.xpath("//input[@id='single-input-field']"));
	  messageinputfield.sendKeys("NEHA");
	  
	  WebElement showmessagebutton = driver.findElement(By.xpath("//button[@id='button-one']"));
	  System.out.println(showmessagebutton.isDisplayed());
	  System.out.println(showmessagebutton.isEnabled());
	  
	  showmessagebutton.click();
	  
	  WebElement yourmessagefield = driver.findElement(By.xpath("//div[@id='message-one']"));
	  System.out.println(yourmessagefield.getText());
	  
	  WebElement gettotalbutton = driver.findElement(By.id("button-two"));
	  System.out.println(gettotalbutton.getTagName());
	  
	  System.out.println(showmessagebutton.getCssValue("background-color"));
	  
  }
	public static void main(String[] args) 
	{
		WebElementsCommands commands = new WebElementsCommands();
		commands.initialiseBrowser();
		commands.verifyCommands();
		
		// TODO Auto-generated method stub

	}

}
