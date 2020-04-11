package com.pages;

import java.io.File;
import java.io.IOException;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.junit.Assert;
import com.BaseClass.TestBase;



public class EditAccountPage extends TestBase{

	
	@FindBy(xpath="//*[@id=\"content\"]/h1")
	WebElement display;
	
	@FindBy(xpath="//*[@id=\"input-firstname\"]")
	WebElement firstname;
	
	@FindBy(xpath="//*[@id=\"input-lastname\"]")
	WebElement lastname;
	
	@FindBy(xpath="//*[@id=\"input-email\"]")
	WebElement email;
	
	@FindBy(xpath="//*[@id=\"input-telephone\"]")
	WebElement telephone;
	
	@FindBy(xpath="//*[@id=\"content\"]/form/div/div[2]/input")
	WebElement subbtn;
	
	public EditAccountPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean VerifyEditAccountPage() {
		 return display.isDisplayed();
	}
	
	
	public void TitleEditPage() {
		String S = driver.getTitle();
		Assert.assertEquals("My Account Information", S);
	}
	
	public void ChangeFN() {
		int i = 0;
		
		for(i=0;i<30;i++)
		{
		firstname.sendKeys(Keys.BACK_SPACE);
		}
		firstname.sendKeys(Keys.CLEAR+"Timon");
	}
	
	public void ChangeLN() {
		
		int i = 0;
		
		for(i=0;i<30;i++)
		{
		lastname.sendKeys(Keys.BACK_SPACE);
		}
		lastname.sendKeys(Keys.CLEAR+"Pumba");
		
	}
	
	public  static void ss(String fileName) throws IOException {
		File file =	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("D:/project/proj/src/test/resources/Screenshot"+fileName+".jpg"));
		}
	
	public void submit() {
		subbtn.click();
	}
	
}
