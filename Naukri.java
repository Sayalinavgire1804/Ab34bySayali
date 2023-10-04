package seleniumbymkt;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Naukri {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad=1&gclid=EAIaIQobChMI5fue0ZiegQMVoqRmAh0_TAWPEAAYASAAEgLd4vD_BwE&gclsrc=aw.ds");
		WebElement register=driver.findElement(By.xpath("//span[.='Google']"));
		register.click();
		//String Parent=driver.getWindowHandle();
		//System.out.println(Parent);
        Set<String> parentChild=driver.getWindowHandles();
        System.out.println(parentChild);
        driver.quit();
        Iterator<String> a1=parentChild.iterator();
        String Parentid=a1.next();//first a1 will give u parent id
        String Childid=a1.next();//Second next will give u child id
        System.out.println(Parentid);
        System.out.println(Childid);
        driver.switchTo().window(Childid);//moving contriol to child
        Thread.sleep(4000);
        driver.close();
        

		

}
}
