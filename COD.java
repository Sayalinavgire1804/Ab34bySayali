package MultipleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class COD extends LaunchandQuit {
	@Test
	public void Test1() throws InterruptedException
	{
		Thread.sleep(10000);
		WebElement COD=driver.findElement(By.xpath("(//input[@name='ppw-instrumentRowSelection'])[6]"));
		COD.click();
		WebElement choose=driver.findElement(By.xpath("(//input[@name='ppw-widgetEvent:SetPaymentPlanSelectContinueEvent'])[1]"));
		choose.sendKeys(Keys.ENTER);
		
	}

}
