package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Webelements 
{
	WebDriver driver;
	
	@FindBy(name="email")
	WebElement Email;
	
	@FindBy(id="pass")
	WebElement Password;
	
	@FindBy(id="loginbutton")
	WebElement LoginBtn;
	
	@FindBy(xpath="//span[text()='Maruthi BN']")
	WebElement Homepage;
	
	public Login_Webelements(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void enterEmail(String email)
	{
		Email.sendKeys(email);
	}
	
	public void enterPassword(String password)
	{
		Password.sendKeys(password);
	}
	
	public void clickLogin()
	{
		LoginBtn.click();
	}
	
	public void verifyHomepage()
	{
		Homepage.isDisplayed();
	}
	
}
