package SalesforceFlashingStepDef;

import SalesforceFlashingPages.SalesforceFlashingPage4;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.TestBase;

public class SalesforceFlashingPageStepDef4 extends TestBase {

	@Given("select forth client")
	public void select_forth_client() {
	    SalesforceFlashingPage4.ForthClient.click();
	}

	@When("Open Account detail and select Policy Account option")
	public void open_Account_detail_and_select_Policy_Account_option() {
	    SalesforceFlashingPage4.PolicyAccountSelect.click();
	}

	@Then("Open the other page to Edit Affiliation Code part")
	public void open_the_other_page_to_Edit_Affiliation_Code_part() {
		act.doubleClick(SalesforceFlashingPage4.AffiliationCodepart).perform();  
	}

	@Then("scroll down to Select the Client ID")
	public void scroll_down_to_Select_the_Client_ID() {
	   SalesforceFlashingPage4.Search.click();
	   SalesforceFlashingPage4.MASMN.click();
	}

	@Then("click the Save button to save it and can able to see New Flashes on pages")
	public void click_the_Save_button_to_save_it_and_can_able_to_see_New_Flashes_on_pages() {
	   SalesforceFlashingPage4.SaveBttn.click();
	   act.pause(3000).perform();
	}

}
