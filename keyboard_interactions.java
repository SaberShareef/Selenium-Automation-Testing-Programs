package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboard_interactions {

	public static void main(String[] args) throws Exception
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		
 		Thread.sleep(4000);
        WebElement from = driver.findElement(By.xpath("//span[@class='lbl_input appendBottom10'][contains(.,'From')]"));
        new Actions(driver).click(from)
        .pause(2000).sendKeys("Bkk")
        .sendKeys(Keys.ARROW_DOWN).pause(2000)
        .sendKeys(Keys.ENTER).perform();
        
        Thread.sleep(3000);
        WebElement To = driver.findElement(By.xpath("//span[@class='lbl_input appendBottom10'][contains(.,'To')]"));
        new Actions(driver).click(To)
        .pause(2000).sendKeys("Hyd")
        .pause(3000).sendKeys(Keys.ARROW_DOWN)
        .pause(2000).sendKeys(Keys.ENTER).perform();
        
        Thread.sleep(3000);
        WebElement date = driver.findElement(By.xpath("//div[contains(@aria-label,'Sat Sep 23 2023')]"));
        new Actions(driver).scrollToElement(date).perform();
        new Actions(driver).click(date).perform();
        
        Thread.sleep(2000);
        WebElement returns = driver.findElement(By.xpath("//span[@class='lbl_input appendBottom10'][contains(.,'Return')]"));
        new Actions(driver).click(returns).perform();
        
        Thread.sleep(2000);
        WebElement dfrom = driver.findElement(By.xpath("//div[contains(@aria-label,'Sat Sep 30 2023')]"));
        new Actions(driver).scrollToElement(dfrom).perform();
        new Actions(driver).click(dfrom).perform();
        
        Thread.sleep(2000);
        WebElement travel = driver.findElement(By.xpath("//span[contains(.,'Travellers & Class')]"));
        new Actions(driver).scrollToElement(travel).perform();
        new Actions(driver).click(travel).perform();
        
        Thread.sleep(3000);
        WebElement mem = driver.findElement(By.xpath("//li[@data-cy='adults-4'][contains(.,'‎4')]"));
        new Actions(driver).scrollToElement(mem). perform();
        new Actions(driver).click(mem).perform();
        
        Thread.sleep(2000);
        WebElement apply = driver.findElement(By.xpath("//button[@type='button'][contains(.,'APPLY')]"));
        new Actions(driver).scrollToElement(apply).perform();
        new Actions(driver).click(apply).perform();
        
        Thread.sleep(2000);
        WebElement radio = driver.findElement(By.xpath("//p[contains(.,'Student  Fares')]"));
        new Actions(driver).scrollToElement(radio).perform();
        new Actions(driver).click(radio).perform();
        
        Thread.sleep(3000);
        WebElement search = driver.findElement(By.xpath("//a[@class='primaryBtn font24 latoBold widgetSearchBtn '][contains(.,'Search')]"));
        new Actions(driver).scrollToElement(search).perform();
        new Actions(driver).click(search).perform();
        
        
        
        
        
}
}