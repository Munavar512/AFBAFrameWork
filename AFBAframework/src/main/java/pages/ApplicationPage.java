package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ApplicationPage {
	
	@FindBy(xpath = "//a[contains(text(),'Manage cases')]")
	public static WebElement ManageCaseBtn;
	
	@FindBy(xpath = "//*[@type='search']")
	public static WebElement searchAFBA;
	
	@FindBy(xpath = "//*[@id='cases_table']/tbody/tr[1]/td[1]")
	public static WebElement AFBACase;
	
	@FindBy(id = "add-to-census-btn")
	public static WebElement CreateNewEnrollement;
	
	@FindBy(xpath = "//input[@id='add-census-ssn-input']")
	public static WebElement SSNnumber;
	
	@FindBy(xpath = "//button[contains(text(),'Next')]")
	public static WebElement ClickNextBtn;
	
	@FindBy(xpath = "//button[contains(text(),'Begin Enrollment')]")
	public static WebElement ClickBiginEnrollement;
	
	@FindBy(xpath= "//input[@id='eeBenefitFName']")
	public static WebElement FirstName;
	
	@FindBy(xpath= "//input[@id='eeBenefitLName']")
	public static WebElement LastName;
	
	@FindBy(name= "eeBenefitDOB")
	public static WebElement Birthday;
	
	@FindBy(css=".lbl.padding-8.is_married")
	public static WebElement MarriedBtn;
	
	@FindBy(xpath ="//*[@id='spFName']")
	public static WebElement SpouseFirstNa;
	
	@FindBy(xpath="//*[@id='spLName']")
	public static WebElement SpouseLastNa;
	
	@FindBy(xpath="//*[@id='spDOB']")
	public static WebElement SpouseDOB;
	
	@FindBy(css =".lbl.padding-8.include_children")
	public static WebElement ChildrenBtn;
	
	@FindBy(className ="child_last")
	public static WebElement ChildLastNam;
	
	@FindBy(xpath ="//*[@id='child-dob-0']")
	public static WebElement ChildDOF;
	
	@FindBy(className ="child_first")
	public static WebElement ChildFirstNam;
	
	
	
	@FindBy(xpath= "//option[@value='Military']")
	public static WebElement Eligibility ;
	
	@FindBy(xpath = "//*[contains(text(),'Army')]")
	public static WebElement BranchOfService;
	
	@FindBy (xpath = "//*[contains(text(),'National Guard')]")
	public static WebElement DutyStatus;
	
	@FindBy(xpath = "//*[contains(text(),'E5')]")
	public static WebElement Rank;
	
	@FindBy(xpath ="//*[@id='contributionMode']/option[2]")
	public static WebElement ContributionMode;
	
	@FindBy(xpath ="//input[@name='deptCode']")
	public static WebElement DepartmentCode;
	
	@FindBy(xpath="//input[@name='sourceCode']")
	public static WebElement SourceCode;
	
	@FindBy(xpath="//*[@id='eeStreet1']")
	public static WebElement Street;
	
	@FindBy (xpath="//*[@id='eeStreet2']")
	public static WebElement Street2;
	
	@FindBy(xpath="//*[@id='eeCity']")
	public static WebElement City;
	
	@FindBy(xpath="//*[@id='eeState']")
	public static WebElement State;
	
	@FindBy(xpath="//input[@id='eeZip']")
	public static WebElement ZipCode;
	
	@FindBy(xpath="//input[@id='email']")
	public static WebElement EmailAddress;
	
	@FindBy(xpath="//input[@id='email_repeat']")
	public static WebElement ReEmailAddress;
	
	@FindBy(xpath ="//input[@id='phone']")
	public static WebElement Phone;
	
	@FindBy(xpath="//*[contains(text(),'Show Coverage Options')]")
	public static WebElement ShowCoverageOptopnBtn;
	
	
	@FindBy(xpath="//a[@class='btn btn-block btn-sm btn-danger']")
	public static WebElement SelectOption;
	
	@FindBy(xpath="//*[contains(text(),'Next')]")
	public static WebElement NextBtn;
	

	@FindBy(xpath ="//*[@id='step2']/form/div[2]/div[1]/div[2]/div[2]/div/button[2]")
	public static WebElement LifeInsuranceOption;
	
	@FindBy(xpath = "//*[@id='step2']/form/div[2]/div[2]/div[2]/div[2]/div/button[2]")
	public static WebElement ReplaceLifeInsuranceOption;
	
	
	@FindBy(xpath="//*[@id='step2']/form/div[5]/div[1]/table/tbody/tr[1]/td/div[1]/div[2]/div/div/button[2]")
	public static WebElement OptionOne;
	
	@FindBy(xpath="//*[@id='step2']/form/div[5]/div[1]/table/tbody/tr[2]/td/div[1]/div[2]/div/div/button[2]")
	public static WebElement OptionTwo;
	
	
	@FindBy(xpath="//*[@id='step2']/form/div[5]/div[1]/table/tbody/tr[3]/td/div[1]/div[2]/div/div/button[2]")
	public static WebElement DrugDependencyOption;
	
	@FindBy(xpath="//*[@id='step2']/form/div[5]/div[1]/table/tbody/tr[4]/td/div[1]/div[2]/div/div/button[2]")
	public static WebElement OptionFour;
	
	@FindBy(xpath="//*[@id='step2']/form/div[5]/div[1]/table/tbody/tr[5]/td/div[1]/div[2]/div/div/button[2]")
	public static WebElement OptionFive;
	
	@FindBy (xpath="//*[@id='step2']/form/div[5]/div[1]/table/tbody/tr[6]/td/div[1]/div[2]/div/div/button[2]")
	public static WebElement OptionSix;
	
	@FindBy(xpath="//*[@id='step2']/form/div[5]/div[1]/table/tbody/tr[7]/td/div[1]/div[2]/div/div/button[2]")
	public static WebElement OptionSeven;
	
	@FindBy(xpath="//*[@id='step2']/form/div[2]/div[1]/div[2]/div[2]/div[2]/button[2]")
	public static WebElement SpouseLifeInsuranceOption;
	
	@FindBy(xpath="//*[@id='step2']/form/div[2]/div[2]/div[2]/div[2]/div[2]/button[2]")
	public static WebElement SpouseReplaceLifeInsuranceOption;
	
	@FindBy(xpath="//*[@id='step2']/form/div[5]/div[1]/table/tbody/tr[1]/td/div[1]/div[2]/div/div[2]/button[2]")
	public static WebElement SpouseBetterElternativeOption1;
	
	@FindBy(xpath="//*[@id='step2']/form/div[5]/div[1]/table/tbody/tr[2]/td/div[1]/div[2]/div/div[2]/button[2]")
	public static WebElement SpouseBetterElternativeOption2;
	
	@FindBy(xpath="//*[@id='step2']/form/div[5]/div[1]/table/tbody/tr[3]/td/div[1]/div[2]/div/div[2]/button[2]")
	public static WebElement SpouseBetterElternativeOption3;
	
	@FindBy(xpath="//*[@id='step2']/form/div[5]/div[1]/table/tbody/tr[4]/td/div[1]/div[2]/div/div[2]/button[2]")
	public static WebElement SpouseBetterElternativeOption4;
	
	@FindBy(xpath="//*[@id='step2']/form/div[5]/div[1]/table/tbody/tr[5]/td/div[1]/div[2]/div/div[2]/button[2]")
	public static WebElement SpouseBetterElternativeOption5;
	
	@FindBy(xpath="//*[@id='step2']/form/div[5]/div[1]/table/tbody/tr[6]/td/div[1]/div[2]/div/div[2]/button[2]")
	public static WebElement SpouseBetterElternativeOption6;
	
	@FindBy(xpath="//*[@id='step2']/form/div[5]/div[1]/table/tbody/tr[7]/td/div[1]/div[2]/div/div[2]/button[2]")
	public static WebElement SpouseBetterElternativeOption7;
	
	@FindBy(xpath ="//button[@class='btn btn-success btn-next']")
	public static WebElement NextBtn2;
	
	@FindBy(xpath ="//*[@id='step3-form']/div[6]/div/label[2]/span")
	public static WebElement Gender;
	
	@FindBy(name ="height_feet_null")
	public static WebElement HeightClick;
	
	@FindBy (xpath= "//select[@name='height_feet_null']/option[7]")
	public static WebElement HeightOption;
	
	@FindBy (name="height_inches_null")
	public static WebElement HeightInchesclick;
	
	@FindBy (xpath = "//select[@name='height_inches_null']/option[12]")
	public static WebElement HeightInchesOption;
	
	@FindBy (xpath = "//*[@id='step3-form']/div[8]/div/input")
	public static WebElement Weight;
	
	@FindBy(xpath ="//div[@class='wizard-actions']/button[2]")
	public static WebElement NextBtn3;
	
	@FindBy(xpath="//*[@name='spssn']")
	public static WebElement SpouseSSN;
	
	@FindBy(xpath="//*[@id='SpouseInfoBlock']/div[3]/div/label[2]/span")
	public static WebElement SpouseGender;
	
	@FindBy(xpath="//*[@id='sp-height-weight']/div/label[1]/select/option[7]")
	public static WebElement SpouseHeight;
	
	@FindBy(xpath="//*[@id='sp-height-weight']/div/label[2]/select/option[11]")
	public static WebElement SpouseInches;
	
	@FindBy(xpath="//*[@id='SpouseInfoBlock']/div[5]/div/input")
	public static WebElement SpouseWeight;
	
	@FindBy(css =".btn.btn-success.btn-next")
	public static WebElement NextBtn4;
	
	@FindBy(css =".btn.btn-success.btn-next")
	public static WebElement NextBtn5;
	
	@FindBy(xpath="//*[@id='eeBeneficiaryOther']/div[1]/div[1]/div/input")
	public static WebElement BeneficiaryFullname;
	
	@FindBy(xpath="//*[@id='eeBeneficiaryOther']/div[2]/div[1]/div/input")
	public static WebElement BeneficiarySSN;
	
	@FindBy(xpath = "//*[@id='eeBeneficiaryOther']/div[1]/div[2]/div/select/option[4]")
	public static WebElement BeneficiaryRelationship;
	
	@FindBy(name = "eeBeneOtherDOB0")
	public static WebElement BeneficiaryDOB;
	
	@FindBy (css=".btn.btn-success.btn-next")
	public static WebElement NextBtn6;
	
	@FindBy(xpath ="//*[@id='credit-card-info']/div[3]/div[2]/select")
	public static WebElement DeducationDay;
	
	@FindBy(xpath="//*[@id='credit-card-info']/div[3]/div[2]/select/option[2]")
	public static WebElement SelectDeducationDay;
	
	@FindBy(xpath ="//*[@name='credit-card-number']")
	public static WebElement CreditCardNum;
	
	@FindBy(xpath ="//*[@name='expiration-date']")
	public static WebElement ExpirationDate;
	
	@FindBy(xpath="//*[@name='cvv']")
	public static WebElement CVV;
	
	@FindBy(xpath="//*[@id='step6-form']/div[3]/div/label[1]/span")
	public static WebElement SiginingInPerson;
	
	@FindBy(xpath ="//*[contains(text(),'I agree to this coverage and am ready to sign')]")
	public static WebElement AgreeToSignInBtn;
	
	@FindBy(xpath ="//*[contains(text(),'Review Application Documents to Continue')]")
	public static WebElement ReviewApplicationBtn;
	
	@FindBy(xpath ="/html/body/div[4]/div[2]/div/div[3]/button")
	public static WebElement CloseBtn;

	@FindBy(xpath="//*[@id='applicant_sig_check_1']")
	public static WebElement CheckBox;
	
	@FindBy(xpath="//*[@id='modal-signing-applicant-in-person']/div[2]/div/div[2]/div[2]/div/span/div/div/div[2]/label[2]/span")
	public static WebElement PaperBtn;
	
	@FindBy(xpath ="//*[@name='step_6_last_name']")
	public static WebElement SponsorLastName;
	
	@FindBy(xpath ="//*[@name='step_6_ssn']")
	public static WebElement SponsorLastSSN;
	
	@FindBy(xpath="//*[@id='modal-signing-applicant-in-person']/div[2]/div/div[2]")
	public static WebElement clickModalBodyBtn;
	
	@FindBy(xpath ="//*[@id='modal-signing-applicant-in-person']/div[2]/div/div[3]/button[2]")
	public static WebElement SignBtn;
	
	@FindBy(xpath="//*[@id='modal-signing-enroller-in-person']/div[2]/div/div[3]/button[2]")
	public static WebElement eSignatureBrn;
	
	@FindBy(xpath="//a[contains(text(),'Home')]")
	public static WebElement HomeButtn;
	
	@FindBy(xpath="//*[contains(text(),'View Transmittals')]")
	public static WebElement ViewTransmittalsBtn;
	
	@FindBy(xpath="//*[@id='submissions']/tbody/tr[1]/td[5]/button")
	public static WebElement ViewSubmitionBtn;
	
	@FindBy(xpath="//*[@id='submissions']/tbody/tr[2]/td/div[2]/div/a")
	public static WebElement DawnloadDataBtn;
}
