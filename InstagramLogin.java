package Webpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin
{
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver obj=new ChromeDriver();
		obj.get("https://www.instagram.com/");	
		Thread.sleep(2000);
		obj.findElement(By.name("username")).sendKeys("sabermd@786");
		Thread.sleep(2000);
		obj.findElement(By.name("password")).sendKeys("something");
		Thread.sleep(2000);
		obj.findElement(By.xpath("(//div[@class='x9f619 xjbqb8w x78zum5 x168nmei x13lgxp2 x5pf9jr xo71vjh x1xmf6yo x1e56ztr x540dpk x1m39q7l x1n2onr6 x1plvlek xryxfnj x1c4vz4f x2lah0s xdt5ytf xqjyukv x1qjc9v5 x1oa3qoh x1nhvcw1'][contains(.,'Log in')])[1]")).click();
		obj.findElement(By.xpath("//span[@class='_ab37'][contains(.,'Log in with Facebook')]")).click();//login using facebook credintials
		Thread.sleep(2000);
		obj.get("https://www.instagram.com/");
		Thread.sleep(2000);
		obj.findElement(By.xpath("//span[@class='_aacl _aaco _aacw _aad0 _aad7'][contains(.,'Sign up')]")).click();
		

	}

}
