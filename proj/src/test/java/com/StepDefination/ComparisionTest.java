package com.StepDefination;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.BaseClass.TestBase;
import com.ExcelUtility.ExcelUtility;
import com.SeleniumUtility.TestUtil;
import com.pages.ComparisionPage;
import com.pages.HomePage;
import com.pages.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ComparisionTest extends TestBase{
	
	

	LoginPage lp ;
	HomePage hp;
	
	ComparisionPage c;
	TestUtil s;
	ExcelUtility excel;
	final static Logger logger = LogManager.getLogger(ComparisionTest.class.getName());
	
@Given("^User is on Home$")
	public void User_on_Home() throws IOException {
	TestBase.initialization();
	driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Wait, TimeUnit.SECONDS);
	lp = new LoginPage();
	lp.User_Clicks_Login();
	hp=  lp.loginmethod(prop.getProperty("username"),prop.getProperty("password"));
	}
	
@When("^User searches a product and adds to compare page$")
public void User_adds_product_to_compare()  {
    
	 hp =new HomePage();
	    hp.verifypage();
	    hp.cp();
	    c = new ComparisionPage();
	 c.addpro1();
	 logger.info("user added an item to compare ");
	 c.addpro2();
	 logger.info("user added an item to compare ");
}

@Then("^User adds 2nd product to compare page$")
public void User_adds_2nd_product() {
   c.compare();
}

@Then("^items appears on compare page$")
public void Verify_comparision() throws IOException {
c.verifyPage();	
s = new TestUtil(driver);
s.to_take_screenshot("D:/project/proj/src/test/resources/Screenshot/comparision.png");
logger.info("Screenshot captured");

}


	
	

}
