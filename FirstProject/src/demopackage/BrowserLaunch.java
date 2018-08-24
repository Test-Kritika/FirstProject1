package demopackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserLaunch {

	static WebDriver driver;

	public static void main(String[] args) {

//		System.setProperty("webdriver.chrome.driver", "B:\\Kritika\\Selenium Class\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "//drivers//chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://www.google.com");

//		System.setProperty("webdriver.ie.driver","B:\\Kritika\\Selenium Class\\IEDriverServer.exe");
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+ "//drivers//IEDriverServer.exe" );
		driver = new InternetExplorerDriver();
		driver.get("https://www.flipkart.com");


//		System.setProperty("webdriver.gecko.driver","B:\\Kritika\\Selenium Class\\geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+ "//drivers//geckodriver.exe" );
		driver = new FirefoxDriver();
		driver.get("https://www.amazon.in");



	}

}
