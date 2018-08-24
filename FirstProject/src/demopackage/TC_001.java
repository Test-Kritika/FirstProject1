package demopackage;

import org.openqa.selenium.By;

public class TC_001 extends BasePage{

	public static void main(String[] args) throws Exception {
		
launch(getData("browser"), getData("url"));
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		
		driver.manage().deleteAllCookies();
		
		driver.navigate().back();
		
		Thread.sleep(5000);
		
		driver.navigate().forward();
		
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		
		driver.findElement(By.id("loginsubmit")).click();
		//driver.close();
		
		driver.quit();

	}

}
