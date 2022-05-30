package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy (xpath = "//input[@name='username']") 
	private WebElement userName ;
	
	@FindBy (xpath = "//input[@name='pwd']") 
	private WebElement password ;
	
	@FindBy (xpath = "//input[@id='keepLoggedInCheckBox']") 
	private WebElement keepMeLoginCheckbox ;
	
	@FindBy (xpath = "//a[text()='Login']") 
	private WebElement login ;
	
	public LoginPage(WebDriver driver) // driver2 = driver = new Chromedriver()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sendUserName(String user) {
		userName.sendKeys(user);
	}

	public void sendPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void selectKeepMeLogin() {
		keepMeLoginCheckbox.click();
	}
	
	public void clickOnLoginButton() {
		login.click();
	}
	
	// OR
	
	public void loginToApplication() {
		userName.sendKeys("Admin");
		password.sendKeys("manager");
		keepMeLoginCheckbox.click();
		login.click();
	}
	
}
