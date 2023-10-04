package JavaPopups;

import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptPopups {

	public static void main(String[] args) {


		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/javascript-popup/");
		driver.switchTo().alert().accept();
	}

}
