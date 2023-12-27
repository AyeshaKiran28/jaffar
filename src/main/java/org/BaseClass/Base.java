package org.BaseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public Properties pro;
	public WebDriver driver;
	
	@BeforeMethod
	public void browserLaunch() throws IOException {
		
	     File fi=new File("src/test/resources/Properties/HRM.properties");
	     FileInputStream input =new FileInputStream(fi);
	     pro = new Properties();
	     pro.load(input);
	     pro.getProperty("browser").equalsIgnoreCase("chrome");
	     WebDriverManager.chromedriver().setup();
	     driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get(pro.getProperty("url"));
	

	    
	}
	
	
	
}
