package demopackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Drop {
		
		WebDriver driver;
		
		@BeforeMethod
		public void setup()
		{
			
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
				driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//driver.get("http://amazon.in");
			driver.get("https://facebook.com");
		}
		
		
		@Test (priority = 0)
		public void Dropdown()
		{
			
			Actions act=new Actions(driver);
		    act.click(driver.findElement(By.xpath(".//*[@id='month']")))
		    .click(driver.findElement(By.xpath("//option[@value='3']")))
		    .build().perform();
		    
//			driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
//			
//			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry Potter");
//			driver.findElement(By.className("nav-input")).click();
//			
//			
//			String actual_title=driver.getTitle();
//			String exp_title="Amazon.in: Harry Potter: Books";
//			
//			Assert.assertEquals(actual_title, exp_title);
			
			/*WebElement dropdownElement = driver.findElement(By.id("searchDropdownBox"));
		    JavascriptExecutor jse = (JavascriptExecutor)driver;
		    jse.executeScript("arguments[0].value='Amazon Fashion'", dropdownElement);
*/
			
		}
		
		
//		@Test (priority = 1)
//		public void Dropdown2()
//		{
//			WebElement web=driver.findElement(By.id("searchDropdownBox"));
//			Select sel=new Select(web);
//			sel.selectByIndex(10);
//			WebElement val = sel.getFirstSelectedOption();
//					System.out.println(val.getText());	
//						
//			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry Potter");
//			driver.findElement(By.className("nav-input")).click();
//			
//			String actual_title=driver.getTitle();
//			String exp_title="Amazon.in: Harry Potter: Books";
//			
//			Assert.assertEquals(actual_title, exp_title);
//		}
		
		
		
		
		@AfterMethod
		public void teardown()
		{
			driver.quit();
		}
		
}
