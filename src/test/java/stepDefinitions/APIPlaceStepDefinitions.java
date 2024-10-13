
package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class APIPlaceStepDefinitions{
	
	@Given("Test start")
	public void test_start() {
	   System.out.println("Test started");
	}
	@Given("Add Place Payload")
	public void add_place_payload() {
	System.out.println("Add Place Payload");
	}
	@When("User calls {string} with {string} Request")
	public void user_calls_with_request(String string, String string2) {
	System.out.println("User calls {string} with {string} Request");
	}
	@Then("Verify API is Success with status code {int}")
	public void verify_api_is_success_with_status_code(Integer int1) {
		System.out.println("Verify API is Success with status code {int}");
	    
	}
	@Then("{string} in responseBody is {string}")
	public void in_response_body_is(String string, String string2) {
	    System.out.println("{string} in responseBody is {string}");
	}


}

