package sam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	static WebDriver driver;
	public static void LaunchBrowser (String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jagad\\eclipse-workspace\\JSelenium1\\Driver\\chromedriver.exe");
	 driver=new ChromeDriver();
	driver.get(url);
	}
	public static void type(WebElement l, String s) {
		l.sendKeys(s);
	}
	public static void click(WebElement l) {
		l.click();
	}
	public static void closeBrowser() {
		driver.quit();
	}
		

}
