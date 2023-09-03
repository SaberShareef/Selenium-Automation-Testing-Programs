package Capture_Screens;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class Capture_Screen_at_Element 
{
	public static void main(String args[]) throws IOException
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement form= driver.findElement(By.xpath("//form[contains(@data-testid,'royal_login_form')]"));
		File src= form.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("screens\\image3.png"));
	}

}
