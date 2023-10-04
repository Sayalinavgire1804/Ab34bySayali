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

public class Japan extends LaunchandQuit {
	@Test
	public void Scenario4() throws IOException, InterruptedException
	{
		Japan j1=new Japan();
	WebElement search= driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
	search.sendKeys("Japan");
	search.sendKeys(Keys.ENTER);
	//step 1:
	Thread.sleep(3000);
	TakesScreenshot ts=driver;//upcasting
	File source=ts.getScreenshotAs(OutputType.FILE);//getscreenshot
	File destination=new File("C:\\Users\\Sayali\\eclipse-workspace\\SeleniumClass\\src\\TestNG\\Screensots\\Sayali"+j1.getClass()+".png");//Object of file and location 
	FileUtils.copyFile(source, destination);
	
	}

}
