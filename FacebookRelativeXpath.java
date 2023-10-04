package seleniumbymkt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookRelativeXpath {

	public static void main(String[] args) {

		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement Uname=driver.findElement(By.xpath("//input[@name='email']"));
		Uname.sendKeys("sayunavgire@gmail.com");
		WebElement Pass=driver.findElement(By.xpath("//input[@id='pass']"));
		Pass.sendKeys("Sayali@0404");
		WebElement Login=driver.findElement(By.tagName("button"));
		Login.click();

	}
}
