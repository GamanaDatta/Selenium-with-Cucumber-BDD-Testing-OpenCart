package com.StepDefination;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.BaseClass.TestBase;
import com.ExcelUtility.ExcelUtility;
import com.SeleniumUtility.TestUtil;
import com.pages.HomePage;
import com.pages.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Assert;
public class HomepageTest extends TestBase {

		LoginPage lp ;
		HomePage hp;
		ExcelUtility excel;
		TestUtil s;
		final static Logger logger = LogManager.getLogger(HomepageTest.class.getName());
	
@Given("^User Opens Browser$")
public void User_Opens_Browser()  {
    TestBase.initialization();
}

@When("^User is on OpenCart$")
public void User_is_on_OpenCart()  {
	lp = new LoginPage();
	lp.TitleOfthePage();
	logger.info("user on opencart");
}

@Then("^User Clicks on loginPage$")
public void User_Clicks_on_loginPage()  {
	driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Wait, TimeUnit.SECONDS);
	lp = new LoginPage();
	lp.User_Clicks_Login();
	logger.info("Login button is clicked ");
}

@Then("^User Enters Username name Password and submits$")
public void User_Enters_Username_name_Password_and_submits() throws IOException  {
	
	lp = new LoginPage();
	excel = new ExcelUtility();
	hp=  lp.loginmethod(excel.excel_username(0), excel.excel_password(1));
	logger.info("User Logged in");
}

@Then("^Homepage appears$")
public void Homepage_appears() throws IOException  {
	
		hp.verifypage();
		String S = driver.getTitle();
		Assert.assertEquals("My Account", S);
		s = new TestUtil(driver);
		s.to_take_screenshot("D:/Git/proj/src/test/resources/Screenshot/logged_in.png");
		logger.info("Screenshot captured");
		
}
	
}
