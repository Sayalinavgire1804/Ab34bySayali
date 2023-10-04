package MultipleTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class NetBanking extends LaunchandQuit {
	@Test
	public void Test1() throws InterruptedException
	{
		Thread.sleep(10000);
WebElement netbank=driver.findElement(By.xpath("(//input[@name='ppw-instrumentRowSelection'])[2]"));
		netbank.click();

		WebElement choose=driver.findElement(By.xpath("(//span[@class='a-dropdown-prompt'])[1]"));
		choose.click();
		List<WebElement> banks=driver.findElements(By.xpath("//div[@class='a-popover-inner a-lgtbox-vertical-scroll']//ul/li/a"));
		int count=banks.size();
		Thread.sleep(6000);
		System.out.println(count);
		Thread.sleep(5000);
		banks.get(count-35).click();
		
	}

}
