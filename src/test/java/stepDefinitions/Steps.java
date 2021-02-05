package stepDefinitions;

import java.util.HashMap;
import java.util.Map;
 
import io.cucumber.datatable.DataTable; 
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;

public class Steps {
	Map<String, String> requestMap = new HashMap<>();
    Response response;
	
    // Keyword 'Given', to set the step background
	@Given("Get API user data")
	// Public function for getapi
	public void get_API_Url() {
		requestMap.put("URL", "https://reqres.in/api/users");
	}
	
	//Keyword 'Then' for the assertion and matcher conditions
	@Then("Construct the {string} request body with the following data")
		// public function for input body request email and password
	    public void constructTheRequestBodyForWithTheFollowingData(String requestName, DataTable datatable) {
	        requestMap.put("RequestName", requestName);
	        Map<String, String> inputMap = datatable.asMap(String.class, String.class);
	        requestMap.putAll(inputMap);
	 }

}
