package TakeScreenshotgetclass;



import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LaunchandQuit  {
	ChromeDriver driver;
	
	@BeforeMethod
	public void launch()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
	}
	@AfterMethod
	public void quit() throws InterruptedException 
	{
		Thread.sleep(10000);
		
		driver.quit();
		
	}

}

