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

public class London extends LaunchandQuit {
	@Test
	public void Scenario1() throws IOException, InterruptedException
	{
	WebElement search= driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
	search.sendKeys("London");
	search.sendKeys(Keys.ENTER);
Thread.sleep(3000);
	TakesScreenshot ts=driver;//upcasting
	File source=ts.getScreenshotAs(OutputType.FILE);
	//step 1:
	London o1 = new London();
	  //Class<? extends London> classname=o1.getClass();
	 //System.out.println(classname);
	File destination=new File("C:\\Users\\Sayali\\eclipse-workspace\\SeleniumClass\\src\\TestNG\\Screensots\\Sayali"+o1.getClass()+".png");
	FileUtils.copyFile(source, destination);
	}

}
