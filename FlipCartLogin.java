package seleniumbymkt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipCartLogin {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement Login=driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		Login.sendKeys("8999699785");
		WebElement OTP=driver.findElement(By.xpath("//button[.='Request OTP']"));
		OTP.click();
	}

}
