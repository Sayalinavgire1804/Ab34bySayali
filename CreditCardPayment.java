package MultipleTest;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CreditCardPayment extends LaunchandQuit{
	
	@Test
	public void Test1() throws InterruptedException
	{

		Thread.sleep(10000);
WebElement creditcard =driver.findElement(By.xpath("(//input[@name='ppw-instrumentRowSelection'])[2]"));
		creditcard.click();
		WebElement creditdetails=driver.findElement(By.xpath("(//a[.='Enter card details'])[1]"));
		creditdetails.click();
		
		
	}

}
