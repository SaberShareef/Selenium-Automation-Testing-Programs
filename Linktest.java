package selenium.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktest 
{
	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://instagram.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		//Identifying link using linktext locator [Using Original linkname]
		Thread.sleep(3000);
		driver.findElement(By.linkText("Locations")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("India")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Somajiguda")).click();

		
		//Identifying link using Partialinktext locator [Using Partial linkname]
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Charminar")).click();
		
	}

}


