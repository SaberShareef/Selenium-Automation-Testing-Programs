package Selenium_DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDD 
{
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver= new EdgeDriver();
		driver.get("https://near-me.hdfcbank.com/branch-atm-locator/?lat=17.3688366&long=78.5307219&shared=1");
		
		//driver.findElement(By.xpath("//option[@value='chhattisgarh'][contains(.,'Chhattisgarh')]")).click();
		
		WebElement statedd= driver.findElement(By.id("customState"));
		new Select(statedd).selectByVisibleText("Assam");
		
		Thread.sleep(3000);
		WebElement citydd= driver.findElement(By.name("cityName"));
		new Select(citydd).selectByValue("biswanath-chariali");
		
		driver.findElement(By.id("customLocality")).sendKeys("Nehru Nagar");
		
		Thread.sleep(3000);
		WebElement radiumdd= driver.findElement(By.id("customRadius"));
		new Select(radiumdd).selectByIndex(3);
		
		driver.findElement(By.id("amenity_category_order_types50")).click();
		driver.findElement(By.id("amenity_service_types57")).click();
		
		driver.findElement(By.xpath("//span[contains(.,'Search')]")).click();
		
		}
}
