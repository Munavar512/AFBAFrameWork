package SalesforceFlashingStepDef;

import SalesforceFlashingPages.SalesforceFlashingPage7;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.TestBase;

public class SalesforceFlashingPageStepDef7 extends TestBase {

	@Given("Contact page to Select seventh client")
	public void contact_page_to_Select_seventh_client() {
	    SalesforceFlashingPage7.SeventhClient.click();
	}

	@When("Open Account details and able to select Policy Account option part")
	public void open_Account_details_and_able_to_select_Policy_Account_option_part() {
		SalesforceFlashingPage7.PolicyAccount.click();
	}

	@Then("Open the page to Edit Affiliation Code")
	public void open_the_page_to_Edit_Affiliation_Code() {
		act.doubleClick(SalesforceFlashingPage7.AffiliationCode).perform();  
	}

	@Then("Scroll down and Select the Client ID")
	public void scroll_down_and_Select_the_Client_ID() {
		SalesforceFlashingPage7.SearchSpace.click();
		SalesforceFlashingPage7.MASOK.click();
	}

	@Then("Click Save button to save all the options and can able to see New Flashes on pages")
	public void click_Save_button_to_save_all_the_options_and_can_able_to_see_New_Flashes_on_pages() {
		SalesforceFlashingPage7.SaveBtn.click();
		 act.pause(3000).perform();
	}

}
