package Auto_Suggestionfield;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Autosugestion 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/leave/viewLeaveList");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit'][contains(.,'Login')]")).click();
	
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'Type for hints...')]")).sendKeys("sa");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(.,'Sania  Shaheen')]")).click();
		
		
		
		
	}

}
