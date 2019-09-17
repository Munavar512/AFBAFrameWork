package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class eAppApplication {

	@FindBy(xpath = "//a[contains(text(),'Manage cases')]")
	public static WebElement ManageCaseBtn;
	
	@FindBy(xpath = "//*[@type='search']")
	public static WebElement searchAFBA;
	
	@FindBy(xpath = "//*[@id='cases_table']/tbody/tr[1]/td[1]")
	public static WebElement AFBACase;
	
	@FindBy(id = "//*[@id='add-to-census-btn']")
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
	
	@FindBy(xpath="//*[contains(text(),'Next')]")
	public static WebElement NextBtn;
	
	
}
