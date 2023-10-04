package seleniumbymkt;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://Amazon.in");
		driver.manage().window().maximize();
driver.findElement(By.partialLinkText("Mobi")).click();
	}

}
