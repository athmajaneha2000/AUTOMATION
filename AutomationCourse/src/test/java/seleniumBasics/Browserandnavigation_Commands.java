package seleniumBasics;

public class Browserandnavigation_Commands extends Base
{
	public void browserCommand()
	{
	   String title = driver.getTitle();
	   System.out.println(title);
	   
	   String source = driver.getPageSource();
	 //  System.out.println(source);
	   
	   String url = driver.getCurrentUrl();
	   System.out.println(url);
	   
	   String handleid = driver.getWindowHandle();
	   System.out.println(handleid);
	}
	public void navigationCommand()
	{
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

	public static void main(String[] args)
	{
		Browserandnavigation_Commands commands = new Browserandnavigation_Commands();
		commands.initialiseBrowser();
		//commands.browserCommand();
		commands.navigationCommand();
		
		// TODO Auto-generated method stub
	}

}
