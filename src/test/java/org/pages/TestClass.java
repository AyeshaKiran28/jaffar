package org.pages;

import java.io.IOException;

import org.BaseClass.Base;
import org.testng.annotations.Test;

public class TestClass extends Base{

	public HRM_Page hn;
	
@Test
	public void hrnRunTest() throws IOException, InterruptedException {
		
		hn = new HRM_Page(driver);
		
		hn.loginDetails();
		
		

	}

}
