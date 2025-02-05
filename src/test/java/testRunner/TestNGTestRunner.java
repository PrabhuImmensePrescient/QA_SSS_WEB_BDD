package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "E:\\QA_SSS_WEB_BDD\\src\\test\\resources\\features\\login.feature",
		glue = "stepDefinitions",
		tags = "@test",
		plugin = { "html:target.html",
		"json:target.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },
		dryRun = false,
		monochrome = true)
public class TestNGTestRunner extends AbstractTestNGCucumberTests {

}
