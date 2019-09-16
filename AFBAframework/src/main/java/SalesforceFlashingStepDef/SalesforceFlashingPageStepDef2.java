package SalesforceFlashingStepDef;


import SalesforceFlashingPages.SalesforceFlashingPage1;
import SalesforceFlashingPages.SalesforceFlashingPage2;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.TestBase;

public class SalesforceFlashingPageStepDef2 extends TestBase {

	@Given("Can able to select second person")
	public void can_able_to_select_second_person() {
	   SalesforceFlashingPage2.secondClient.click();
	}

	@When("Open Account detail to select Policy Account option")
	public void open_Account_detail_to_select_Policy_Account_option() {
	    SalesforceFlashingPage2.PolictAccountClick2.click();
	}

	@Then("Open other page to Edit Affiliation Code")
	public void open_other_page_to_Edit_Affiliation_Code() {
		act.doubleClick(SalesforceFlashingPage2.AffiliationCodeBtn).perform();   
	}

	@And("scroll down to Select second Client ID")
	public void scroll_down_to_Select_second_Client_ID() {
	   SalesforceFlashingPage2.SearchSpace.click();
	   SalesforceFlashingPage2.MASIL.click();
	}
	
	@Then("click the Save button to save it and can able to see New Flashe on page")
	public void click_the_Save_button_to_save_it_and_can_able_to_see_New_Flashe_on_page() {
	   SalesforceFlashingPage1.SaveBtn.click();
	   act.pause(4000).perform();
	}
}
