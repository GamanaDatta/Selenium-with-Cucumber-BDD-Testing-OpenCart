package com.StepDefination;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.BaseClass.TestBase;
import com.ExcelUtility.ExcelUtility;
import com.SeleniumUtility.TestUtil;
import com.pages.EditAccountPage;
import com.pages.HomePage;
import com.pages.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class EditAccountPageTest extends TestBase {
	
	LoginPage lp ;
	HomePage hp;
	EditAccountPage ea;
	ExcelUtility excel;
	TestUtil s;
	final static Logger logger = LogManager.getLogger(EditAccountPageTest.class.getName());
	

@Given("^User is on HomePage$")
public void User_is_on_HomePage() throws IOException  {
   
	TestBase.initialization();
	
	driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Wait, TimeUnit.SECONDS);
	lp = new LoginPage();
	lp.User_Clicks_Login();
	hp=  lp.loginmethod(prop.getProperty("username"),prop.getProperty("password"));
	logger.info("user logged in");
}

@When("^User clicks on Edit Account Page$")
public void User_clicks_on_Edit_Account_Page()  {
    hp =new HomePage();
    hp.verifypage();
    hp.EAPAGE();
}

@Then("^User is on EditAccountPage$")
public void User_is_on_EditAccountPage()  {
	ea = new EditAccountPage();
    ea.TitleEditPage();
}

@Then("^User Changes First name and Last name and submits$")
public void User_Changes_First_name_and_Last_name_and_submits()  {
   ea = new EditAccountPage();
   ea.ChangeFN();
   ea.ChangeLN();
   
   ea.submit();
   logger.info("user changed first name and last name");
}

@Then("^Successfully changed$")
public void Successfully_changed() throws IOException  {
   
	//if Successfully changed it should return to My Account(home) page
	
	Assert.assertEquals("My Account", driver.getTitle());
	EditAccountPage.ss("changed_account_details");
	s = new TestUtil(driver);
	s.to_take_screenshot("D:/project/proj/src/test/resources/Screenshot/afterEditing_details.png");
	logger.info("Screenshot captured");
	
   
}

}
