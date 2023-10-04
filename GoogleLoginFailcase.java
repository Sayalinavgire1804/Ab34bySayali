package TestNGListners;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Reporting.class)

public class GoogleLoginFailcase extends Reporting  {
	ChromeDriver driver1;
	@Test(timeOut=1000)
	public void Loginfail()
	{
		
		driver1=new ChromeDriver();
		driver1.get("https://www.google.com");
		driver1.manage().window().maximize();
		WebElement search=driver1.findElement(By.name("q"));
		search.sendKeys("Aasam");
		search.sendKeys(Keys.ENTER);
	}
	

}
