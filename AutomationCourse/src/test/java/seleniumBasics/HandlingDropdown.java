package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown extends Base
{
  public void verifyDropdown()
  {
	  driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html"); 
	  WebElement dropdownone= driver.findElement(By.id("dropdowm-menu-1"));
	  
	   Select select = new Select(dropdownone);
	   select.selectByIndex(2);
	   
    }
	public static void main(String[] args) 
	{
		HandlingDropdown dropdown = new HandlingDropdown();
	    dropdown.initialiseBrowser();
		dropdown.verifyDropdown();
		// TODO Auto-generated method stub

	}

}
