package seleniumbymkt;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLogin {

	public static void main(String[] args) {

		ChromeDriver d1=new ChromeDriver();
		d1.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		d1.manage().window().maximize();
	d1.findElement(By.name("email")).sendKeys("navgiresayali030@gmail.com");
	d1.findElement(By.id("continue")).click();
	d1.findElement(By.id("ap_password")).sendKeys("Sayali@1904");
	d1.findElement(By.id("signInSubmit")).click();
	}

}
