package stepdefination;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.NewRequest3;
import utilities.TestBase;

public class NewRequestStepdef3 extends TestBase {

	@When("Click New request button to add new request")
	public void click_New_request_button_to_add_new_request() {
		NewRequest3.NewRequestBtn3.click();
	}

	@Then("After Go throgh all the Steps Instructions click Next button")
	public void after_Go_throgh_all_the_Steps_Instructions_click_Next_button() {
	    NewRequest3.NextBtn.click();
	}
	
	@Then("Select policy Numbers")
	public void select_policy_Numbers() {
	    NewRequest3.RadioBtn3.click();
	    act.pause(1000).perform();
	    NewRequest3.RadioBtn4.click();
	    act.pause(1000).perform();
	    NewRequest3.RadioBtn5.click();
	}
	
	@Then("Click the Next button to go next page")
	public void click_the_Next_button_to_go_next_page() {
	    NewRequest3.NextBtn3.click();
	}


	@Then("Primary Beneficiaries page to click Add Primary")
	public void primary_Beneficiaries_page_to_click_Add_Primary() {
	   NewRequest3.AddPrimaryBtn3.click();
	}
	
	@Then("Select the Relastionship for Insured person")
	public void select_the_Relastionship_for_Insured_person() {
		act.pause(2000).perform();
	    NewRequest3.RelationShipClick3.click();
	    act.pause(2000).perform();
	    NewRequest3.RelationshipToInsured.click();
	}

	@Then("Input name of Will required field")
	public void input_name_of_Will_required_field() {
		NewRequest3.NameOfWill.click();
	   NewRequest3.NameOfWill.sendKeys("Barton Winslow");
	}

	@Then("Input Valid Percentage Numbers")
	public void input_Valid_Percentage_Numbers() {
		NewRequest3.Percentage3.click();
		NewRequest3.Percentage3.sendKeys("20");
	}

	@Then("Input Valid Date Of Will")
	public void input_Valid_Date_Of_Will() {
		 NewRequest3.DateOfWill.click();
	    NewRequest3.DateOfWill.sendKeys("01171964");
	}

	@Then("Click ADD button to add Primary beneficiary")
	public void click_ADD_button_to_add_Primary_beneficiary() {
		act.pause(2000).perform();
	    NewRequest3.AddClick3.click();
	    act.pause(2000).perform();
	    NewRequest3.ADDbutton3.click();
	}
	
	@Then("Click Add Primary button to add more Primary Beneficiaries")
	public void click_Add_Primary_button_to_add_more_Primary_Beneficiaries() {
		act.pause(2000).perform();
	    NewRequest3.AddPrimary3.click(); 
	}

	@Then("Select Relationship for Insured beneficiary members")
	public void select_Relationship_for_Insured_beneficiary_members() {
		act.pause(2000).perform();
		 NewRequest3.RelationShipClick3.click();
		 act.pause(4000).perform();
		   NewRequest3.RelationshipOption.click();
	}

	@Then("Select Gender for beneficiary")
	public void select_Gender_for_beneficiary() {
		act.pause(2000).perform();
	    NewRequest3.GenderClick.click();
	    NewRequest3.GenderOption.click();
	}

	@Then("Input valid beneficiary FirstName")
	public void input_valid_beneficiary_FirstName() {
		act.pause(2000).perform();
	   NewRequest3.FirstName.sendKeys("MYERS");
	}

	@Then("Input valid beneficiary LastName")
	public void input_valid_beneficiary_LastName() {
	    NewRequest3.LastName.sendKeys("CRYSTAL");
	}

	@Then("Input Valid beneficiary Middle Name")
	public void input_Valid_beneficiary_Middle_Name() {
	    NewRequest3.MiddleName.sendKeys("M");
	}

	@Then("Input valid beneficiary SSN")
	public void input_valid_beneficiary_SSN() {
	  NewRequest3.SSN.click();
	  NewRequest3.SSN.sendKeys("122343212");
	}

	@Then("Input beneficiary DOB")
	public void input_beneficiary_DOB() {
	    act.pause(2000).perform();
	    NewRequest3.DOB.click();
	    NewRequest3.DOB.sendKeys("05181961");
	}

	@Then("Input valid Address Line")
	public void input_valid_Address_Line() {
	  NewRequest3.Percentage.click();
	  NewRequest3.Percentage.sendKeys("20");
	  
	  NewRequest3.Address.click();
	  act.pause(2000).perform();
	  NewRequest3.Address.sendKeys("313 Grove Avenue");
	}

	@Then("Input City")
	public void input_City() {
	    NewRequest3.City.sendKeys("Falls Church");
	    act.pause(2000).perform();
	}

	@Then("Input State")
	public void input_State() {
		NewRequest3.State.click();
	   NewRequest3.State.sendKeys("VA");
	}

	@Then("Input Zip Code")
	public void input_Zip_Code() {
		NewRequest3.ZipCode.click();
	  NewRequest3.ZipCode.sendKeys("22046");
	}

	@Then("Click ADD button to add second beneficiary")
	public void click_ADD_button_to_add_second_beneficiary() {
		act.pause(2000).perform();
	    NewRequest3.AddClick3.click();
	    act.pause(2000).perform();
	    NewRequest3.ADDbutton3.click();
	}
	

	
	@Then("Click Add Primary button")
	public void click_Add_Primary_button() {
		 act.pause(2000).perform();
	    NewRequest3.AddPrimary3.click();
	}

	
	@Then("Select Relationship for Insured")
	public void select_Relationship_for_Insured() {
		act.pause(2000).perform();
		act.doubleClick(NewRequest3.RelationShipClick3).perform();
		act.pause(2000).perform();
	    NewRequest3.RelationShipOption.click();
	}

	@Then("Input Estate of Name")
	public void input_Estate_of_Name() {
	   NewRequest3.EstateName.sendKeys("NANCY GRAHMAN");
	}

	@Then("input Percentage numbers")
	public void input_Percentage_numbers() {
		NewRequest3.Percentage.click();
	   NewRequest3.Percentage.sendKeys("20");
	}

	@Then("Click Add button to add Primary Beneficiaries")
	public void click_Add_button_to_add_Primary_Beneficiaries() {
	    act.pause(2000).perform();
	    NewRequest3.AddClick3.click();
	    act.pause(2000).perform();
	    NewRequest3.ADDbutton3.click();
	}

	
	@Then("Click Primary Beneficiary button to add more beneficiary")
	public void click_Primary_Beneficiary_button_to_add_more_beneficiary() {
		 act.pause(3000).perform();
	    NewRequest3.AddPrimaryButton.click();
	}

	@Then("Select Relationship Insured options")
	public void select_Relationship_Insured_options() {
		act.pause(2000).perform();
		act.doubleClick(NewRequest3.RelationShipClick3).perform();
	    NewRequest3.Relationship3.click();
	}

	@Then("Input Name of Trust")
	public void input_Name_of_Trust() {
	   NewRequest3.NameOfTrust.sendKeys("MARY JANE");
	}

	@Then("Input Trustees named in Trust")
	public void input_Trustees_named_in_Trust() {
		NewRequest3.TrustteeNameInTrust.click();
	    NewRequest3.TrustteeNameInTrust.sendKeys("MARY JANE GRAHAM");
	}

	@Then("Input Percentage")
	public void input_Percentage() {
		   NewRequest3.Percentage.click();
	   NewRequest3.Percentage.sendKeys("20");  
	   act.pause(2000).perform();
	}

	@Then("Input Date Of Trust option")
	public void input_Date_Of_Trust_option() {
		 NewRequest3.DateOfTrust.click();
	   NewRequest3.DateOfTrust.sendKeys("12231954");
	}
	
	@Then("Click Add button to add this Primary beneficiary")
	public void click_Add_button_to_add_this_Primary_beneficiary() {
		act.pause(2000).perform();
		NewRequest3.AddClick3.click();
		act.pause(2000).perform();
		NewRequest3.ADDbutton3.click();
	   
	}
	
	@Then("Click Add Primary button to add one more Beneficiary")
	public void click_Add_Primary_button_to_add_one_more_Beneficiary() {
		 act.pause(3000).perform();
		    NewRequest3.AddPrimaryButton.click();
	}

	@Then("Select Relationship Insured option")
	public void select_Relationship_Insured_option() {
		act.pause(2000).perform();
		act.doubleClick(NewRequest3.RelationShipClick3).perform();
		act.pause(2000).perform();
	    NewRequest3.Relationship4.click();
	}

	@Then("Input Gender option")
	public void input_Gender_option() {
		act.pause(2000).perform();
	    NewRequest3.GenderClick.click();
	    NewRequest3.Gender.click();
	}

	@Then("Input beneficiary first name")
	public void input_beneficiary_first_name() {
	   NewRequest3.FirstName.sendKeys("DAVID");
	}

	@Then("Input beneficiary last name")
	public void input_beneficiary_last_name() {
	   NewRequest3.LastName.sendKeys("RIDDLE");
	}

	@Then("Input middle name")
	public void input_middle_name() {
	  NewRequest3.MiddleName.sendKeys("K");
	}

	@Then("Input SSN numbers")
	public void input_SSN_numbers() {
	   NewRequest3.SSN.click();
	   NewRequest3.SSN.sendKeys("222222229");
	}

	@Then("Input date of birth")
	public void input_date_of_birth() {
	  NewRequest3.DOB.click();
	  NewRequest3.DOB.sendKeys("10231983");
	}

	@Then("Input perventage numbers for beneficiary")
	public void input_perventage_numbers_for_beneficiary() {
	    NewRequest3.Percentage.click();
	    NewRequest3.Percentage.sendKeys("20");
	}

	@Then("Input beneficiary address line")
	public void input_beneficiary_address_line() {
	    NewRequest3.Address.sendKeys("5nd St");
	}

	@Then("Input city name")
	public void input_city_name() {
		NewRequest3.City.sendKeys("Fairfax");
	}

	@Then("Input state name")
	public void input_state_name() {
	  NewRequest3.State.sendKeys("VA");
	}

	@Then("Input zip code numbers")
	public void input_zip_code_numbers() {
	   NewRequest3.ZipCode.sendKeys("111221");
	}

	@Then("Click Add button to add beneficiary")
	public void click_Add_button_to_add_beneficiary() {
		act.pause(2000).perform();
		NewRequest3.AddClick3.click();
		act.pause(2000).perform();
		NewRequest3.ADDbutton3.click();
	}
	
	@Then("click Add Primary Beneficiary to add sixth beneficiary")
	public void click_Add_Primary_Beneficiary_to_add_sixth_beneficiary() {
		act.pause(3000).perform();
	    NewRequest3.AddPrimaryButton.click();
	}

	@Then("Can not able to add it click Cancel button")
	public void can_not_able_to_add_it_click_Cancel_button() {
		act.pause(3000).perform();
	    NewRequest3.CancelBtn.click();
	}

	
	@Then("Click the Next button to next page")
	public void click_the_Next_button_to_next_page() {
		act.pause(2000).perform();
	   NewRequest3.NextBtn4.click();
	}

	@Then("Click Next button to skip Contingent Beneficiaries page")
	public void click_Next_button_to_skip_Contingent_Beneficiaries_page() {
	    NewRequest3.NextButton.click();
	    act.pause(2000).perform();
	}

	@Then("Click the checking box to make sure beneficiary designation")
	public void click_the_checking_box_to_make_sure_beneficiary_designation() {
	    NewRequest3.CheckingBox.click();
	}

	@Then("Select the Preview button to review all the informations")
	public void select_the_Preview_button_to_review_all_the_informations() {
	    NewRequest3.ReviewBtn.click();
	    act.pause(5000).perform();
	}

	@Then("Click the X button to close review page")
	public void click_the_X_button_to_close_review_page() {
	    NewRequest3.Xbtn.click();
	    act.pause(2000).perform();
	}

	@Then("Select the Sumit button to submit it")
	public void select_the_Sumit_button_to_submit_it() {
	    NewRequest3.SubmitBtn.click();
	    act.pause(4000).perform();
	}

	@Then("Click OK button to suceesfuly submitted request")
	public void click_OK_button_to_suceesfuly_submitted_request() {
	   NewRequest3.OkBtn.click();
	   act.pause(3000).perform();
	}


}
