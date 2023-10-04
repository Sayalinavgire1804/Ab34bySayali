package TakeScreenshotgetclass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class China extends LaunchandQuit {
	@Test
	public void Scenario2() throws IOException, InterruptedException
	{
	WebElement search= driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
	search.sendKeys("China");
	search.sendKeys(Keys.ENTER);
	//step 1:
	Thread.sleep(3000);
	TakesScreenshot ts=driver;
	China c1=new China();
	File source=ts.getScreenshotAs(OutputType.FILE);
	File destination=new File("C:\\Users\\Sayali\\eclipse-workspace\\SeleniumClass\\src\\TestNG\\Screensots\\Sayali"+c1.getClass()+".png");
 FileUtils.copyFile(source, destination);
	
	
	}

}
