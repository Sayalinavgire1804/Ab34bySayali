package seleniumbymkt;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyFunctionArrow {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("india");
		Thread.sleep(10000);
		
		search.sendKeys(Keys.ARROW_DOWN);
		search.sendKeys(Keys.ARROW_DOWN);
		
		search.sendKeys(Keys.ARROW_DOWN);
		search.sendKeys(Keys.ARROW_DOWN);
		search.sendKeys(Keys.ENTER);
		
		
		
	}

}
