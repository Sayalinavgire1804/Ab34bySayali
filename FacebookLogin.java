package seleniumbymkt;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {

		ChromeDriver d1=new ChromeDriver();
		d1.get("https://facebook.com");
		d1.manage().window().maximize();
		d1.findElement(By.id("email")).sendKeys("sayunavgire@gmail.com");
		d1.findElement(By.id("pass")).sendKeys("Sayali@1234");
		d1.findElement(By.name("login")).click();
	}

}
