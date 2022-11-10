package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features= {"src/test/java/features/"},
		dryRun=!true,
		snippets=SnippetType.CAMELCASE,  // this line it helps to bring the java from of the methods
		monochrome=true,   //   to remove the junk words
		glue={"steps","MyHook"},// mappings
	//	tags= "@sanity",
		//plugin= {"pretty","html:reports/CucumberReport.html",
		//		"json:reports/result.json",
		//		"junit:reports/result.xml"}
		plugin ="com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"

		
		
		
		
		)
public class Runner extends AbstractTestNGCucumberTests {

}
