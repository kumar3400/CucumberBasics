package StepDefinitions;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserRegistrationSteps {

	@Given("User is on Registration page")
	public void user_is_on_registration_page() {
		 
		System.out.println("User is on Registration Page");
	}

	//This is using for asLists
	@When("User enters following user details")
	public void user_enters_following_user_details(DataTable datatable) {
		 
		List<List<String>> userList =	datatable.cells();
		for (List<String> list : userList) {
			System.out.println(list);
		}
	}
	
	//This is for using asMaps 
	@When("User enters following user details with coulmns")
	public void user_enters_following_user_details_with_coulmns(DataTable dataTable) {
	 List<Map<String,String>> userList = dataTable.asMaps(String.class,String.class);
	 
	 //System.out.println(userList);
	 //System.out.println(userList.get(0).get("firstname"));
	 
	 for(Map<String,String> e :userList) {
		 
		 System.out.println(e.get("firstname"));
		 System.out.println(e.get("lastname"));
		 System.out.println(e.get("email"));
		 System.out.println(e.get("phone"));
		 System.out.println(e.get("city"));
	 }
	}



	@Then("user registration should be successfull")
	public void user_registration_should_be_successfull() {
		 
	}

}
