package stepdefination;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;

public class HomePageStepDef {

	
	@When("User verify Home page")
	public void user_verify_Home_page() {
	  HomePage.HomeBtn.click();
	  
	}

	@Then("User click Manage cases button")
	public void user_click_Manage_cases_button() {
	   HomePage.ManageCaseBtn.click();
	   HomePage.HomeBtn.click();
	}

	@Then("User click Manage agent Or Users button")
	public void user_click_Manage_agent_Or_Users_button() {
	   HomePage.ManageAgentsOrUsersBtn.click();
	   HomePage.HomeBtn.click();
	}

	@Then("User click Mange products button")
	public void user_click_Mange_products_button() {
		HomePage.ManageProductBtn.click();
		HomePage.HomeBtn.click();
	}

	@Then("User click View Tranmittals button")
	public void user_click_View_Tranmittals_button() {
		HomePage.ViewTransmittalsBtn.click();
		HomePage.HomeBtn.click();
	}
}
