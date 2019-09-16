package SalesforceFlashingStepDef;


import org.openqa.selenium.Keys;

import SalesforceFlashingPages.MarketingPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.TestBase;

public class MarketingPageStepDef extends TestBase{


	@Given("User input valid Email addrees")
	public void user_input_valid_Email_addrees() {
		MarketingPage.Email.sendKeys("mababaikeli@afba.com");
}

	@When("User input valid SSN number")
	public void user_iput_valid_SSN_number() {
		MarketingPage.SSN.sendKeys("180583504");
}

	@Then("User input valid lastName")
	public void user_input_valid_lastName() {
		MarketingPage.LastName.sendKeys("MEEKER");
   
}

	@Then("User input valid DOB")
	public void user_input_valid_DOB() {
		MarketingPage.DOB.click();
		MarketingPage.DOB.sendKeys("01311968");
}
	
	@Then("User click the Next button")
	public void user_click_the_Next_button() {
	   MarketingPage.NextBtn.click();
	}
	
	@Then("User can able to select State, district options")
	public void user_can_able_to_select_State_district_options() {
	  MarketingPage.StateOption.click();
	  MarketingPage.StateOption.sendKeys("VERMONT");
	  MarketingPage.StateOption.sendKeys(Keys.ARROW_DOWN);
	  MarketingPage.StateOption.sendKeys(Keys.ENTER);
	}

	@Then("User click Marketing option to make sure Markiting Opt in or Opt out")
	public void user_click_Marketing_option_to_make_sure_Markiting_Opt_in_or_Opt_out() {
	   MarketingPage.MarketingOption.click(); 
	}

	@Then("User click Captcha button to varify I am not robot")
	public void user_click_Captcha_button_to_varify_I_am_not_robot() {
		MarketingPage.varifyCaptcha.getText();
	}

	@Then("click Submit btton to send appilication")
	public void click_Submit_btton_to_send_appilication() {
	    
	}

	@Then("User receive an Email")
	public void user_receive_an_Email() {
	   
	}

	@Then("User can able to change Markiting Opt in or Opt Out section on SalesForce page.")
	public void user_can_able_to_change_Markiting_Opt_in_or_Opt_Out_section_on_SalesForce_page() {
	    
	}

	
}
