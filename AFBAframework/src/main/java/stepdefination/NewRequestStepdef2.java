package stepdefination;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.NewRequest2;
import utilities.TestBase;

public class NewRequestStepdef2 extends TestBase {

	
	@When("Click the New request button")
	public void click_the_New_request_button() {
	    NewRequest2.NewRequestBtn2.click();
	}

	@Then("Go throgh all the Steps Instructions to click Next button")
	public void go_throgh_all_the_Steps_Instructions_to_click_Next_button() {
		act.pause(2000).perform();
	   NewRequest2.NextBtn.click();
	}

	@Then("Step two Select Accounts select policy Numbers")
	public void step_two_Select_Accounts_select_policy_Numbers() {
	   NewRequest2.RadioBtn2.click();
	   NewRequest2.RadioButton3.click();
	}

	@Then("Able to click the Next button")
	public void able_to_click_the_Next_button() {
	    NewRequest2.NextBtn2.click();
	}

	@Then("On Primary Beneficiaries to click Add Primary button")
	public void on_Primary_Beneficiaries_to_click_Add_Primary_button() {
	    NewRequest2.AddPrimaryBtn.click();
	}

	@Then("Select the Relastionship on Insured")
	public void select_the_Relastionship_on_Insured() {
		act.pause(2000).perform();
		act.doubleClick(NewRequest2.RelationShipClick).perform();
	    NewRequest2.RelationshipToInsured.click();
	}

	@Then("Input name of Trust")
	public void input_name_of_Trust() {
	   NewRequest2.NameOfTrust.sendKeys("MARY JANE");
	}

	@Then("Input Trustee named in Trust")
	public void input_Trustee_named_in_Trust() {
		NewRequest2.TrustteeNameInTrust.click();
	    NewRequest2.TrustteeNameInTrust.sendKeys("MARY JANE GRAHAM");
	}

	@Then("Input valid Percentage number")
	public void input_valid_Percentage_number() {
	   NewRequest2.Percentage2.sendKeys("50");  
	   NewRequest2.Percentage2.click();
	   act.pause(2000).perform();
	}

	@Then("input valid Date of Trust")
	public void input_valid_Date_of_Trust() {
    	NewRequest2.DateOfTrust.click();
	   NewRequest2.DateOfTrust.sendKeys("12231954");
	}
	
	@Then("Click ADD button to add it")
	public void click_ADD_button_to_add_it() {
		act.pause(2000).perform();
		NewRequest2.AddClick.click();
		act.pause(2000).perform();
	    NewRequest2.ADDbutton.click();
	   
	}
	
	@Then("Click Add Primary button to Add one more Primary")
	public void click_Add_Primary_button_to_Add_one_more_Primary() {
		 act.pause(2000).perform();
	    NewRequest2.AddPrimaryBtn.click();
	   
	}

	@Then("Select Relationship to Insured")
	public void select_Relationship_to_Insured() {
		act.pause(2000).perform();
		act.doubleClick(NewRequest2.RelationShipClick).perform();
		act.pause(2000).perform();
	    NewRequest2.RelationShipOption.click();
	    
	}

	@Then("Input valid Estate of Name")
	public void input_valid_Estate_of_Name() {
	   NewRequest2.EstateName.sendKeys("NANCY GRAHMAN");
	}

	@Then("input valid Percentage numbers")
	public void input_valid_Percentage_numbers() {
		NewRequest2.Percentage2.click();
	   NewRequest2.Percentage2.sendKeys("50");
	}

	@Then("Click Add button to add second Primary Beneficiaries")
	public void click_Add_button_to_add_second_Primary_Beneficiaries() {
	    act.pause(2000).perform();
	    NewRequest2.AddClick.click();
	    act.pause(2000).perform();
	    NewRequest2.ADDbutton.click();
	}

	@Then("Click Next button to next page")
	public void click_Next_button_to_next_page() {
		 act.pause(2000).perform();
	    NewRequest2.NextBtn23.click();
	}
	
	@Then("Add Contingent Beneficiaries")
	public void add_Contingent_Beneficiaries() {
		act.pause(3000).perform();
	    NewRequest2.AddContingentBtn.click();
	}

	@Then("Select Relationship Insured for Contingent Beneficiary")
	public void select_Relationship_Insured_for_Contingent_Beneficiary() {
		act.pause(2000).perform();
	   NewRequest2.RelationShipClick.click();
	   act.pause(2000).perform();
	   NewRequest2.RelationshipOption2.click();
	}

	@Then("Select Gender for Contingent beneficiary")
	public void select_Gender_for_Contingent_beneficiary() {
		act.pause(2000).perform();
		NewRequest2.GenderOption.click();
	}

	@Then("Input valid Contingent beneficiary FirstName")
	public void input_valid_Contingent_beneficiary_FirstName() {
		NewRequest2.FirstName.click();
	   NewRequest2.FirstName.sendKeys("MARY JANE");
	   act.pause(2000).perform();
	   
	}

	@Then("Input valid Contingent beneficiary LastName")
	public void input_valid_Contingent_beneficiary_LastName() {
	    NewRequest2.LastName.click();
	    NewRequest2.LastName.sendKeys("MARY JANE GRAHAM");
	    act.pause(2000).perform();
	}

	@Then("Input valid Contingent beneficiary SSN")
	public void input_valid_Contingent_beneficiary_SSN() {
	    NewRequest2.SSN.click();
	    NewRequest2.SSN.sendKeys("kiohdjk123");
	    act.pause(3000).perform();
	    NewRequest2.SSN.click();
	    act.pause(2000).perform();
	    NewRequest2.SSN.clear();
	    NewRequest2.SSN.sendKeys("123678932");
	}

	@Then("Input Contingent beneficiary DOB")
	public void input_Contingent_beneficiary_DOB() {
	    NewRequest2.DOB.click();
	    NewRequest2.DOB.sendKeys("11111111111");
	    act.pause(3000).perform();
	    NewRequest2.DOB.click();
	    NewRequest2.DOB.clear();
	    NewRequest2.DOB.sendKeys("05111992");
	    act.pause(2000).perform();
	}

	@Then("Input valid Address")
	public void input_valid_Address() {
		NewRequest2.Percentage.click();
		NewRequest2.Percentage.sendKeys("50");
	    act.pause(2000).perform();
	    NewRequest2.Address.sendKeys("8nd St S");
	    NewRequest2.City.click();
	    NewRequest2.City.sendKeys("Arlington");
	    NewRequest2.State.sendKeys("VA");
	    act.pause(2000).perform();
	}

	@Then("Input Zip Code numbers")
	public void input_Zip_Code_numbers() {
	  NewRequest2.ZipCode.click();
	  NewRequest2.ZipCode.sendKeys("22209");
	}

	@Then("Click ADD button to add Contingent beneficiary")
	public void click_ADD_button_to_add_Contingent_beneficiary() {
		 act.pause(2000).perform();
		    NewRequest2.AddClick.click();
		    act.pause(2000).perform();
		    NewRequest2.ADDbutton.click();
	}
	
	@Then("Click Next button but cannot move to next Page")
	public void click_Next_button_but_cannot_move_to_next_Page() {
		  act.pause(2000).perform();
		    NewRequest2.NextBtn24.click();
	}

	@Then("Click Delete button to delete Contingent beneficiary")
	public void click_Delete_button_to_delete_Contingent_beneficiary() {
		  act.pause(4000).perform();
		    NewRequest2.DeleteBtn.click();
	}

	@Then("Click Next button to move next page")
	public void click_Next_button_to_move_next_page() {
		   act.pause(2000).perform();
		    NewRequest2.NextBtn24.click();
	}


	@Then("Click checking box to make sure beneficiary designation")
	public void click_checking_box_to_make_sure_beneficiary_designation() {
	    NewRequest2.CheckingBox2.click();
	}

	@Then("Select Preview button to review all the informations")
	public void select_Preview_button_to_review_all_the_informations() {
	    NewRequest2.ReviewBtn2.click();
	}

	@Then("Click X button to close review page")
	public void click_X_button_to_close_review_page() {
		act.pause(4000).perform();
	    NewRequest2.Xbtn2.click();
	}

	@Then("Select Sumit button to submit it")
	public void select_Sumit_button_to_submit_it() {
		act.pause(2000).perform();
	    NewRequest2.SubmitBtn2.click();
	    act.pause(4000).perform();
	}

	@Then("Click OK button to suceesfuly submitted")
	public void click_OK_button_to_suceesfuly_submitted() {
	    NewRequest2.OkBtn2.click();
	    act.pause(2000).perform();
	}


}
