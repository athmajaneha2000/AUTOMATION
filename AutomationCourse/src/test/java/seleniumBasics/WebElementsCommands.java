package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementsCommands extends Base
{
  public void verifyCommands()
  {
	  driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	  
	  WebElement messagebox = driver.findElement(By.xpath("//input[@id='single-input-field']"));
	  messagebox.sendKeys("Hello");
	  
	  WebElement showmessagebutton = driver.findElement(By.xpath("//button[@id='button-one']"));
	  showmessagebutton.click();
  }
	public static void main(String[] args) 
	{
		WebElementsCommands commands = new WebElementsCommands();
		commands.initialiseBrowser();
		commands.verifyCommands();
		// TODO Auto-generated method stub

	}

}
