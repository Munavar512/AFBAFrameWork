package SalesforceFlashingStepDef;


import SalesforceFlashingPages.SalesforceFlashingPage1;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.TestBase;

public class SalesforceFlashingPageStepDef1 extends TestBase {

	@Given("click client fullName to open contact detail")
	public void click_client_fullName_to_open_contact_detail() {
		SalesforceFlashingPage1.FirstContact.click();
	}

	@When("scroll down to find Portfolio to click Policy Account")
	public void scroll_down_to_find_Portfolio_to_click_Policy_Account() {
	
		SalesforceFlashingPage1.PolicyAccountClick.click();
	}

	@Then("Open new page to Edit Affiliation Code")
	public void open_new_page_to_Edit_Affiliation_Code() {
		//for double click
		act.doubleClick(SalesforceFlashingPage1.AffiliationCode).perform();
	   	
	}
	
	@Then("search IDs Select options")
	public void search_IDs_Select_options() {
	    SalesforceFlashingPage1.SelectOption.click();
	}
	
	@Then("scroll down to Select Client IDs")
	public void scroll_down_to_Select_Client_IDs() {
	   SalesforceFlashingPage1.MASCTselect.click();
	}

	@Then("click the save button to save it")
	public void click_the_save_button_to_save_it() {
	    SalesforceFlashingPage1.SaveBtn.click();
	    act.pause(3000).perform();
	}
	
	

	
}
