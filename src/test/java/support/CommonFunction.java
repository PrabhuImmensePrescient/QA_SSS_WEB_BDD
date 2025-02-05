package support;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.BaseClass;

public class CommonFunction extends BaseClass {

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static WebElement explicitWait(WebDriver driver, WebElement locator, int timeoutInSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(timeoutInSeconds));
		return wait.until(ExpectedConditions.visibilityOf(locator));
	}

	// Explicit wait for click able elements

	public static void clickOn(WebDriver driver, WebElement locator, int timeout) {
		new WebDriverWait(driver, java.time.Duration.ofSeconds(timeout))
				.until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
	}
}
