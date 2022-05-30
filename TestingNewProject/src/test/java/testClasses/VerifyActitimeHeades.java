package testClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import browsers.Base;
import pomClasses.ApplicationHeader;
import pomClasses.LoginPage;
import utils.Utility;

public class VerifyActitimeHeades {
	
	WebDriver driver ;
	ApplicationHeader applicationHeader ;
	LoginPage loginPage;
	
	int row = 1;
	int testID;
	
	@Parameters ("browsrName")
	@BeforeTest
	public void launchBrowser(String browser) {
		
		System.out.println(browser);
		
		if(browser.equals("Chrome"))
		{
			driver = Base.openChromeBrowser();
		}
		if(browser.equals("Firefox"))
		{
			driver = Base.openFirefoxBrowser();
		}
		if(browser.equals("Opera"))
		{
			driver = Base.openOperaBrowser();
		}
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	
	@BeforeClass
	public void createPOMObject() {
		applicationHeader = new ApplicationHeader(driver);
		loginPage = new LoginPage(driver);
	}
	
	@BeforeMethod
	public void loginToApplication() {
		driver.get("http://desktop-b2220qc/login.do");
		
		String data = Utility.getDataFromExcelsheet(); // user name - sheetName , row, col
		loginPage.sendUserName(data);
		
		data = Utility.getDataFromExcelsheet(); // password name - sheetName , row, col
		loginPage.sendPassword(data);
		loginPage.clickOnLoginButton();
	}
	
	@Test
	public void verifyTaskTab() {
		testID = 1245;
		
		applicationHeader.clickOnTasksTab();
		
		Utility.getDataFromExcelsheet(sheet, row, col);
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		
		Assert.assertEquals("http://desktop-b2220qc/tasks/otasklist.do", url);
		Assert.assertEquals("actiTIME - Open Tasks", title);
		
		row ++;
	}
	
	@Test
	public void verifyReportTab() {
		testID = 5879;
		applicationHeader.clickOnReportsTab();
		
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		
		Assert.assertEquals("http://desktop-b2220qc/tasks/otasklist.do", url);
		Assert.assertEquals("actiTIME - Open Tasks", title);
	}
	
	@AfterMethod
	public void lougoutFromApplication(ITestResult result) {
		
		if(ITestResult.FAILURE == result.getStatus())
		{
			Utility.captureScreenshot(testID);
		}
		applicationHeader.clickOnLogout();
	}
	
	@AfterClass
	public void clearObject() {
		loginPage = null;
		applicationHeader = null;
	}
	
	@AfterTest
	public void closedBrowser() {
		driver.close();
		driver = null;
		System.gc();  // garbage collcetor
	}
	
}
	
