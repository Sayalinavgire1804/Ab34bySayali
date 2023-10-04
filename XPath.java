package seleniumbymkt;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {

	public static void main(String[] args) {
		ChromeDriver d1=new ChromeDriver();
		d1.get("file:///C:/Users/Sayali/Documents/learningHTML1%20(1).html");
		d1.manage().window().maximize();
		d1.findElement(By.xpath("/html/body/input[1]")).sendKeys("sayali.navgire@gmail.com");
		d1.findElement(By.xpath("/html/body/input[2]")).sendKeys("1804");
		d1.findElement(By.xpath("/html/body/input[3]")).sendKeys("Sayali@1804");
		d1.findElement(By.xpath("/html/body/form[1]/input[1]")).sendKeys("Sayali");
		d1.findElement(By.xpath("/html/body/input[5][1]")).click();
		//d1.findElement(By.xpath("/html/body/form[1]/input[2]")).sendKeys("Navgire");
		//d1.findElement(By.xpath("/html/body/form[1]/input[3]")).click();
		d1.findElement(By.xpath("/html/body/form[2]/input[2]")).click();
		//d1.findElement(By.xpath("/html/body/form[2]/input[4]")).click();
		d1.findElement(By.xpath("/html/body/input[6]")).click();
		//000d1.findElement(By.xpath("/html/body/a")).click();
		d1.findElement(By.xpath("/html/body/Select/option[2]")).click();
		d1.findElement(By.xpath("/html/body/input[7]")).click();
		d1.findElement(By.xpath("/html/body/img")).isDisplayed();
		d1.findElement(By.tagName("a")).click();
	}

}
