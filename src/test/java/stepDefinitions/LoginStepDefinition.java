package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;
import support.CommonFunction;
import utility.BaseClass;

public class LoginStepDefinition extends BaseClass {

	public LoginStepDefinition() {
		PageFactory.initElements(driver, this);
	}

	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
		String loginPageTitle = driver.getTitle();
		Assert.assertEquals(loginPageTitle, "Login | Sainik Security Services");
	}

	@When("login into portal with {string} credential")
	public void login_into_portal_with_credential(String string) throws IOException {
		LoginPage loginPage = new LoginPage();
		loginPage.getLoginDetails();
	}

	@Then("user should be redirected to the {string} page")
	public void user_should_be_redirected_to_the_page(String string) {
		String dashboardTitle = driver.getTitle();
		Assert.assertEquals(dashboardTitle, "Dashboard | Sainik Security Services");
	}
}
