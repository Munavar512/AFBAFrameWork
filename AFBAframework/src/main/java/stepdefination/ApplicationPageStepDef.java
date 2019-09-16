package stepdefination;

import org.openqa.selenium.*;

import cucumber.api.java.en.*;
import pages.ApplicationPage;
import utilities.*;

public class ApplicationPageStepDef extends TestBase {
   
    @When("User enter HomePage to click Manage cases button")
    public void user_enter_HomePage_to_click_Manage_cases_button() {
        ApplicationPage.ManageCaseBtn.click();
    }

    @Then("User input search to find AFBA case")
    public void user_input_search_to_find_AFBA_case() {
    	ApplicationPage.searchAFBA.sendKeys("AFBA" + Keys.ENTER);
    }

    @Then("click the AFBA case")
    public void click_the_AFBA_case() {
    	ApplicationPage.AFBACase.click();
    }

    @Then("create New Enrollment")
    public void create_New_Enrollment() {
    	act.pause(2000).perform();
    	ApplicationPage.CreateNewEnrollement.click();
    }
    
    @Then("User input Sponsor SSN and click Next button")
    public void user_input_Sponsor_SSN_and_click_Next_button() {
    	ApplicationPage.SSNnumber.click();
    	ApplicationPage.SSNnumber.sendKeys("111111165");
    	act.pause(2000).perform();
    	ApplicationPage.ClickNextBtn.click();
    	ApplicationPage.ClickBiginEnrollement.click();
    }
    
    @Then("User input Sponsor firstName, lastName, dateOfBirth")
    public void user_input_Sponsor_firstName_lastName_dateOfBirth() {
        ApplicationPage.FirstName.sendKeys("Munavar");
        ApplicationPage.LastName.sendKeys("Bakeri");  
       ApplicationPage.Birthday.click();
       ApplicationPage.Birthday.sendKeys("04121992");
    }

    // for hidden elements:
    
//    @Then("If User select Married button")
//    public void if_User_select_Married_button() {
//    	Assert.assertTrue(ApplicationPage.MarriedBtn.isSelected());
    
//    	//for hidden element
//    	ApplicationPage.MarriedBtn.click();
//    	wait.until(ExpectedConditions.visibilityOf(ApplicationPage.SpouseFirstNa));
//    //	Assert.assertTrue(ApplicationPage.SpouseFirstNa.isDisplayed());
//    //	Assert.assertTrue(ApplicationPage.MarriedBtn.isSelected());
//    }
//        
//    @Then("User input Spouse firstName, lastName and DOB")
//    public void user_input_Spouse_firstName_lastName_and_DOB() {
//		ApplicationPage.SpouseFirstNa.sendKeys("Sophia");
//		ApplicationPage.SpouseLastNa.sendKeys("Schulman");
//		ApplicationPage.SpouseDOB.click();
//		ApplicationPage.SpouseDOB.sendKeys("05111992");
//    }
//    
//    @Then("If User select IncludeChildren button")
//    public void if_User_select_IncludeChildren_button() {
//    	ApplicationPage.ChildrenBtn.click();
//    	wait.until(ExpectedConditions.visibilityOf(ApplicationPage.ChildFirstNam));
//    // 	Assert.assertTrue(ApplicationPage.ChildFirstNam.isDisplayed());
//    	Assert.assertTrue(ApplicationPage.ChildFirstNam.isSelected());
//    }
//    
//    @Then("User input Children firstName, lastName and DOB")
//    public void user_input_Children_firstName_lastName_and_DOB() {
//		ApplicationPage.ChildFirstNam.sendKeys("Sam");
//		ApplicationPage.ChildLastNam.sendKeys("Mike");
//		ApplicationPage.ChildDOF.click();
//		ApplicationPage.ChildDOF.sendKeys("11202008");
//    }
    
    @Then("User select Eligibility, BranchOfService, DutyStatus, Rank and Contribution Mode")
    public void user_select_Eligibility_BranchOfService_DutyStatus_Rank_and_Contribution_Mode() {
        ApplicationPage.Eligibility.click();
        ApplicationPage.BranchOfService.click();
        ApplicationPage.DutyStatus.click();
        ApplicationPage.Rank.click();
        ApplicationPage.ContributionMode.click();
       
    }
   

    @Then("User input DepartmentCode and SourceCode")
    public void user_input_DepartmentCode_and_SourceCode() {
       ApplicationPage.DepartmentCode.sendKeys("12345");
    
       ApplicationPage.SourceCode.sendKeys("56789");
    }

    
    @Then("User click Show Coverage Options button")
    public void user_click_Show_Coverage_Options_button() {
    	act.pause(2000).perform();
       ApplicationPage.ShowCoverageOptopnBtn.click();
    }
    
    
    @Then("User select firstOption")
    public void user_select_firstOption() {
       ApplicationPage.SelectOption.click();
    }

    
    @Then(" User click Next button")
    public void user_click_Next_button() {
    	act.pause(2000).perform();
     ApplicationPage.NextBtn.click();
    }
    
    
    @Then("User select yes or No for Other Insurance option")
    public void user_select_yes_or_No_for_Other_Insurance_option() {
        ApplicationPage.LifeInsuranceOption.click();
        ApplicationPage.ReplaceLifeInsuranceOption.click();
    }
    

    @Then("User select Yes or No for Better Alternative options")
    public void user_select_Yes_or_No_for_Better_Alternative_options() {
    	ApplicationPage.OptionOne.click();
    	ApplicationPage.OptionTwo.click();
    	ApplicationPage.DrugDependencyOption.click();
    	ApplicationPage.OptionFour.click();
    	ApplicationPage.OptionFive.click();
    	ApplicationPage.OptionSix.click();
    	ApplicationPage.OptionSeven.click();
    }
    

    @Then("User Spouse select Yes or No for Other Insurance options")
    public void user_Spouse_select_Yes_or_No_for_Other_Insurance_options() {
       ApplicationPage.SpouseLifeInsuranceOption.click();
       ApplicationPage.SpouseReplaceLifeInsuranceOption.click();
     
    }
    
    
    @Then("User Spouse select Yes or No for Better Alternative options")
    public void user_Spouse_select_Yes_or_No_for_Better_Alternative_options() {
        ApplicationPage.SpouseBetterElternativeOption1.click();
        ApplicationPage.SpouseBetterElternativeOption2.click();
        ApplicationPage.SpouseBetterElternativeOption3.click();
        ApplicationPage.SpouseBetterElternativeOption4.click();
        ApplicationPage.SpouseBetterElternativeOption5.click();
        ApplicationPage.SpouseBetterElternativeOption6.click();
        ApplicationPage.SpouseBetterElternativeOption6.click();
        ApplicationPage.SpouseBetterElternativeOption7.click();
        act.pause(3000).perform();
    }
    
    
    @Then("cilck the Next button")
    public void cilck_the_Next_button() {
    	ApplicationPage.NextBtn2.click();
    }
    
    
    @Then("User select Sponsor gender")
    public void user_select_Sponsor_gender() {
       ApplicationPage.Gender.click();
    }
    

    @Then("User input Sponsor height and weight")
    public void user_input_Sponsor_height_and_weight() {
      ApplicationPage.HeightClick.click();
      ApplicationPage.HeightOption.click();
      
      ApplicationPage.HeightInchesclick.click();
      ApplicationPage.HeightInchesOption.click();
      
      ApplicationPage.Weight.click();
      ApplicationPage.Weight.sendKeys("118");  
    }

    @Then("User input Sponsor address, Email and contact numbers")
    public void user_input_Sponsor_address_Email_and_contact_numbers() {
       ApplicationPage.Street.click();
       ApplicationPage.Street.sendKeys("8nd St S");
       ApplicationPage.City.click();
       ApplicationPage.City.sendKeys("Arlington");
       ApplicationPage.State.click();
     
       ApplicationPage.State.click();
       ApplicationPage.State.sendKeys("Virginia");
       ApplicationPage.State.sendKeys(Keys.ENTER);
       act.pause(1000).perform();

       ApplicationPage.ZipCode.click();
       ApplicationPage.ZipCode.sendKeys("22208");
      
       ApplicationPage.EmailAddress.sendKeys("MAbabaikeli@afba.com");
       ApplicationPage.ReEmailAddress.sendKeys("MAbabaikeli@afba.com");
       ApplicationPage.Phone.click();
       ApplicationPage.Phone.sendKeys("7036228818");
       act.pause(3000).perform();
        
    }
    @Then("User click Next button")
    public void User_click_Next_button() {
    	ApplicationPage.NextBtn3.click();
    }
    
    
    @Then("User input valid Spose SSN numbers")
    public void user_input_valid_Spose_SSN_numbers() {
    	ApplicationPage.SpouseSSN.click();
        ApplicationPage.SpouseSSN.sendKeys("111111113");
        act.pause(2000).perform();
    }
    
    
    @Then("User select Spouse gender")
    public void user_select_Spouse_gender() {
        ApplicationPage.SpouseGender.click();
    }
    
    @Then("User select Spouse height and weight")
    public void user_select_Spouse_height_and_weight() {
        ApplicationPage.SpouseHeight.click();
        ApplicationPage.SpouseInches.click();
        ApplicationPage.SpouseWeight.click();
        ApplicationPage.SpouseWeight.sendKeys("118");
        act.pause(1000).perform();
    }

    @Then("User click Next Button for Beneficiaries for Better Alternative")
    public void user_click_Next_Button_for_Beneficiaries_for_Better_Alternative() {
        ApplicationPage.NextBtn5.click();
    }


    @Then("User enter Sponsor beneficiary fullName SSN Relationship DOB")
    public void user_enter_Sponsor_beneficiary_fullName_SSN_Relationship_DOB() {
        ApplicationPage.BeneficiaryFullname.sendKeys("Kurban Bakeri");
        ApplicationPage.BeneficiarySSN.click();
        ApplicationPage.BeneficiarySSN.sendKeys("111111112");
        ApplicationPage.BeneficiaryRelationship.click();
      
        ApplicationPage.BeneficiaryDOB.click();
        ApplicationPage.BeneficiaryDOB.sendKeys("10231985");
        act.pause(2000).perform();
    }
    
    
    @Then("User click Next buuton for next step")
    public void user_click_Next_buuton_for_next_step() {
       ApplicationPage.NextBtn5.click();
    }

    @Then("User select Deducation day")
    public void user_select_Deducation_day() {
        ApplicationPage.DeducationDay.click();
    }
    
    @Then("User click Deducation day")
    public void user_click_Deducation_day() {
    	 act.pause(1000).perform();
        ApplicationPage.SelectDeducationDay.click();
    }

    @Then("User input Credit Card Number, Expiration Date and Cvv")
    public void user_input_Credit_Card_Number_Expiration_Date_and_Cvv() {
    	
       
    	ApplicationPage.CreditCardNum.click();
        ApplicationPage.CreditCardNum.sendKeys("5800000000000001");
        ApplicationPage.ExpirationDate.click();
        ApplicationPage.ExpirationDate.sendKeys("1119");
        ApplicationPage.CVV.sendKeys("231");
        act.pause(2000).perform();
    }

    @Then("User click Signing in-person button")
    public void user_click_Signing_in_person_button() {
       ApplicationPage.SiginingInPerson.click();
    }

    @Then("User click I agree to this coverage and ready to sign button")
    public void user_click_I_agree_to_this_coverage_and_ready_to_sign_button() {
    	ApplicationPage.AgreeToSignInBtn.click();
    	 act.pause(4000).perform();
    }
    
    @Then("User click the Review Application Ducuments")
    public void user_click_the_Review_Application_Ducuments() {
        ApplicationPage.ReviewApplicationBtn.click();
     //   js.executeScript("window.scrollBy(0,4000)");
     //   Assert.assertTrue(ApplicationPage.ReviewApplicationBtn.isSelected());
    	//wait.until(ExpectedConditions.visibilityOf(ApplicationPage.ReviewApplicationBtn));
        act.pause(5000).perform();
      //  js.executeScript("arguments[0].scrollIntoView();",ApplicationPage.CloseBtn);
    }
    
    @Then("User Close the Application")
    public void user_Close_the_Application() {
   //    act.pause(2000).perform();
       ApplicationPage.CloseBtn.click();
    }

    @Then("User click the check box")
    public void user_click_the_check_box() {
       ApplicationPage.CheckBox.click();
    }

    @Then("User select Paper radio button")
    public void user_select_Paper_radio_button() {
    	act.pause(2000).perform();
    //	wait.until(ExpectedConditions.visibilityOf(ApplicationPage.PaperBtn));
        ApplicationPage.PaperBtn.click();
    }

    @Then("User input sponsor lastName")
    public void user_input_sponsor_lastName() {
    	ApplicationPage.SponsorLastName.click();
       ApplicationPage.SponsorLastName.sendKeys("Bakeri");
    }

    @Then("User input Last four SSN number")
    public void user_input_Last_four_SSN_number() {
        ApplicationPage.SponsorLastSSN.click();
        ApplicationPage.SponsorLastSSN.sendKeys("1165");
        //ApplicationPage.SponsorLastSSN.click();
    }

    @Then("User Click Sign button")
    public void user_Click_Sign_button() {
    	ApplicationPage.clickModalBodyBtn.click();
       act.pause(4000).perform();
//      wait.until(ExpectedConditions.visibilityOf(ApplicationPage.SignBtn));
       ApplicationPage.SignBtn.click();
    }
    
    @Then("User click Sign button for Angent eSignature")
    public void user_click_Sign_button_for_Angent_eSignature() {
       ApplicationPage.eSignatureBrn.click();
       act.pause(6000).perform();
    }
    
    @Then("back to Home page")
    public void back_to_Home_page() {
        ApplicationPage.HomeButtn.click();
        act.pause(1000).perform();
    }

    @Then("click View Transmittals button")
    public void click_View_Transmittals_button() {
        ApplicationPage.ViewTransmittalsBtn.click();
        act.pause(2000).perform();
    }
    

    @Then("View Submission button to check submission")
    public void view_Submission_button_to_check_submission() {
    	ApplicationPage.ViewSubmitionBtn.click();
    	act.pause(5000).perform();
    }
    
    @Then("check Download Data from XML file")
    public void check_Download_Data_from_XML_file() {
    	//for right click
       act.contextClick(ApplicationPage.DawnloadDataBtn).perform();
       act.pause(3000).perform();

    }

    
	}