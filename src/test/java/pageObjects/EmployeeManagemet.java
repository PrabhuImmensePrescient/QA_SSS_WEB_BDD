package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import support.CommonFunction;
import utility.BaseClass;

public class EmployeeManagemet extends CommonFunction {
	
	public WebDriver driver = BaseClass.driver;
	
	@FindBy(xpath = "//span[.='Resources']")
	WebElement resourcesButton;
	@FindBy(xpath = "//span[.='Employees Management']")
	WebElement empMngButton;
	@FindBy(xpath = "//button[.='Add New Employee']")
	WebElement addNewEmpButton;
	@FindBy(xpath = "//div[.='Select...']")
	WebElement selectEmpType;

	public EmployeeManagemet() {
		PageFactory.initElements(driver, this);
	}
	
	public void createEmployee(String employeeType, String lastName, String email, String password, String phone, String dob, String state, String city, String address, String pincode, String joiningDate, String releavingDate) throws InterruptedException
	{
		resourcesButton.click();
		empMngButton.click();
		addNewEmpButton.click();
		selectEmpType.click();
		driver.findElement(By.xpath("//*[contains(text(), '"+employeeType+"')]")).click();
		Thread.sleep(3000);
	}
}
