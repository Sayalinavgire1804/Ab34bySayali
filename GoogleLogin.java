package TestNGListners;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Reporting.class)

public class GoogleLogin extends Reporting  {
	ChromeDriver Driver;
	@Test

	public void login()
	{
		
		 Driver=new ChromeDriver();
		Driver.get("https://www.google.com");
		Driver.manage().window().maximize();
		WebElement search=Driver.findElement(By.name("q"));
		search.sendKeys("Ladakh");
		search.sendKeys(Keys.ENTER);
	}

}
