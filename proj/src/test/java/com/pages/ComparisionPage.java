package com.pages;

import java.io.File;
import java.io.IOException;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClass.TestBase;

import org.junit.Assert;

public class ComparisionPage extends TestBase{

	@FindBy(xpath="//*[@id=\"search\"]/input")
	WebElement search;
	
	@FindBy(xpath="//*[@id=\"search\"]/span/button/i")
	WebElement srchbtn;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[3]/div/div/div[2]/div[2]/button[3]")
	WebElement comparebtn;
	
	@FindBy(xpath="//*[@id=\"compare-total\"]")
	WebElement compare;
	
	@FindBy(xpath="//*[@id=\"content\"]/table/tbody[1]/tr[1]/td[2]/a/strong")
	WebElement s1;
	
	@FindBy(xpath="//*[@id=\"content\"]/table/tbody[1]/tr[1]/td[3]/a/strong")
	WebElement s2;
	
	
public ComparisionPage() {
		
		PageFactory.initElements(driver, this);
		
	}

public void addpro1() {
	
	search.sendKeys("iphone");
	srchbtn.click();
	comparebtn.click();
	
}

public void addpro2() {
	
	int i = 0;
	for(i=0;i<=10;i++) {
	search.sendKeys(Keys.BACK_SPACE);
	}
	search.sendKeys(Keys.CLEAR+"htc");
	srchbtn.click();
	comparebtn.click();
}
	
public void compare() {
	compare.click();
}

public void verifyPage() {
	
	boolean a = s1.isDisplayed();
	boolean b = s2.isDisplayed();
	Assert.assertTrue(a);
	Assert.assertTrue(b);
	
	
}
public void ss(String fileName) throws IOException {
	File file =	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(file, new File("D:/project/proj/src/test/resources/Screenshot"+fileName+".jpg"));
	}
	
}
