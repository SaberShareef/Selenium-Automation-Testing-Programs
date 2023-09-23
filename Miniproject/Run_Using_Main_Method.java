package Miniproject;

public class Run_Using_Main_Method 
{
	public static void main(String[] args) 
	{
		CommonActions actions=new CommonActions();
		actions.setup_EdgeDriver();
		actions.Verifypagetitle("HRM");
		actions.Sendkeystoboxes(CommonObjects.username, "Admin");
		actions.Sendkeystoboxes(CommonObjects.password, "admin123");
		actions.Clickaction(CommonObjects.loginbtn);
		actions.Clickaction(CommonObjects.Myinfobtn);
		actions.explicitwait(5);
		actions.Clickaction(CommonObjects.dlnumber);
		actions.Sendkeystoboxes(CommonObjects.dlnumber, "sab");
		actions.Clickaction(CommonObjects.savebtn);
		
		
	}

}
