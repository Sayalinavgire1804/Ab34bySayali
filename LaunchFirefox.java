package seleniumbymkt;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public static void main(String[] args) {

		FirefoxDriver f=new FirefoxDriver();
		f.get("https://youtube.com");
		String title =f.getTitle();
		System.out.println(title);
	}

}
