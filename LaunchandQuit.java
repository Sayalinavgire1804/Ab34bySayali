package MultipleTest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LaunchandQuit {
	ChromeDriver driver;
	
	@BeforeMethod
	public void launch() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Shoe");
		search.sendKeys(Keys.ENTER);
		WebElement shoe=driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
		shoe.click();
		Set<String> list=driver.getWindowHandles();
		Iterator<String> pc=list.iterator();
		String Parentid=pc.next();
		String Childid=pc.next();

		driver.switchTo().window(Childid);
		Thread.sleep(3000);
		WebElement addtocart=driver.findElement(By.id("add-to-cart-button"));
		addtocart.click();
		WebElement movefromcart=driver.findElement(By.name("proceedToRetailCheckout"));
		movefromcart.click();
		WebElement login=driver.findElement(By.id("ap_email"));
		login.sendKeys("sayunavgire@gmail.com");
		WebElement submit=driver.findElement(By.id("continue"));
		submit.click();
		WebElement pw=driver.findElement(By.name("password"));
		pw.sendKeys("Sayali@1804");
		WebElement submit2=driver.findElement(By.id("signInSubmit"));
		submit2.click();
		
		Thread.sleep(10000);
		WebElement address=driver.findElement(By.id("shipToThisAddressButton"));
		address.click();
	}
	@AfterMethod
	public void quit() throws InterruptedException
	{
		Thread.sleep(3000);
		//driver.quit();
		
	}

}
