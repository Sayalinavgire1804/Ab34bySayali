package JavaPopups;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetLocation {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement xy=driver.findElement(By.linkText("Canada"));
		Point p1=xy.getLocation();
		int ax1=p1.getX();
		int ax2=p1.getY();
		System.out.println(ax1);
		System.out.println(ax2);


		
	}

}
