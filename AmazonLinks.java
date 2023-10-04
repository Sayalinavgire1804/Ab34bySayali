package Priintoptions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmazonLinks {
	@Test
	public void scenario() throws InterruptedException
	{
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		List<WebElement> links=driver.findElements(By.tagName("a"));
		Thread.sleep(3000);
		int count=links.size();
		System.out.println(count);
		
		for(int i=0;i<=count-1;i++)
		{
			
			WebElement link2=links.get(i);
			String a=link2.getAttribute("href");
			System.out.println(a);
		}
	}

}
