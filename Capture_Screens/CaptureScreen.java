package Capture_Screens;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreen 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileHandler.createDir(new File("screens"));
		
		FileHandler.copy(src, new File("screens\\image.png"));
		Thread.sleep(2000);
		driver.quit();
		
		WebDriver driver1=new EdgeDriver();
		driver1.get("https://www.instagram.com/");
		File src1=((TakesScreenshot)driver1).getScreenshotAs(OutputType.FILE);
		
		FileHandler.createDir(new File("Screens"));
		
		FileHandler.copy(src1,new File("screens\\image1.png"));
		
	}

}
