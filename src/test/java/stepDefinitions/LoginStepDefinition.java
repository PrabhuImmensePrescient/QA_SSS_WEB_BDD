package stepDefinitions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.BaseCalss;
import utility.Generic;

public class LoginStepDefinition extends BaseCalss{
	
	@FindBy(xpath = "//input[@name='email']")
	WebElement username;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement Loginbtn;
	
	@FindBy(xpath = "//img[@class='img-fluid']")
	WebElement logo;
	
	// Initialize the webelement with page factory method
	
	public LoginStepDefinition() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() {
	    String loginPageTitle=driver.getTitle();
	    Assert.assertEquals(loginPageTitle, "Login | Sainik Security Services");
	    
	}

	@When("login into portal with {string} credential")
	public void login_into_portal_with_credential(String string) {
		username.sendKeys(Keys.chord(Keys.CONTROL, "a") + Keys.DELETE);
		password.sendKeys(Keys.chord(Keys.CONTROL, "a") + Keys.DELETE);
		username.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		
		Generic.clickOn(driver, Loginbtn, 3);
		
	}

	@Then("the user should be redirected to the {string} page")
	public void the_user_should_be_redirected_to_the_page(String string) {
	    
		String dashboardTitle=driver.getTitle();
		Assert.assertEquals(dashboardTitle, "Dashboard | Sainik Security Services");
	}
}
