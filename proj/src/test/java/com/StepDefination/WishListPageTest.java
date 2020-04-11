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
import com.pages.WishListPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WishListPageTest extends TestBase{


	LoginPage lp ;
	HomePage hp;
	//EditAccountPage ea;
	WishListPage wp;
	ExcelUtility excel;
	TestUtil s;
	final static Logger logger = LogManager.getLogger(WishListPageTest.class.getName());
	
	
@Given("^User is on the HomePage$")
	public void User_on_Home() throws IOException {
	TestBase.initialization();
	driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Wait, TimeUnit.SECONDS);
	lp = new LoginPage();
	lp.User_Clicks_Login();
	hp=  lp.loginmethod(prop.getProperty("username"),prop.getProperty("password"));
	}
	
@When("^User clicks on WishListPage$")
public void User_clicks_on_WishListPage()  {
    
	 hp =new HomePage();
	    hp.verifypage();
	    hp.Wish();
}

@Then("^User is on wishlistpage$")
public void User_is_on_wishlistpage() {
   wp = new WishListPage();
   wp.verifywishpage();
   logger.info("user is on wishlist");
}

@Then("^User Adds item to wish list through search$")
public void User_Adds_item_to_wish_list_through_search() {
	wp = new WishListPage();
	wp.additemstowish();
	logger.info("user added an item to wishlist");
}

@Then("^product appears on wishlist$")
public void product_appears_on_wishlist() throws IOException  {
	wp = new WishListPage();
    wp.checkwish();
    s = new TestUtil(driver);
    s.to_take_screenshot("D:/Git/proj/src/test/resources/Screenshot/MyWishList.png");
    logger.info("Screenshot captured");
    
}
	
}
