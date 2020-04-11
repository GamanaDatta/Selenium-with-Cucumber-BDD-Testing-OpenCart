package com.SeleniumUtility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.BaseClass.TestBase;

public class TestUtil extends TestBase{

	public static int Page_Load_Timeout = 20;
	public static int Implicit_Wait = 10;
	
 WebDriver driver;
	
	//constructor
	public  TestUtil(WebDriver driver)
	{
		this.driver= driver;
	}
	
	//to take screenshot
	public void to_take_screenshot(String path)
	{
		TakesScreenshot screen =  (TakesScreenshot)driver;
		File src = screen.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
