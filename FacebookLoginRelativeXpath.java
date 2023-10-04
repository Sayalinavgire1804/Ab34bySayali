package seleniumbymkt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginRelativeXpath {

	public static void main(String[] args) {
		ChromeDriver d1=new ChromeDriver();
		d1.get("https://facebook.com");
		d1.manage().window().maximize();
		WebElement Uname=d1.findElement(By.xpath("(//input)[3]"));
		Uname.sendKeys("Sayunavgire@gmail.com");
		WebElement Pw=d1.findElement(By.xpath("(//input)[4]"));
		Pw.sendKeys("Sayali@0404");
		WebElement Login=d1.findElement(By.xpath("//button"));
		Login.click();
	}

}
