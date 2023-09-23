package Library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Run_Using_Mainclass 
{
	public static void main(String[] args) 
	{
		CommonActions actions=new CommonActions();
		actions.setup_EdgeDriver();
		actions.Verifypagetitle("Instagram");
		actions.Sendkeystoboxes(CommonObjects.instauserid, "null");
		actions.Sendkeystoboxes(CommonObjects.instapassword, "Exptitle");
		actions.Clickaction(CommonObjects.instaloginbtn);
		
	}
}

