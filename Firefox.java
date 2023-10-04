package OldWaybrowser;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Firefox {
	@Test
	public void login()
	{
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sayali\\Desktop\\geckodriver.exe");
	FirefoxDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
driver.get("https://www.google.com/");
}
}