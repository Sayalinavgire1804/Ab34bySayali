package seleniumbymkt;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GroTechMind {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		driver.findElement(By.id("1")).sendKeys("Sayali.navgire@gmail.com");
		driver.findElement(By.id("3")).sendKeys("Sayali@1904");
		driver.findElement(By.name("text-398")).sendKeys("Navgire");
		driver.findElement(By.id("2")).sendKeys("1904");
		driver.findElement(By.id("4")).sendKeys("Sayali");
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[4]/div[1]/p[2]/span/span[1]/span[2]/input")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[7]/div[1]/p/span/span/span/input")).click();


	}

}
