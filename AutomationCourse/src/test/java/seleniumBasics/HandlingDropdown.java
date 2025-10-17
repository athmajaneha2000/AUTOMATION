package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown extends Base
{
  public void verifyDropdown()
  {
	  driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html"); 
	  WebElement dropdown1 = driver.findElement(By.id("dropdowm-menu-1"));
	  
	  Select select = new Select(dropdown1);
	  //select.selectByIndex(2);
	  //select.selectByValue("python");
	  select.selectByVisibleText("Python");
  }
   public void verifyCheckbox()
   {
	   driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html"); 
	   WebElement checkbox2 = driver.findElement(By.xpath("//input[@value='option-2']"));
	   checkbox2.click();
   }
   public void verifyRadiobutton()
   {
	   driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
	   WebElement radiobutton3 = driver.findElement(By.xpath("//input[@value='yellow']"));
	   radiobutton3.click();
	   System.out.println(radiobutton3.isSelected());
   }
	public static void main(String[] args) 
	{
		HandlingDropdown dropdown = new HandlingDropdown();
	    dropdown.initialiseBrowser();
		dropdown.verifyDropdown();
		//dropdown.verifyCheckbox();
		//dropdown.verifyRadiobutton();
		
		// TODO Auto-generated method stub
    }

}
