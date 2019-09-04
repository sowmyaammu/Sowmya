package second;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class firstclass {
	@When("user enters user id as {string} in the user id field")
	public void i_enter_user_id_in_the_user_id_field(String x) {
		System.out.println("user id is "+x);
	    
	}

	@And("password as {int} in the password field")
	public void password_in_the_password_field(int y) {
	   System.out.println("password is "+y);
	}

	@And("i click on login")
	public void i_click_on_login() {
		System.out.println("login button clicked");
	}

	@Then("the homepage is displayed")
	public void the_homepage_is_displayed() {
		System.out.println("home page displayed");
	    
	}



}
