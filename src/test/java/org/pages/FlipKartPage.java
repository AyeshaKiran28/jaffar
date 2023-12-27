package org.pages;

import java.util.Iterator;
import java.util.Set;

import org.BaseClass.Base;
import org.BaseClass.BaseFlip;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.reusable.SeleniumUtili;

import net.bytebuddy.asm.Advice.Argument;


public class FlipKartPage extends Base {

	public SeleniumUtili fk;
	
	public FlipKartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver , this);
	
	}
	
	@FindBy(xpath = "//span[text()='✕']")
	WebElement popUp;
	
	@FindBy(xpath = "//input[@type='text']")
	WebElement type;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement search;
	
	@FindBy(xpath="//div[text()='vivo T2x 5G (Glimmer Black, 128 GB)']")
	WebElement phone;
	
	@FindBy(xpath = "//button[text()='Add to cart']")
	WebElement addToCart;
	
	@FindBy(xpath = "//span[text()='Place Order']")
	WebElement placeOrder;
	
	@FindBy(xpath = "//input[@type='text']")
	WebElement phnumber;
	
	@FindBy(xpath = "//span[text()='CONTINUE']")
	WebElement continued;
	
	public void flipkartCart(Object[] Argument) throws InterruptedException {
		
		fk = new SeleniumUtili();
		
		Thread.sleep(2000);
		fk.toClick(popUp);
		Thread.sleep(2000);
		
		fk.sendkeys(type, "mobiles");
		Thread.sleep(2000);
		fk.toClick(search);
		
		Thread.sleep(2000);
	    //fk.windowsHandling();
		
		
		Thread.sleep(3000);
		fk.toClick(phone);
		Thread.sleep(3000);

		
		String parentWindowHandle = driver.getWindowHandle();
		Set<String> childWindowHandles = driver.getWindowHandles();
		
		for (String all : childWindowHandles) {
			driver.switchTo().window(all);
		}
		
		Thread.sleep(2000);
		
		JavascriptExecutor j = (JavascriptExecutor)driver;
		//j.executeScript("window.scrollBy(0,500)");
		j.executeScript("arguments[0].scrollIntoView(true)",addToCart);
		
		fk.toClick(addToCart);
		Thread.sleep(2000);
		fk.toClick(placeOrder);
		Thread.sleep(2000);
		fk.sendkeys(phnumber, "9876543210");
		Thread.sleep(2000);
		fk.toClick(continued);
		
	}
}
