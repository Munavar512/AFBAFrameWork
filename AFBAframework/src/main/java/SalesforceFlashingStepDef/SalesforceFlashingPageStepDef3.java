package SalesforceFlashingStepDef;


import SalesforceFlashingPages.SalesforceFlashingPage3;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.TestBase;

public class SalesforceFlashingPageStepDef3 extends TestBase {

	@Given("Can able to select third client")
	public void can_able_to_select_third_client() {
	   SalesforceFlashingPage3.ThirdClient.click();
	}
	

	@When("Open Account detail to select Policy Account option part")
	public void open_Account_detail_to_select_Policy_Account_option_part() {
		SalesforceFlashingPage3.PolicyAccountAction.click();

	}

	@Then("Open the other page to Edit Affiliation Code")
	public void open_the_other_page_to_Edit_Affiliation_Code() {
		act.doubleClick(SalesforceFlashingPage3.AffiliationCodeOption).perform();  
	}

	@Then("scroll down to Select Client ID")
	public void scroll_down_to_Select_Client_ID() {
		SalesforceFlashingPage3.SearchSpace.click();
	    SalesforceFlashingPage3.MASMA.click();
	}

	@Then("click the Save button to save it and can able to see New Flashes on page")
	public void click_the_Save_button_to_save_it_and_can_able_to_see_New_Flashes_on_page() {
	  SalesforceFlashingPage3.SaveBtn.click();
	  act.pause(3000).perform();
	}   
	}
	
	


