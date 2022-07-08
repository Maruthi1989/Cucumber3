package stepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import pages.Login_Webelements;

public class Login_Page 
{
	WebDriver driver=null;
	Login_Webelements login=null;
	
	@Before
	public void launchBrowser()
	{
		String strpath=System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", strpath);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	@After
	public void tearDown()
	{
		driver.close();
		driver.quit();
	}
	
	@Given("User is on the login page.")
	public void user_is_on_the_login_page() 
	{
		driver.get("https://www.facebook.com/login/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   
	}

	@When("^user enters the (.*) and (.*)$")
	public void the_user_enters_the_username_and_password(String email,String password) 
	{
	   login=new Login_Webelements(driver);
	   login.enterEmail(email);
	   login.enterPassword(password);
	    
	}

	@And("Click on the login button")
	public void click_on_the_login_button()
	{
	   
	    login.clickLogin();
	}

	@Then("the user is navigate to homepage")
	public void the_user_is_navigate_to_homepage() 
	{
	  
		login.verifyHomepage();
	   
	}
	
	
}//main class close
