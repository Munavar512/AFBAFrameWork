package eAppStepDef;

import org.openqa.selenium.Keys;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import eApp.eAppApplication;
import utilities.TestBase;

public class eAppApplicationStepDef extends TestBase {
	
	@When("HomePage to click Manage cases button")
	public void homepage_to_click_Manage_cases_button() {
		eAppApplication.ManageCaseBtn.click();
	}

	@Then("Input search AFBA case")
	public void input_search_AFBA_case() {
		eAppApplication.searchAFBA.sendKeys("AFBA" + Keys.ENTER);
	}

	@Then("click the case")
	public void click_the_case() {
	    eAppApplication.AFBACase.click();
	}

	
}
