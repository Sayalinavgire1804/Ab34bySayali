package seleniumbymkt;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleRelativeXpath {

	public static void main(String[] args) {
		ChromeDriver d1=new ChromeDriver();
		d1.get("https://www.google.com");
		d1.manage().window().maximize();
		d1.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("India");
		
	}

}
