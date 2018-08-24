package demopackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class TC001_Login extends BasePage
{
  
	LoginUI page;
	
  @BeforeClass
  public void setProcess() 
  {
	  launch("chrome", "http://automationpractice.com/index.php");
  }



@Test
  public void login() 
  {
	  page=new LoginUI(driver);
	  page.customerLogin();
	  Assert.assertEquals("Authentication failed", page.loginVerification());
  }

  @AfterClass
  public void endProcess() 
  {
	  
  }

}