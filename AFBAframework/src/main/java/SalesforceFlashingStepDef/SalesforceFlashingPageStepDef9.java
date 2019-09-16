package SalesforceFlashingStepDef;

import SalesforceFlashingPages.SalesforceFlashingPage9;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.TestBase;

public class SalesforceFlashingPageStepDef9 extends TestBase {

	@Given("Contact page to Select ninth client")
	public void contact_page_to_Select_ninth_client() {
		SalesforceFlashingPage9.NinthClient.click();
	}

	@When("Open Account details can able to select Policy Account option part")
	public void open_Account_details_can_able_to_select_Policy_Account_option_part() {
		SalesforceFlashingPage9.PolicyAccount.click();
	}

	@Then("Open the next page to Edit Affiliation Code")
	public void open_the_next_page_to_Edit_Affiliation_Code() {
		act.doubleClick(SalesforceFlashingPage9.AffiliationCode).perform();  
	}

	@Then("Scroll down and Select the Client IDs")
	public void scroll_down_and_Select_the_Client_IDs() {
		SalesforceFlashingPage9.SearchSpace.click();
		SalesforceFlashingPage9.MASVT.click();
	}

	@Then("Click the Save button to save all the options and able to check New Flashes on pages")
	public void click_the_Save_button_to_save_all_the_options_and_able_to_check_New_Flashes_on_pages() {
		SalesforceFlashingPage9.SaveBtn.click();
		act.pause(3000).perform();
		
	}
}
