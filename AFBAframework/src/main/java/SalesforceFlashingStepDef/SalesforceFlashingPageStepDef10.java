package SalesforceFlashingStepDef;

import SalesforceFlashingPages.SalesforceFlashingPage10;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.TestBase;

public class SalesforceFlashingPageStepDef10 extends TestBase {

	@Given("Contact page to Select the tenth client")
	public void contact_page_to_Select_the_tenth_client() {
		SalesforceFlashingPage10.TheTenthClient.click();
	}

	@When("Open the Account details and select Policy Account option")
	public void open_the_Account_details_and_select_Policy_Account_option() {
		SalesforceFlashingPage10.PolicyAccount.click();
	}

	@Then("Open the next page to Edit Affiliation Code part")
	public void open_the_next_page_to_Edit_Affiliation_Code_part() {
		act.doubleClick(SalesforceFlashingPage10.AffiliationCode).perform();  
	}

	@Then("Scroll down and able to Select the Client IDs")
	public void scroll_down_and_able_to_Select_the_Client_IDs() {
		SalesforceFlashingPage10.SearchSpace.click();
		SalesforceFlashingPage10.MASWY.click();
	}

	@Then("Click the Save button to save all the options and can able to check New Flashes on pages")
	public void click_the_Save_button_to_save_all_the_options_and_can_able_to_check_New_Flashes_on_pages() {
		SalesforceFlashingPage10.SaveBtn.click();
		 act.pause(3000).perform();
	}

}
