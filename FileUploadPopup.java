package JavaPopups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		WebElement file=driver.findElement(By.xpath("//input[@name='file-935']"));
		file.sendKeys("C:\\Users\\Sayali\\Downloads\\GroTechMinds File Upload pdf.pdf");
		
	}

}
