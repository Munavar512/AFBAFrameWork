package SalesforceFlashingStepDef;

import SalesforceFlashingPages.SalesforceFlashingPage6;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.TestBase;

public class SalesforceFlashingPageStepDef6 extends TestBase {

	@Given("Contact page to Select sixth client")
	public void contact_page_to_Select_sixth_client() {
	   SalesforceFlashingPage6.sixthClient.click();
	}

	@When("Open Account details and able to select Policy Account option")
	public void open_Account_details_and_able_to_select_Policy_Account_option() {
	    SalesforceFlashingPage6.PolicyAccount.click();
	}

	@Then("Open the page to Edit Affiliation Code option part")
	public void open_the_page_to_Edit_Affiliation_Code_option_part() {
		act.doubleClick(SalesforceFlashingPage6.AffiliationCode).perform();  
	}

	@Then("Scroll down and Select the Client ID option")
	public void scroll_down_and_Select_the_Client_ID_option() {
	    SalesforceFlashingPage6.SearchSpacePart.click();
	    SalesforceFlashingPage6.MASNY.click();
	}

	@Then("Click the Save button to save all the options and can able to see New Flashes on pages")
	public void click_the_Save_button_to_save_all_the_options_and_can_able_to_see_New_Flashes_on_pages() {
	    SalesforceFlashingPage6.SaveBttn.click();
	    act.pause(3000).perform();
	}
}
