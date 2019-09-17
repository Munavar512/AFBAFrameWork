package stepdefination;

import org.openqa.selenium.Keys;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.eAppApplication;
import utilities.TestBase;

public class eAppApplicationStepDef extends TestBase {
	

	@When("HomePage to click Manage cases button")
	public void homepage_to_click_Manage_cases_button() {
		eAppApplication.ManageCaseBtn.click();
		
	}

	@Then("Enrollment Cases to search AFBA case")
	public void enrollment_Cases_to_search_AFBA_case() {
		eAppApplication.searchAFBA.click();
		eAppApplication.searchAFBA.sendKeys("AFBA" + Keys.ENTER);
	}

	@Then("click the case")
	public void click_the_case() {
		eAppApplication.AFBACase.click();
	}

	@Then("Create New Enrollment")
	public void create_New_Enrollment() {
		act.pause(3000).perform();
		eAppApplication.CreateNewEnrollement.click();
	}

	@Then("Input Sponsor SSN number and click Next button")
	public void input_Sponsor_SSN_number_and_click_Next_button() {
		eAppApplication.SSNnumber.click();
		eAppApplication.SSNnumber.sendKeys("111112233");
    	act.pause(2000).perform();
    	eAppApplication.ClickNextBtn.click();
    	eAppApplication.ClickBiginEnrollement.click();
	}

	@Then("Input Sponsor firstName, lastName, dateOfBirth")
	public void input_Sponsor_firstName_lastName_dateOfBirth() {
	    
	}

	@Then("Select Eligibility options, Branch of Servive, Duty Status, Rank and Contribution Mode")
	public void select_Eligibility_options_Branch_of_Servive_Duty_Status_Rank_and_Contribution_Mode() {
	   
	}

	@Then("Input Department Code and Source Code")
	public void input_Department_Code_and_Source_Code() {
	   
	}

	@Then("Input Street{int}, Street{int}, City, ST, Zip")
	public void input_Street_Street_City_ST_Zip(Integer int1, Integer int2) {
	    
	}

	@Then("Input Email Address")
	public void input_Email_Address() {
	    
	}

	@Then("Input Daytime phoe")
	public void input_Daytime_phoe() {
	   
	}

	@Then("Second phone")
	public void second_phone() {
	   
	}
}
