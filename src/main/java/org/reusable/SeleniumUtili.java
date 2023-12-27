package org.reusable;

import java.util.Set;

import org.BaseClass.Base;
import org.openqa.selenium.WebElement;

public class SeleniumUtili extends Base {

	public void toClick(WebElement element) {
		element.click();

	}
	public void sendkeys(WebElement element,String text) {
	
		element.sendKeys(text);

	}
	/*public void windowsHandling() {
		
	
	String parentWindowHandle = driver.getWindowHandle();
	Set<String> childWindowHandles = driver.getWindowHandles();
	
	for (String all : childWindowHandles) {
		driver.switchTo().window(all);
	}
*/

}

