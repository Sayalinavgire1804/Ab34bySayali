package JavaPopups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptJson {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		//driver.switchTo().alert().accept();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Sayali/Documents/sayali.html");
		driver.switchTo().alert().dismiss();
		WebElement uname=driver.findElement(By.id("1"));
		uname.sendKeys("Sayali");
	}

}
