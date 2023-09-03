package Capture_Screens;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class Capture_Screen_with_Timestamp 
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement Form= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]"));
		File src=Form.getScreenshotAs(OutputType.FILE);
		String Time=new SimpleDateFormat("dd-hh-mm").format(new Date());
		
		FileHandler.copy(src, new File("screens\\image"+Time+".png"));
		
	}

}
