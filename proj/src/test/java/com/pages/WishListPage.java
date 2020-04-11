package com.pages;

import java.io.File;
import java.io.IOException;

import org.codehaus.plexus.util.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.TestBase;

public class WishListPage extends TestBase{
	
	@FindBy(xpath="//*[@id=\"wishlist-total\"]/i")
	WebElement wishbtn;
	
	@FindBy(xpath="//*[@id=\"search\"]/input")
	WebElement search;
	
	@FindBy(xpath="//*[@id=\"search\"]/span/button/i")
	WebElement srchbtn;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[3]/div/div/div[1]/a/img")
	WebElement prod;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[1]/table/tbody/tr/td[1]/a/img")
	
	WebElement it;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[3]/div/div/div[2]/div[2]/button[2]")
	WebElement addw;
	
	public WishListPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void verifywishpage() {
		driver.getTitle();
		
	}
	
	public void additemstowish() {
		search.sendKeys("iphone");
		srchbtn.click();
		boolean a =prod.isDisplayed();
		System.out.print(a);
		addw.click();
	}

	public void checkwish() {
		wishbtn.click();
		it.isDisplayed();
		
		
	}
	public void ss(String fileName) throws IOException {
		File file =	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("D:/project/proj/src/test/resources/Screenshot"+fileName+".jpg"));
		}
	

}
