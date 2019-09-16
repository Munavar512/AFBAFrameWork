package SalesforceFlashingPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MarketingPage {
	
	@FindBy(xpath = "//*[@id='j_id0:theForm:email']")
	public static WebElement Email;
	
	@FindBy(xpath = "//*[@id='j_id0:theForm:ssn']")
	public static WebElement SSN;
	
	@FindBy(xpath = "//*[@id='j_id0:theForm:lName']")
	public static WebElement LastName;
	
	@FindBy(xpath = "//*[@id='j_id0:theForm:dateOfBirth']")
	public static WebElement DOB;
	
	@FindBy(xpath="//*[@id='j_id0:theForm']/table/tbody/tr[2]/td/input")
	public static WebElement NextBtn;
	
	@FindBy(xpath="//*[@id='j_id0:theForm:PolicyResults:mailingStateId']")
	public static WebElement StateOption;
	
	@FindBy(xpath="//*[@name='j_id0:theForm:PolicyResults:optinSection:marketingoptout']")
	public static WebElement MarketingOption;
	
	@FindBy(xpath="//*[@id='recaptcha-anchor-label']")
	public static WebElement varifyCaptcha;
	
	@FindBy(xpath="//*[@id='j_id0:theForm:PolicyResults:createCase']")
	public static WebElement SubmitBtn;

}
