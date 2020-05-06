package testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;

public class TC_Login_001 extends BaseClass{
	
	@Test
	public void loginTest() throws IOException
	{
		

		logger.info("entered url");
		
		LoginPage lp = new LoginPage(driver);
		
		lp.setUserName(username);
		logger.info("entered username");
		lp.setPassword(password);
		logger.info("entered password");
		
		lp.clickSignin();
		logger.info("signin button clicked");
		System.out.println("all steps are performed successfully");
		
		
		
		  if (driver.getTitle().equals("Find a Flight: Mercury Tours:")) 
		  { 
			  Assert.assertTrue(true);
			  logger.info("login test passed");
			  lp.clickSignOff();
			  logger.info("logout successfully");
		  } 
		  else 
		  {
			  captureScreen(driver,"loginTest");
			  Assert.assertTrue(false);
			  logger.info("login test failed"); 
			  
		  }
		 
		 
	}

}
