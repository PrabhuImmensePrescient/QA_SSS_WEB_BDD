package stepDefinitions;

import java.io.IOException;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utility.BaseClass;

public class Hooks {

	@Before
	public void openBrowser() throws IOException {
		BaseClass.initilizeDriver();
		BaseClass.launchUrl();
	}

	@After
	public void tearDown() {
		BaseClass.driver.quit();
	}
}
