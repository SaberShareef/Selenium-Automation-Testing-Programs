package Selenium_DropDown.list;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class List 
{
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.findElement(By.linkText("Select Product Type")).click();
		Thread.sleep(3000);
		
		WebElement emi=driver.findElement(By.xpath("//li[@value='5'][contains(.,'EMI')]"));
		emi.click();
	}

}
