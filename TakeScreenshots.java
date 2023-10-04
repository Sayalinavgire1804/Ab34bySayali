package TestNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TakeScreenshots {
@Test
public void Scenario1() throws IOException
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	WebElement search= driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
	search.sendKeys("India");
	search.sendKeys(Keys.ENTER);
	//step 1:

	TakesScreenshot ts=driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	File destination=new File("C:\\Users\\Sayali\\eclipse-workspace\\SeleniumClass\\src\\TestNG\\Screensots\\Sayali12.png");
	FileUtils.copyFile(source, destination);
	

}
	
}
