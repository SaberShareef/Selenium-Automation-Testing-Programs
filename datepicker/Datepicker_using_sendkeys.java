package selenium.practice.datepicker;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Datepicker_using_sendkeys 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://jqueryui.com/resources/demos/datepicker/dropdown-month-year.html");
		driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("10/04/2016"+Keys.ESCAPE);
		
	}

}
