package org.BaseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseFlip {
	
	public Properties prof;
	public WebDriver driver;
	
	public void browserLauncH() throws IOException {
		
		File ff = new File("src/test/resources/Properties/HRM.properties");
		FileInputStream in = new FileInputStream(ff);
		prof = new Properties();
		prof.load(in);
		prof.getProperty("browser").equalsIgnoreCase("chrome");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prof.getProperty("urlF"));
	}

}
