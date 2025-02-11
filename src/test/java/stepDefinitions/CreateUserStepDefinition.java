package stepDefinitions;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.EmployeeManagemet;
import utility.BaseClass;

public class CreateUserStepDefinition extends BaseClass {

	@When("admin creates an {string} with given details")
	public void admin_creates_an_with_given_details(String entityType, DataTable table) throws InterruptedException {
		EmployeeManagemet empMng = new EmployeeManagemet();
		System.out.println("Creating : " + entityType);
		List<Map<String, String>> userDataList = table.asMaps(String.class, String.class);
		for (Map<String, String> userData : userDataList) {
			String firstName = userData.get("firstName");
			String lastName = userData.get("lastName");
			String email = userData.get("email");
			String password = userData.get("password");
			String phone = userData.get("phone");
			String dob = userData.get("dob");
			String state = userData.get("state");
			String city = userData.get("city");
			String address = userData.get("address");
			String pincode = userData.get("pincode");
			String joiningDate = userData.get("joiningDate");
			String releavingDate = userData.get("releavingDate");
			empMng.createEmployee(firstName, lastName, email, password, phone, dob, state, city, address, pincode,
					joiningDate, releavingDate);
		}
	}

	@Then("verify the newly created user")
	public void verify_the_newly_created_user() {

	}
}
