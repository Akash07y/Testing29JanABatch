package browsers;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Base {

	public static WebDriver openChromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "src\\test\\resoutces\\browser\\chromedriver.exe") ;
		WebDriver driver = new ChromeDriver();
		return driver;
	}

	public static WebDriver openFirefoxBrowser() {
		System.setProperty("webdriver.gecko.driver", "src"+File.separator+"test"+File.separator+"resources"+File.separator+"browser"+File.separator+"chromedriver.exe") ;
		WebDriver driver = new FirefoxDriver();
		return driver;
	}
	
	public static WebDriver openOperaBrowser() {
		System.setProperty("webdriver.opera.driver", "operadriver.exe") ;
		WebDriver driver = new OperaDriver();
		return driver;
	}
}
