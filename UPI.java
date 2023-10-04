package MultipleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class UPI extends LaunchandQuit {
	@Test
	public void Test1() throws InterruptedException
	{
		Thread.sleep(10000);
		WebElement UPI=driver.findElement(By.xpath("(//input[@name='ppw-instrumentRowSelection'])[3]"));
		UPI.click();
		
		
	}

}
