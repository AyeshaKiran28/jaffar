package org.pages;

import org.BaseClass.Base;
import org.BaseClass.BaseFlip;
import org.testng.annotations.Test;

public class FlipRun extends Base {

	public FlipKartPage flk;
	
	@Test
	public void flipkartTestRun() throws InterruptedException {
		
		FlipKartPage flk = new FlipKartPage(driver);
				flk.flipkartCart(null);
				
	}
}
