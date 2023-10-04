package seleniumbymkt;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeysFunction {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement name=driver.findElement(By.id("1"));
		name.sendKeys("Sayali");
		name.sendKeys(Keys.CONTROL +"a");
		name.sendKeys(Keys.CONTROL+"c");
		WebElement hint=driver.findElement(By.id("2"));
		hint.sendKeys(Keys.CONTROL+"v");
		WebElement pass=driver.findElement(By.name("Password"));
		pass.sendKeys(Keys.CONTROL+"v");
		WebElement fname=driver.findElement(By.name("text-397"));
		fname.sendKeys(Keys.CONTROL+"v");
		WebElement lname=driver.findElement(By.id("5"));
		lname.sendKeys(Keys.CONTROL+"v");

		


		
		
	}

}
