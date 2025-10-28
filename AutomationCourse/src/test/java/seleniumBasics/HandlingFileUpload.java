package seleniumBasics;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFileUpload extends Base
{
public void fileUploadingUsingSendKeys()
{
	driver.navigate().to("https://demo.guru99.com/test/upload/");
	WebElement choosefilebutton = driver.findElement(By.id("uploadfile_0"));
	choosefilebutton.sendKeys("C:\\Users\\Admin\\git\\AUTOMATION\\AutomationCourse\\src\\test\\resources\\ASSIGNMENT NO 3 MANUAL TESTING.pdf");
	
	WebElement checkbox = driver.findElement(By.id("terms"));
	checkbox.click();
	
	WebElement submitfilebutton = driver.findElement(By.id("submitbutton"));
	submitfilebutton.click();
}
    public void fileUploadingUsingRobot() throws AWTException 
    {
    	driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
    	WebElement selectpdffilebutton = driver.findElement(By.id("pickfiles"));
    	selectpdffilebutton.click();
    	
    	StringSelection sel = new StringSelection("C\\Users\\Admin\\git\\AUTOMATION\\AutomationCourse\\src\\test\\resources\\ASSIGNMENT NO 3 MANUAL TESTING.pdf");
    	Toolkit.getDefaultToolkit().getSystemClipboard().getContents(sel);
    	
    	Robot rob = new Robot();
    	rob.delay(2500);
    	
    	rob.keyPress(KeyEvent.VK_ENTER);
    	rob.keyRelease(KeyEvent.VK_ENTER);
    	
    	rob.keyPress(KeyEvent.VK_CONTROL);
    	rob.keyPress(KeyEvent.VK_V);
    	
    	rob.keyRelease(KeyEvent.VK_CONTROL);
    	rob.keyRelease(KeyEvent.VK_V);
    	
        rob.keyPress(KeyEvent.VK_ENTER);
        rob.keyRelease(KeyEvent.VK_ENTER);
    }
	

	public static void main(String[] args)
	{
		HandlingFileUpload upload = new HandlingFileUpload();
		upload.initialiseBrowser();
		//upload.fileUploadingUsingSendKeys();
		try {
			upload.fileUploadingUsingRobot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// TODO Auto-generated method stub

	}

}
