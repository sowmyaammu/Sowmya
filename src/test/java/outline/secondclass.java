package outline;


import java.util.List;
import java.util.Map;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class secondclass {
	@Given("User in home page")
	public void user_in_home_page() {
	   System.out.println("homepage");
	}

	@When("user enters credentials")
	public void user_enters_credentials(io.cucumber.datatable.DataTable dt) {
		List<Map<String,String>> list= dt.asMaps();
	    System.out.println(list.get(0).get("username"));
	    System.out.println(list.get(0).get("password"));
	    System.out.println(list.get(1).get("username"));
	    System.out.println(list.get(1).get("password"));
	    System.out.println(list.get(2).get("username"));
	    System.out.println(list.get(2).get("password"));
	}

	@And("click on login button")
	public void click_on_login_button() {
	System.out.println("Login");    
	}

	@Then("homepage is displayed")
	public void homepage_is_displayed() {
	    System.out.println("homepsge displayed");
	}

}
