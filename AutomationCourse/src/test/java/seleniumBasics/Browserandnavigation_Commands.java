package seleniumBasics;

public class Browserandnavigation_Commands extends Base
{
	public void browserCommand()
	{
	   String title = driver.getTitle();
	   System.out.println(title);
	   
	   String source = driver.getPageSource();
	   System.out.println(source);
	   
	   
	}

	public static void main(String[] args)
	{
		Browserandnavigation_Commands commands = new Browserandnavigation_Commands();
		commands.initialiseBrowser();
		commands.browserCommand();
		
		// TODO Auto-generated method stub
	}

}
