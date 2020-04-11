package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath="//*[@id=\"search\"]/input")
	WebElement search;
	
	@FindBy(xpath="//*[@id=\"search\"]/span/button/i")
	WebElement Srchbtn;
	
	
	
	@FindBy(xpath="//*[@id=\"column-right\"]/div/a[2]")
	WebElement editacc;

	@FindBy(xpath="//*[@id=\"column-right\"]/div/a[5]")
	WebElement ToWish;
	

	public HomePage() {
		
			PageFactory.initElements(driver, this);
			
		}

	public String verifypage() {
		return driver.getTitle();
	}
	
	public EditAccountPage EAPAGE() {
		editacc.click();
		return new EditAccountPage();
	}
	
	public WishListPage Wish() {
		ToWish.click();
		return new WishListPage();
	}
	
	public ComparisionPage cp() {
		return new ComparisionPage();
	}
	
	
}
