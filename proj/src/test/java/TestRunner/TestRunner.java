package TestRunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
					features = "D:\\Git\\proj\\src\\test\\resources\\Feature\\Features\\log.feature" // location of that package\filename
					,glue= {"com.StepDefination"}// name of that package
					,format= {"pretty","html:test-output"}
					,dryRun = false
					,strict = true
					,monochrome = true
					
				)

public class TestRunner {

	@AfterClass
	public static void extentReport()
	{
		
		
	}
	
}
