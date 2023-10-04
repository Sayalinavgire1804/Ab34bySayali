package Priintoptions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoSuggestions {
	@Test
	public void scenario1() throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Mobiles");
		Thread.sleep(3000);
		List<WebElement> autos=  driver.findElements(By.xpath("(//div[@class='two-pane-results-container'])//div/div"));
		int count =autos.size();
			System.out.println(count);
			for(int i=0;i<43;i++)
			{
				WebElement mlist=autos.get(i);
				String a=mlist.getText();
				System.out.println(a);
				
			}
		
	}

}
