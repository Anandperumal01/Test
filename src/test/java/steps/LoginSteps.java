package steps;

import MyHook.DriverInitalization;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;

public class LoginSteps extends DriverInitalization {



	@Given("User navigate to the organgeHRM application")
	public void userNavigateToTheOrgangeHRMApplication() {


	}
	@Given("User enter the user name as Admin")
	public void userEnterTheUserNameAsAdmin() throws InterruptedException {
		logger.info("Entering into userEnterTheUserNameAsAdmin");
		Thread.sleep(5000);
		objloginpage=new LoginPage(driver);
		//driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		objloginpage.enterUsername("Admin");
		logger.info("Exiting into userEnterTheUserNameAsAdmin");
	}
	@Given("User enter the password as admin123")
	public void userEnterThePasswordAsAdmin123() throws InterruptedException {
		Thread.sleep(5000);
		logger.info("Entering into userEnterThePasswordAsAdmin123");

		//driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		objloginpage.enterpPassword("admin123");
		logger.info("Exiting into userEnterThePasswordAsAdmin123");

	}
	@When("User click on the login button")
	public void userClickOnTheLoginButton() throws InterruptedException {
		//driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		Thread.sleep(5000);
		logger.info("Entering into Logon button");

		objloginpage.clickLoginButton();
		logger.info("Exiting into Logon button");




	}
	@Then("Login should be success")
	public void loginShouldBeSuccess() {
		logger.info("Entering into sucess");

		
		logger.info("Exiting into sucess");







	}


	@Given("User enter the user name as {string}")
	public void userEnterTheUserNameAs(String uname) throws InterruptedException {
		
		logger.info("Entering into userEnterTheUserNameAsAdmin");
		Thread.sleep(5000);
		objloginpage=new LoginPage(driver);
		//driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		objloginpage.enterUsername(uname);
		logger.info("Exiting into userEnterTheUserNameAsAdmin");

	}
	@Given("User enter the password as {string}")
	public void userEnterThePasswordAs(String pwd) throws InterruptedException {
		
		Thread.sleep(5000);
		logger.info("Entering into userEnterThePasswordAsAdmin123");

		//driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		objloginpage.enterpPassword(pwd);
		logger.info("Exiting into userEnterThePasswordAsAdmin123");

	}



}
