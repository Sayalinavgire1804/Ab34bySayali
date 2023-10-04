package DTDFramework;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
class DTDGetuid1 {
	FileInputStream fs;
	 Workbook wb;
	 String uname;
	 String password;
   ChromeDriver driver;
	public  void DTDMethod(String sayali ) throws EncryptedDocumentException, IOException
	{
		
		fs=new FileInputStream("C:\\Users\\Sayali\\eclipse-workspace\\SeleniumClass\\ExcelSheet\\Sayaliexcel.xlsx");
	    wb=WorkbookFactory.create(fs);
	     uname=wb.getSheet("Login").getRow(1).getCell(0).getStringCellValue();
	     password=wb.getSheet("Login").getRow(1).getCell(1).getStringCellValue();
	     

	}
}
public class Payment extends DTDGetuid1 {
	
	

	
	@BeforeMethod
	public void AmazonLogin() throws InterruptedException, EncryptedDocumentException, IOException
	
	{
		

	
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
	}
	
	@AfterMethod
	public void quit() throws InterruptedException
	{
		Thread.sleep(3000);
		//driver.quit();
		
	}
}
class PaymentMethod extends Payment {



@Test
	public void AmazonCreditCard() throws InterruptedException, EncryptedDocumentException, IOException 
	{
	
	PaymentMethod p1=new PaymentMethod();
	p1.DTDMethod("kp");
	WebElement acctlist=driver.findElement(By.xpath("//span[@class= 'nav-line-2 ']"));
	Actions a1=new Actions(driver);
	a1.moveToElement(acctlist).perform();
	WebElement login1=driver.findElement(By.xpath("//span[@class= 'nav-action-inner']"));
	login1.click();
	WebElement login2=driver.findElement(By.id("ap_email"));
	login2.sendKeys(p1.uname);
	WebElement submit=driver.findElement(By.id("continue"));
	submit.click();
	WebElement pw1=driver.findElement(By.name("password"));
	pw1.sendKeys(p1.password);
	WebElement submit2=driver.findElement(By.id("signInSubmit"));
	submit2.click();
	WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
	search.sendKeys("shoe");
	search.sendKeys(Keys.ENTER);
	Thread.sleep(3000);
	WebElement shoe=driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
	shoe.click();
	Set<String>parentchild=driver.getWindowHandles();
	Iterator<String> count=parentchild.iterator();
	String parent=count.next();
	String child=count.next();
	driver.switchTo().window(child);
	WebElement addtocart=driver.findElement(By.name("submit.add-to-cart"));
	addtocart.click();
	WebElement proceedtobuy=driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']"));
	proceedtobuy.click();

	WebElement address=driver.findElement(By.id("shipToThisAddressButton"));
	address.click();
	
	Thread.sleep(10000);
	WebElement creditcard=driver.findElement(By.xpath("(//input[@name='ppw-instrumentRowSelection'])[2]"));
	creditcard.click();
	WebElement clink=driver.findElement(By.xpath("(//a[@class='a-link-emphasis pmts-add-cc-default-trigger-link'])[1]"));
	clink.click();
	}
}