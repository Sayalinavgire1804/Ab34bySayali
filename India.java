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

public class India extends LaunchandQuit {
	@Test
	public void Scenario3() throws IOException, InterruptedException
	{
		India i1= new India();
	WebElement search= driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
	search.sendKeys("India");
	search.sendKeys(Keys.ENTER);
	//step 1:
	Thread.sleep(3000);
	TakesScreenshot ts=driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	File destination=new File("C:\\Users\\Sayali\\eclipse-workspace\\SeleniumClass\\src\\TestNG\\Screensots\\Sayali"+i1.getClass()+".png");
	FileUtils.copyFile(source, destination);
	
	}

}
