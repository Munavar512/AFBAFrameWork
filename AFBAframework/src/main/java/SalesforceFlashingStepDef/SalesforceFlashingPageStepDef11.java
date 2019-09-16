package SalesforceFlashingStepDef;

import SalesforceFlashingPages.SalesforceFlashingPage11;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.TestBase;

public class SalesforceFlashingPageStepDef11 extends TestBase {

	@Given("Contact page to Select the eleventh client")
	public void contact_page_to_Select_the_eleventh_client() {
		SalesforceFlashingPage11.TheEleventhClient.click();
	}

	@When("Open the Account details and select Portfplio Policy Account")
	public void open_the_Account_details_and_select_Portfplio_Policy_Account() {
		SalesforceFlashingPage11.PolicyAccount.click();
	}

	@Then("Open the next page and edit Affiliation Code")
	public void open_the_next_page_and_edit_Affiliation_Code() {
		act.doubleClick(SalesforceFlashingPage11.AffiliationCode).perform(); 
	}

	@Then("Scroll down and Select the Client IDs option")
	public void scroll_down_and_Select_the_Client_IDs_option() {
		SalesforceFlashingPage11.SearchSpace.click();
		SalesforceFlashingPage11.NGAMS.click();
	}

	@Then("Click the Save button to save all and can able to check New Flashes on pages")
	public void click_the_Save_button_to_save_all_and_can_able_to_check_New_Flashes_on_pages() {
		SalesforceFlashingPage11.SaveBtn.click();
		act.pause(3000).perform();
	}
	
}
