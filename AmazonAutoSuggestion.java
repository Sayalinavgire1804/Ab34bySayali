package seleniumbymkt;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonAutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.Amazon.in/");
		driver.manage().window().maximize();
		WebElement search= driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Shoes");
		Thread.sleep(3000);
		List<WebElement> shoes=driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		int count= shoes.size();
		System.out.println(count);
		shoes.get(count-4).click();
		
		
	}

}
