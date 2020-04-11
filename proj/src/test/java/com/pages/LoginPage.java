package com.pages;

import java.io.File;
import java.io.IOException;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.TakesScreenshot;
import com.BaseClass.TestBase;

public class LoginPage extends TestBase{

	@FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/div/form/div[1]/input")
	WebElement email;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/div/form/div[2]/input")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div/form/input")
	WebElement submit;
	
	@FindBy(xpath="//*[@id=\"logo\"]/h1/a")
	WebElement logo;
	
	//initializing page factory
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void User_Clicks_Login()  {
	WebElement account = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/i"));
	account.click();
	WebElement log = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a"));
	log.click();
	}
	
	
	public String TitleOfthePage() {
		
		return driver.getTitle();
		
	}
	
	public boolean validateLoGo() {
		
		return logo.isDisplayed();
		
		
	}
	
	public void ss(String fileName) throws IOException {
	File file =	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(file, new File("D:/project/proj/src/test/resources/Screenshot"+fileName+".jpg"));
	}
	
	

	public  HomePage loginmethod(String a,String b){
		//WebElement em = driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
		email.sendKeys(a);
		//WebElement pw = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/div[2]/input"));
		password.sendKeys(b);
		//WebElement sub = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
		
		submit.click();
		
		
		
	return new HomePage();
		
	}
}
