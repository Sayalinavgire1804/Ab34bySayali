package Priintoptions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Amazondropdown {
	@Test
	public void scenario1()
	{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	WebElement appliance=driver.findElement(By.id("searchDropdownBox"));
	Select s1=new Select(appliance);
	//s1.selectByValue("search-alias=furniture");
	//s1.selectByIndex(11);
	s1.selectByVisibleText("Health & Personal Care");
	List<WebElement> options=s1.getOptions();
	int count=options.size();
	System.out.println(count);
	for(int i=0;i<=count-1;i++)
	{
		WebElement drop=options.get(i);
		String a=drop.getText();
		System.out.println(a);
		
	}
	}
}
