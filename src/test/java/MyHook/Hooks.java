package MyHook;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Hooks extends DriverInitalization {
   @Before(order=1)
    public void initalization(Scenario scenario) {
	   System.out.println(" i am in the initalization method");
   }
	
	@Before(order=2)
	public void setup(Scenario scenario) {
		System.out.println("i am in  setup method ----Before");
		System.out.println("i am trying to print the scenario name"+scenario.getName());
		logger=Logger.getLogger("OrangeHRM"); // added to Logger
		PropertyConfigurator.configure("log4j.properties");
		logger.setLevel(Level.DEBUG);
		logger.debug("Starting of OrangeHRM Application");
		logger.info("Entering into userNavigateToTheOrgangeHRMApplication");

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		logger.info("Exiting into userNavigateToTheOrgangeHRMApplication");
		
	/*	System.out.println("ID:"+scenario.getId());
		System.out.println("URi"+scenario.getUri());
	//	System.out.println("Lines"+scenario.getLine());
		System.out.println("Tags"+scenario.getSourceTagNames());
		System.out.println("Status:"+scenario.getStatus());*/
			
	}
	
	@After(order=2)
    public void teardown(Scenario scenario) {
		
		System.out.println("i am in  teardown method ----After");
		boolean failed=scenario.isFailed();
		System.out.println("output of scenario"+failed);
		if(!failed) {
			
			byte[] ScreenshotAs=driver.getScreenshotAs(OutputType.BYTES);
			scenario.embed(ScreenshotAs,"image/png");
			
			
			
		}
		
		
		driver.close();
	     

		
	}
	
	 @After(order=1)
	    public void deletecookies(Scenario scenario) {
		   System.out.println(" i am in the delete cookies method");
	   }
	
	
	

}
