package TestNGGrouping;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
public class AmazonGrouping {

@Test(groups={"Smoke"})
	 public void Login()
	{
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.Amazon.in/");
		driver.manage().window().maximize();
		WebElement login=driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		Actions a1=new Actions(driver);
		a1.moveToElement(login).perform();
		
		WebElement signin=driver.findElement(By.xpath("(//span[.='Sign in'])[1]"));
		signin.click();
		WebElement uname=driver.findElement(By.id("ap_email"));
		uname.sendKeys("Sayunavgire@gmail.com");
		WebElement cont=driver.findElement(By.id("continue"));
		cont.click();
		WebElement pw=driver.findElement(By.name("password"));
		pw.sendKeys("Sayali@1804");
		WebElement signin1=driver.findElement(By.id("signInSubmit"));
		signin1.click();
	}
	@Test(groups= {"Smoke"})
	 public void sceanrio2()
	{
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.Amazon.in/");
		driver.manage().window().maximize();
		WebElement login=driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		Actions a1=new Actions(driver);
		a1.moveToElement(login).perform();
		WebElement signin=driver.findElement(By.xpath("(//span[.='Sign in'])[1]"));
		signin.click();
		WebElement uname=driver.findElement(By.id("ap_email"));
		uname.sendKeys("Sayunavgire@gmail.com");
		WebElement cont=driver.findElement(By.id("continue"));
		cont.click();
		WebElement pw=driver.findElement(By.name("password"));
		pw.sendKeys("Sayali@1804");
		WebElement signin1=driver.findElement(By.id("signInSubmit"));
		signin1.click();
		WebElement login1=driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
        Actions a2=new Actions(driver);
		a2.moveToElement(login1).perform();
		WebElement signout=driver.findElement(By.xpath("//span[.='Sign Out']"));
		signout.click();


	}
	@Test(groups= {"Smoke","System"})
	 public void sceanrio3()
	{

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.Amazon.in/");
		driver.manage().window().maximize();
		WebElement mob=driver.findElement(By.linkText("Mobiles"));
		Actions a3=new Actions(driver);
		a3.contextClick(mob).perform();
	}
	@Test(groups= {"System","Regression"})
	 public void sceanrio4() throws AWTException, InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.Amazon.in/");
		driver.manage().window().maximize();
		WebElement mob1=driver.findElement(By.linkText("Mobiles"));
		Actions a3=new Actions(driver);
		a3.contextClick(mob1).perform();
		Robot r1=new Robot();
		r1.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		r1.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		r1.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
        r1.keyPress(KeyEvent.VK_ENTER);
	}
	@Test(groups= {"System","Regression"})
	 public void sceanrio5() throws InterruptedException, IOException
	{
		ChromeDriver driver=new ChromeDriver();

		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("tote bags");
		search.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		TakesScreenshot ts=driver;	
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\Sayali\\eclipse-workspace\\SeleniumClass\\src\\TestNG\\Screensots\\Pune_"+Math.random()+".png");
		FileUtils.copyFile(source, destination);
		
		
	}

	@Test(groups= {"system","Regression"})
	 public void sceanrio6()
	{
		ChromeDriver driver=new ChromeDriver();
        driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement dropdown=driver.findElement(By.id("searchDropdownBox"));
		Select s1=new Select(dropdown);
		s1.selectByVisibleText("Beauty");
		
		
		
		
	}
	@Test(groups= {"Component","system"})
	 public void sceanrio7() throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
        driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("biba");
		Thread.sleep(3000);
		List<WebElement>list=driver.findElements(By.xpath("(//div[@class='two-pane-results-container'])//div/div"));
		int count=list.size();
		System.out.println(count);
		list.get(count-7).click();
		
		
		
	}
	@Test(groups= {"system","Smoke"})
	 public void sceanrio8() throws InterruptedException
	{

		ChromeDriver driver=new ChromeDriver();
        driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement accountlist=driver.findElement(By.id("nav-link-accountList"));
		Actions a1=new Actions(driver);
		a1.moveToElement(accountlist).perform();
		WebElement signin=driver.findElement(By.xpath("(//span[.='Sign in'])[1]"));
		signin.click();
		WebElement uname=driver.findElement(By.id("ap_email"));
		uname.sendKeys("Sayunavgire@gmail.com");
		WebElement cont=driver.findElement(By.id("continue"));
		cont.click();
		WebElement pw=driver.findElement(By.name("password"));
		pw.sendKeys("Sayali@1804");
		WebElement signin1=driver.findElement(By.id("signInSubmit"));
		signin1.click();
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Shoe");
		search.sendKeys(Keys.ENTER);
		WebElement shoes=driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
		shoes.click();
		Set<String>parentchild=driver.getWindowHandles();
		Iterator<String>parentchild1=parentchild.iterator();
		String parent=parentchild1.next();
		String child=parentchild1.next();
		driver.switchTo().window(child);
		WebElement addtocart=driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		addtocart.click();
		WebElement checkout=driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']"));
		checkout.click();
		WebElement ship=driver.findElement(By.id("shipToThisAddressButton-announce"));
		ship.click();
		Thread.sleep(3000);
		WebElement credicard=driver.findElement(By.xpath("(//input[@name='ppw-instrumentRowSelection'])[2]"));
		credicard.click();
		WebElement cdetails=driver.findElement(By.xpath("//a[@class='a-link-emphasis pmts-add-cc-default-trigger-link']"));
		cdetails.click();
	}
	@Test(groups= {"Regression","Smoke"})
	 public void sceanrio9() throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
        driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement accountlist=driver.findElement(By.id("nav-link-accountList"));
		Actions a1=new Actions(driver);
		a1.moveToElement(accountlist).perform();
		WebElement signin=driver.findElement(By.xpath("(//span[.='Sign in'])[1]"));
		signin.click();
		WebElement uname=driver.findElement(By.id("ap_email"));
		uname.sendKeys("Sayunavgire@gmail.com");
		WebElement cont=driver.findElement(By.id("continue"));
		cont.click();
		WebElement pw=driver.findElement(By.name("password"));
		pw.sendKeys("Sayali@1804");
		WebElement signin1=driver.findElement(By.id("signInSubmit"));
		signin1.click();
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Shoe");
		search.sendKeys(Keys.ENTER);
		WebElement shoes=driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
		shoes.click();
		Set<String> parentchild=driver.getWindowHandles();
		Iterator<String> parentchild1=parentchild.iterator();
		String parent=parentchild1.next();
		String child=parentchild1.next();
        driver.switchTo().window(child)	;
        WebElement addtocart=driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		addtocart.click();
		WebElement checkout=driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']"));
		checkout.click();
		WebElement ship=driver.findElement(By.id("shipToThisAddressButton-announce"));
		ship.click();
		Thread.sleep(3000);
		WebElement netbanking=driver.findElement(By.xpath("(//input[@name='ppw-instrumentRowSelection'])[3]"));
		netbanking.click();
		WebElement banks=driver.findElement(By.xpath("(//span[.='Choose an Option'])[4]"));
		banks.click();
		List<WebElement>banklist=driver.findElements(By.xpath("(//div[@class='a-popover-inner a-lgtbox-vertical-scroll'])//ul/li"));
		int count=banklist.size();
		Thread.sleep(3000);
		banklist.get(count-15).click();
	}
	@Test(groups= {"Regression","System"})
	 public void sceanrio10()
	{
		System.out.println("10");

		
	}

}
