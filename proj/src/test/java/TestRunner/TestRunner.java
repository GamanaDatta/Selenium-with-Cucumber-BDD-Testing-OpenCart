package TestRunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
					features = "D:\\project\\proj\\src\\test\\resources\\Feature\\Features\\log.feature" // location of that package\filename
					,glue= {"com.StepDefination"}// name of that package
				//resldy	,plugin = { "pretty","html:reports/cucumber-html-report","json:reports/jsonreport","com.cucumber.listener.ExtentCucumberFormatter:reports/Extentreports/Extentreport.html"}
				 	,format= {"pretty","html:test-output"}
					,dryRun = false
					,strict = true
					,monochrome = true
					
				)

public class TestRunner {

	@AfterClass
	public static void extentReport()
	{
		/*Reporter.LoadXMLConfig("D:\\project\\proj\\src\\test\\resources\\Testdata\\extent-config.xml");
		Reporter.setSystemInfo("user",System.getProperty("user.name"));
		Reporter.setSystemInfo("os","Windows");
		Reporter.setTestRunnerOutput("sample test runner output message");*/
		
	}
	
}
