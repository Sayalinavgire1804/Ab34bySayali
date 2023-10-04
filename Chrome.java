package OldWaybrowser;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Chrome {
	@Test
	public void launch()
	
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sayali\\Desktop\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
		
	}

}
