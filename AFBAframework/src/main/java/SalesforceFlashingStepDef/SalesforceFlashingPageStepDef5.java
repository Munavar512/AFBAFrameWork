package SalesforceFlashingStepDef;

import SalesforceFlashingPages.SalesforceFlashingPage5;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.TestBase;

public class SalesforceFlashingPageStepDef5 extends TestBase{

	@Given("Select fifth client")
	public void select_fifth_client() {
	   SalesforceFlashingPage5.FifthClient.click();
	}

	@When("Open Account details select Policy Account option part")
	public void open_Account_details_select_Policy_Account_option_part() {
	    SalesforceFlashingPage5.PolicyAccount.click();
	}

	@Then("Open the new page to Edit Affiliation Code option")
	public void open_the_new_page_to_Edit_Affiliation_Code_option() {
		act.doubleClick(SalesforceFlashingPage5.AffiliationCode).perform();  
	}

	@Then("Able to scroll down and Select the Client ID")
	public void able_to_scroll_down_and_Select_the_Client_ID() {
	    SalesforceFlashingPage5.SearchSpacePart.click();
	    SalesforceFlashingPage5.MASNH.click();
	}

	@Then("Click Save button to save and can able to see New Flashes on pages")
	public void click_Save_button_to_save_and_can_able_to_see_New_Flashes_on_pages() {
	    SalesforceFlashingPage5.SaveBttn.click();
	    act.pause(2000).perform();
	}
}
