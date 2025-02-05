package pageObjects;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import support.CommonFunction;
import utility.BaseClass;

public class LoginPage extends CommonFunction {

	public WebDriver driver = BaseClass.driver;

	@FindBy(xpath = "//input[@name='email']")
	WebElement username;
	@FindBy(xpath = "//input[@name='password']")
	WebElement password;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement Loginbtn;
	@FindBy(xpath = "//img[@class='img-fluid']")
	WebElement logo;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public void getLoginDetails() throws IOException {
		driver.navigate().to(BaseClass.getData().getProperty("url"));
		username.sendKeys(Keys.chord(Keys.CONTROL, "a") + Keys.DELETE);
		password.sendKeys(Keys.chord(Keys.CONTROL, "a") + Keys.DELETE);
		username.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
	}
}
