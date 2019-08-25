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
    	Driver.getDriver().findElement(By.id("add-to-census-btn")).click();
    }
    @Then("User enter Sponsor SSN and click Next button")
    public void user_enter_Sponsor_SSN_and_click_Next_button() {
    	Driver.getDriver().findElement(By.xpath("//input[@id='add-census-ssn-input']")).sendKeys("123456789");
    	Driver.getDriver().findElement(By.xpath("//button[contains(text(),'Next')]")).click();
    	Driver.getDriver().findElement(By.xpath("//button[contains(text(),'Begin Enrollment')]")).click();
    }
    
    @Then("User input Sponsor firstName, lastName, dateOfBirth")
    public void user_input_Sponsor_firstName_lastName_dateOfBirth() {
        Driver.getDriver().findElement(By.xpath("//input[@id='eeBenefitFName']")).sendKeys("Mike");
        Driver.getDriver().findElement(By.xpath("//input[@id='eeBenefitLName']")).sendKeys("Smith");
        
        WebElement birthDate= Driver.getDriver().findElement(By.name("eeBenefitDOB"));
        birthDate.click();
        birthDate.sendKeys("12231990");
        
      //  Driver.getDriver().findElement(By.cssSelector(".lbl.padding-8.is_married")).click();
    }
    @Then("User select Eligibility, BranchOfService, DutyStatus, Rank and Contribution Mode")
    public void user_select_Eligibility_BranchOfService_DutyStatus_Rank_and_Contribution_Mode() {
        Driver.getDriver().findElement(By.xpath("//option[@value='Military']")).click();
        Driver.getDriver().findElement(By.xpath("//*[contains(text(),'Army')]")).click();
        Driver.getDriver().findElement(By.xpath("//*[contains(text(),'National Guard')]")).click();
        Driver.getDriver().findElement(By.xpath("//*[contains(text(),'E5')]")).click();
        Driver.getDriver().findElement(By.xpath("//select[@name='contributionMode']/option[3]")).click();
 
    }

    @Then("input DepartmentCode, SourceCode")
    public void input_DepartmentCode_SourceCode() {
        Driver.getDriver().findElement(By.xpath("//input[@name='deptCode']")).sendKeys("22209");
        Driver.getDriver().findElement(By.xpath("//input[@name='sourceCode']")).sendKeys("22202");
    }

    @Then("User click Show Coverage Options button")
    public void user_click_Show_Coverage_Options_button() {
        Driver.getDriver().findElement(By.xpath("//*[contains(text(),'Show Coverage Options')]")).click();
    }
    
    @Then("User select firstOption")
    public void user_select_firstOption() {
        Driver.getDriver().findElement(By.xpath("//a[@class='btn btn-block btn-sm btn-danger']")).click();
    }

    @Then("User click Next button")
    public void user_click_Next_button() {
       Driver.getDriver().findElement(By.xpath("//div[@class='wizard-actions']/button[2]/span")).click();
    }
    @Then("Second step Qualification select NO to other insurance")
    public void second_step_Qualification_select_NO_to_other_insurance() {
        Driver.getDriver().findElement(By.xpath("//*[@id='step2']/form/div[2]/div[1]/div[2]/div[2]/div/button[2]")).click();
        Driver.getDriver().findElement(By.xpath("//*[@id='step2']/form/div[2]/div[2]/div[2]/div[2]/div/button[2]")).click();
    }

    @Then("Select Yes or No to Better Alternative questions")
    public void select_Yes_or_No_to_Better_Alternative_questions() {
    	Driver.getDriver().findElement(By.xpath("//*[@id='step2']/form/div[5]/div[1]/table/tbody/tr[1]/td/div[1]/div[2]/div/div/button[2]")).click();
    	Driver.getDriver().findElement(By.xpath("//*[@id='step2']/form/div[5]/div[1]/table/tbody/tr[2]/td/div[1]/div[2]/div/div/button[2]")).click();
    	Driver.getDriver().findElement(By.xpath("//*[@id='step2']/form/div[5]/div[1]/table/tbody/tr[3]/td/div[1]/div[2]/div/div/button[2]")).click();
    	Driver.getDriver().findElement(By.xpath("//*[@id='step2']/form/div[5]/div[1]/table/tbody/tr[4]/td/div[1]/div[2]/div/div/button[2]")).click();
    	Driver.getDriver().findElement(By.xpath("//*[@id='step2']/form/div[5]/div[1]/table/tbody/tr[5]/td/div[1]/div[2]/div/div/button[2]")).click();
    	Driver.getDriver().findElement(By.xpath("//*[@id='step2']/form/div[5]/div[1]/table/tbody/tr[6]/td/div[1]/div[2]/div/div/button[2]")).click();
    	Driver.getDriver().findElement(By.xpath("//*[@id='step2']/form/div[5]/div[1]/table/tbody/tr[7]/td/div[1]/div[2]/div/div/button[2]")).click();
    	
    }

    @Then("cilck the Next button")
    public void cilck_the_Next_button() {
    	Driver.getDriver().findElement(By.xpath("//div[@class='wizard-actions']/button[2]/span")).click();
    }
    
    @Then("User fillOut sponsor information to select gender")
    public void user_fillOut_sponsor_information_to_select_gender() {
        Driver.getDriver().findElement(By.xpath("//*[@id='step3-form']/div[6]/div/label[1]/span")).click();
    }

    @Then("User select height,weight")
    public void user_select_height_weight() {
   // 	Select s = driver.findElement(By.xpath(""))
        Driver.getDriver().findElement(By.xpath("//select[@name='height_feet_null']/option[7]")).click();
        
        Driver.getDriver().findElement(By.xpath("//select[@name='height_inches_null']/option[11]")).click();
 
        Driver.getDriver().findElement(By.xpath("//input[@name='weight_0']")).sendKeys("118");
        
    }

    @Then("User input address, Email address and contact number")
    public void user_input_address_Email_address_and_contact_number() {
        Driver.getDriver().findElement(By.xpath("//div[@class='clearfix']/input")).sendKeys("8th str s");
        Driver.getDriver().findElement(By.xpath("//input[@name='eeCity']")).sendKeys("Arlington");
        
        WebElement weight = Driver.getDriver().findElement(By.name("eeState"));
        weight.sendKeys("Virginia");
        weight.sendKeys(Keys.ARROW_DOWN);
        weight.sendKeys(Keys.ENTER);
        
        
        Driver.getDriver().findElement(By.xpath("//select[@name='eeState']'option[49]")).click();
        Driver.getDriver().findElement(By.xpath("//input[@name='eeZip']")).sendKeys("22208");
        Driver.getDriver().findElement(By.xpath("//*[@id='email']")).sendKeys("mike@gmail.com");
        Driver.getDriver().findElement(By.xpath("//input[@id='email_repeat']")).sendKeys("mike@gmail.com");
        Driver.getDriver().findElement(By.xpath("//*[@id='phone']")).sendKeys("703-622-8818");
        
    }
//    @Then("User on Next button")
//    public void user_on_Next_button() {
//    	Driver.getDriver().findElement(By.xpath("//div[@class='wizard-actions']/button[2]/span")).click();
//    }
//    @Then("User click Next on Spouse or Children info page")
//    public void user_click_Next_on_Spouse_Children_info_page() {
//        Driver.getDriver().findElement(By.className("ee-bene-name")).sendKeys("Tom Smith");
//        Driver.getDriver().findElement(By.className("ee-bene-ssn valid")).sendKeys("882-15-6098");
//        
//        WebElement relationship = Driver.getDriver().findElement(By.className("ee-bene-rel"));
//        relationship.click();
//        relationship.findElement(By.xpath("//select[@class='ee-bene-rel valid']/option[3]")).click();
//        
//        Driver.getDriver().findElement(By.name("eeBeneOtherDOB0")).sendKeys("1992-10-23");
//    }
//
//    @Then("User enter sponsor beneficiary fullName SSN Relationship DOB")
//    public void user_enter_sponsor_beneficiary_fullName_SSN_Relationship_DOB() {
//        Driver.getDriver().findElement(By.xpath("//button[@class='btn btn-success btn-next']")).click();
//    }

     


    
	}


