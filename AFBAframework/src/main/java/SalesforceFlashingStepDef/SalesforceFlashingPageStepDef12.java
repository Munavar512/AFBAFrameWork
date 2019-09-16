package SalesforceFlashingStepDef;

import SalesforceFlashingPages.SalesforceFlashingPage12;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.TestBase;

public class SalesforceFlashingPageStepDef12 extends TestBase {

	@Given("Contact page to Select the twelfth client")
	public void contact_page_to_Select_the_twelfth_client() {
		SalesforceFlashingPage12.TheTwelfthClient.click();
	}

	@When("Open the Account details to select Portfolio Policy Account")
	public void open_the_Account_details_to_select_Portfolio_Policy_Account() {
		SalesforceFlashingPage12.PolicyAccount.click();
	}

	@Then("Open the next page to edit Affiliation Code part")
	public void open_the_next_page_to_edit_Affiliation_Code_part() {
		act.doubleClick(SalesforceFlashingPage12.AffiliationCode).perform(); 
	}

	@Then("Scroll down to Select the Client ID options")
	public void scroll_down_to_Select_the_Client_ID_options() {
		SalesforceFlashingPage12.SearchSpace.click();
		SalesforceFlashingPage12.TSA.click();
	}

	@Then("Click the Save button to save all and able to check New Flashes on pages")
	public void click_the_Save_button_to_save_all_and_able_to_check_New_Flashes_on_pages() {
		SalesforceFlashingPage12.SaveBtn.click();
		act.pause(3000).perform();
		
	}
}
