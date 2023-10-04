package MultipleTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class EMI extends LaunchandQuit {
	@Test
	public void Test1() throws InterruptedException
	{
		Thread.sleep(10000);
		WebElement EMI=driver.findElement(By.xpath("(//input[@name='ppw-instrumentRowSelection'])[4]"));
		EMI.click();
		/*List<WebElement> emi=driver.findElements(By.xpath("(//div[@class='a-popover-inner'])[2]//ulc/li/a"));
		int cardcount=emi.size();
		Thread.sleep(3000);
		System.out.println(cardcount);
		emi.get(cardcount).click();*/
		
		
		
	}

}
