package selenium.practice;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keysfunctioning 
{
	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		driver.findElement(By.xpath("//input[contains(@name,'firstname')]"))
		.sendKeys("saber"+Keys.TAB+"shareef"+Keys.TAB+"sabermd585@gmail.com");
		
				
		driver.findElement(By.name("reg_email_confirmation__"))
		.sendKeys("sabermd585@gmail.com"+Keys.TAB+"Sabershareef");
		
		driver.findElement(By.id("day")).sendKeys("22");
		driver.findElement(By.id("month")).sendKeys("nov");
		driver.findElement(By.id("year")).sendKeys(Keys.ARROW_DOWN+"1998");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).sendKeys(Keys.SPACE);
		driver.findElement(By.name("websubmit")).click();
		
		//for login
		/*
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("sabermd585@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Saber@786");
		driver.findElement(By.name("login")).click();
		*/
		
		
	}

}
