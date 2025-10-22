package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class HandlingDropdown extends Base
{
  public void verifyDropdown()
  {
	  driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html"); 
      WebElement dropdown1 = driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']"));
      
       Select select = new Select(dropdown1);
       //select.selectByIndex(3);
       //select.selectByValue("java");
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
	   WebElement radiobutton4 = driver.findElement(By.xpath("//input[@value='orange']"));
	   
	   radiobutton4.click();
	   System.out.println(radiobutton4.isSelected());
   }
	public static void main(String[] args) 
	{
		HandlingDropdown dropdown = new HandlingDropdown();
	    dropdown.initialiseBrowser();
		//dropdown.verifyDropdown();
		//dropdown.verifyCheckbox();
	    dropdown.verifyRadiobutton();
		// TODO Auto-generated method stub
    }

}
