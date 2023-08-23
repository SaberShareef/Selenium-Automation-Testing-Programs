package selenium.practice.datepicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Datepicker_Month_Year {

	public static void main(String[] args) 
	{
		WebDriver driver = new EdgeDriver();
		driver.get("https://jqueryui.com/resources/demos/datepicker/dropdown-month-year.html");
		driver.findElement(By.xpath("//input[contains(@type,'text')]")).click();
		driver.findElement(By.xpath("//option[@value='2016'][contains(.,'2016')]")).click();
		driver.findElement(By.xpath("//option[@value='3'][contains(.,'Apr')]")).click();
		driver.findElement(By.xpath("//a[@class='ui-state-default'][contains(.,'10')]")).click();
	}

}
