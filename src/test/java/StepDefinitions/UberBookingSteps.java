package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberBookingSteps {

	@Given("User wants to select a car type {string} from uber app")
	public void user_wants_to_select_a_car_type_from_uber_app(String carType) {
		
		
		System.out.println("Step 1 "+ carType);
	    
	}

	@When("User selects car {string} and pickup point {string} and Drop Loaction {string}")
	public void user_selects_car_and_pickup_point_and_drop_loaction(String cartype, String pickUppoint, String DropPoint) {
	    System.out.println("Step 2 : The car type is  " + cartype +" pickup is from "+ pickUppoint + " drop is from "+DropPoint);
	}

	@Then("Driver starts the journey")
	public void driver_starts_the_journey() {
		System.out.println("step 3:Driver starts the journey ");
	     
	}

	@Then("Driver ends the journey")
	public void driver_ends_the_journey() {
	   
	     System.out.println("step 4:Driver ends the journey");
	}

	@Then("User pays {int} USD")
	public void user_pays_usd(Integer price) {
	     System.out.println("the user pays :"+price +" USD");
	} 

}
