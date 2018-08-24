package demopackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginUI 
{
	@FindBy(linkText="Sign in")public WebElement signIn;
	@FindBy(id="email")public WebElement email;
	@FindBy(id="passwd")public WebElement pass;
	@FindBy(id="SubmitLogin")public WebElement submitLogin;
	@FindBy(xpath=".//*[@id='center_column']/div[1]/ol/li")public WebElement error;
	
	public LoginUI(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}


	public void customerLogin()
	{
		signIn.click();
		email.sendKeys("qatest123489@gmail.com");
		pass.sendKeys("password");
		submitLogin.click();
	}
	
	
	public String loginVerification()
	{
		return error.getAttribute("innerHTML");
	}
	
}