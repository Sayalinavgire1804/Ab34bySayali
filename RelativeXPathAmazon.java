package seleniumbymkt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXPathAmazon {

	public static void main(String[] args) {
		ChromeDriver d1=new ChromeDriver();
		d1.get("https://www.Amazon.in");
		d1.manage().window().maximize();
		WebElement shoes=d1.findElement(By.xpath("(//input)[4]"));
shoes.sendKeys("Shoes");
	}

}
