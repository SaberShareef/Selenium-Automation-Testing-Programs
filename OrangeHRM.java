package selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit'][contains(.,'Login')]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(.,'Admin')]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("Please write yourself")).sendKeys("something");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'][contains(.,'-- Select --')])[1]")).click();
	}

}
