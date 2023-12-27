package org.pages;

import org.BaseClass.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.reusable.SeleniumUtili;

public class HRM_Page extends Base {

	public SeleniumUtili rn;
	
	public HRM_Page(WebDriver driver ) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(name = "username")
	WebElement username;
	
	@FindBy(name = "password")
	WebElement pass;
	
	@FindBy(xpath = "//button[text()=' Login ']")
	WebElement login;
	
	public void loginDetails() throws InterruptedException {
		 rn = new SeleniumUtili();
		 Thread.sleep(2000);
		 rn.sendkeys(username, "Admin");
		 Thread.sleep(2000);
		 rn.sendkeys(pass, "admin123");
		 Thread.sleep(2000);
		 rn.toClick(login);
		

	}
}


