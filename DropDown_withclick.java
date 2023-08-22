package Selenium_DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DropDown_withclick
{
	public static void main(String args[])
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/reg/");
		
		driver.findElement(By.id("day")).click();
		driver.findElement(By.xpath("//option[@value='9'][contains(.,'9')]")).click();
		
		driver.findElement(By.id("month")).click();
		driver.findElement(By.xpath("//option[@value='11'][contains(.,'Nov')]")).click();
		
		driver.findElement(By.id("year")).click();
		driver.findElement(By.xpath("//option[@value='1998'][contains(.,'1998')]")).click();
		
		
	}

}
