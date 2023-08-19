package selenium.practice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Opening_chrome_browser 
{
	public static void main(String args[])
	{
		
		ChromeDriver obj=new ChromeDriver();			//opening chrome driver
			
		obj.get("https://www.facebook.com/login/");		//oprning facebook using get__url method of wendriver
		String title1=obj.getTitle();					//using get_title method storing title
		System.out.println(title1);						//printing title of webpage
			
		obj.manage().window().fullscreen();				//performing window actions
		obj.manage().window().minimize();
		obj.manage().window().maximize();
			
		obj.get("https://www.instagram.com/");
		String title2=obj.getTitle();
		System.out.println(title2);
		
		obj.manage().window().fullscreen();
		obj.manage().window().maximize();
		obj.manage().window().minimize();
				
		obj.close();									// closing window using close() method
		
		
							
		EdgeDriver edge=new EdgeDriver();				//opeing edge using EdgeDriver command 
		edge.get("https://www.facebook.com/login/");
		String title3=edge.getTitle();
		System.out.println(title3);
		
		String title4=edge.getTitle();
		System.out.println(title4);
		
		edge.manage().window().fullscreen();
		edge.manage().window().minimize();
		edge.manage().window().maximize();
		edge.close();
		
	}
}
