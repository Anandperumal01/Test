package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	// 1. initalize the webdriver for the puprpose we are using page factory
	// create constructor.
	// create method which same as class name
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	// 2. we have to create a web Element
	
	@FindBy(xpath="//input[@placeholder='Username']")
	WebElement txtUserName;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement txtPassword;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement btnLogin;
	
	
	// 3. Actions of the webelements
	
	public void enterUsername(String uname) {
		txtUserName.sendKeys(uname);
	}
	
	
	public void enterpPassword(String pwd) {
		txtPassword.sendKeys(pwd);
		
	}
	
	
	public void clickLoginButton() {
		btnLogin.click();
		
	}
	
	
	
	
	

}
