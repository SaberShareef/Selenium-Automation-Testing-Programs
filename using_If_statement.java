package selenium.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class using_If_statement {

	public static void main(String[] args) {
		
		
		WebDriver driver=null;
		String browser="chrome";     //Change browser name to see execution with different browsers
		if (browser.equals("chrome")) 
		{
			driver=new ChromeDriver();
		}
		
		if (browser.equals("firefox")) 
		{
			driver=new FirefoxDriver();
		}
		
		
		driver.get("http://facebook.com");
		System.out.println(driver.getTitle());
		driver.close();
		
		
	}

}