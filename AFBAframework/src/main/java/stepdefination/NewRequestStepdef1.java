package stepdefination;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.NewRequest1;
import utilities.TestBase;

public class NewRequestStepdef1 extends TestBase {
	
	

	@When("Click New request button")
	public void click_New_request_button() {
		NewRequest1.NewRequestBtn.click();
	}

	@Then("Go throgh all the Steps on Instructions click Next button")
	public void go_throgh_all_the_Steps_on_Instructions_click_Next_button() {
		act.pause(2000).perform();
		NewRequest1.NextBtn.click();
	}

	@Then("On Step two select policy Numbers")
	public void on_Step_two_select_policy_Numbers() {
		NewRequest1.RadioBtn.click();
	}

	@Then("Able to click Next button")
	public void able_to_click_Next_button() {
		NewRequest1.NextBtn2.click();
	}

	@Then("On Primary Beneficiaries click Add Primary button")
	public void on_Primary_Beneficiaries_click_Add_Primary_button() {
		NewRequest1.AddPrimaryBtn.click();
	}
	
	@Then("Select Relastionship to Insured")
	public void select_Relastionship_to_Insured() {
		 act.pause(3000).perform();
		act.doubleClick(NewRequest1.RelationShipClick).perform();
		NewRequest1.RelationshipToInsured.click();
	}

	@Then("Select Gender")
	public void select_Gender() {
		 act.pause(2000).perform();
	    NewRequest1.GenderOption.click();
	}

	@Then("Input valid First Name")
	public void input_valid_First_Name() {
	   NewRequest1.FirstName.sendKeys("Muna");
	}

	@Then("Input valid Last Name")
	public void input_valid_Last_Name() {
	   NewRequest1.LastName.sendKeys("Bakeri");
	}

	@Then("Input Valid SSN")
	public void input_Valid_SSN() {
	    NewRequest1.SSN.click();
	    NewRequest1.SSN.sendKeys("111111118");
	}

	@Then("Select Date of Birth")
	public void select_Date_of_Birth() {
	   NewRequest1.DOB.click();
	   NewRequest1.DOB.sendKeys("05121992");
	}

	@Then("Input Percentage Numbers")
	public void input_Percentage_Numbers() {
	   NewRequest1.Percentage.sendKeys("100");
	}

	@Then("Input Address Line")
	public void input_Address_Line() {
	    NewRequest1.Address.sendKeys("8nd St S");
	}

	@Then("Input City name")
	public void input_City_name() {
	    NewRequest1.City.sendKeys("Arlington");
	}

	@Then("Input State name")
	public void input_State_name() {
	    NewRequest1.State.sendKeys("VA");
	}

	@Then("Input Zip Code Number")
	public void input_Zip_Code_Number() {
	    NewRequest1.ZipCode.sendKeys("22208");
	}

	@Then("Click ADD button")
	public void click_ADD_button() {
		act.pause(2000).perform();
		 NewRequest1.AddClick.click();
		 act.pause(2000).perform();
	     NewRequest1.ADDbtn.click();
	}
	
	@Then("Click the Next button")
	public void click_the_Next_button() {
		act.pause(2000).perform();
	    NewRequest1.NextBtn3.click();
	}

	@Then("Click Next button again")
	public void click_Next_button_again() {
		
	   NewRequest1.NextBtn4.click();
	}

	@Then("Click checking box")
	public void click_checking_box() {
		act.pause(2000).perform();
	    NewRequest1.CheckingBox.click();
	}

	@Then("Click review button to review all the informations")
	public void click_review_button_to_review_all_the_informations() {
	   NewRequest1.ReviewBtn.click();
	}

	@Then("Click X button to close the review page")
	public void click_X_button_to_close_the_review_page() {
		 act.pause(4000).perform();
		  NewRequest1.Xbtn.click();
		 
	}

	@Then("Click Submit button to submit it")
	public void click_Submit_button_to_submit_it() {
		 act.pause(2000).perform();
		  NewRequest1.SubmitBtn.click();
		  act.pause(4000).perform();
		 
	}
	
	@Then("Click Ok button to successfuly sumitted")
	public void click_Ok_button_to_successfuly_sumitted() {
	    NewRequest1.OkBtn.click();
	    System.out.println("Muna Bakeri is 100% Primary Beneficiaries ");
	}

	
	

}
