package Capture_Screens;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class Capture_Fullscreen 
{
	public static void main(String args[])throws Exception
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement Footer= driver.findElement(By.xpath("//html[contains(@lang,'en')]"));
		File src=Footer.getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(src, new File("screens\\image11.png"));
	}

}
