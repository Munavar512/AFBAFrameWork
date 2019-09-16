package SalesforceFlashingStepDef;

import SalesforceFlashingPages.SalesforceFlashingPage8;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.TestBase;

public class SalesforceFlashingPageStepDef8 extends TestBase {

	@Given("Contact page to Select eightieth client")
	public void contact_page_to_Select_eightieth_client() {
	   SalesforceFlashingPage8.EightiethClient.click(); 
	}

	@When("Open the Account details and able to select Policy Account option part")
	public void open_the_Account_details_and_able_to_select_Policy_Account_option_part() {
		SalesforceFlashingPage8.PolicyAccount.click();
	}

	@Then("Open the page to Edit Affiliation Code part")
	public void open_the_page_to_Edit_Affiliation_Code_part() {
		act.doubleClick(SalesforceFlashingPage8.AffiliationCode).perform();  
	}

	@Then("Scroll down and Select the Client ID Part")
	public void scroll_down_and_Select_the_Client_ID_Part() {
		SalesforceFlashingPage8.SearchSpace.click();
		SalesforceFlashingPage8.MASRI.click();
	}

	@Then("Click and Save button to save all the options and can able to see New Flashes on pages")
	public void click_and_Save_button_to_save_all_the_options_and_can_able_to_see_New_Flashes_on_pages() {
		SalesforceFlashingPage8.SaveBtn.click();
		 act.pause(3000).perform();
	}
}
