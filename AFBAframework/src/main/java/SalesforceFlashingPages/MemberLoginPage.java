package SalesforceFlashingPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.TestBase;

public class MemberLoginPage extends TestBase {	
		   
	    @FindBy(xpath = "//*[contains(text(),'Member Login')]")
	    public static WebElement MemberLoginBtn;

	    @FindBy(xpath = "//*[@id='sitelogin:loginForm:username']")
	    public static WebElement UserName;

	    @FindBy(xpath = "//*[@id='sitelogin:loginForm:password']")
	    public static WebElement Password; 
	    
	    @FindBy(xpath="//*[@id='sitelogin:loginForm:submitbutton']")
	    public static WebElement LoginBtn;
	    
	    @FindBy(xpath="//*[contains(text(),'Request Beneficiary Change')]")
	    public static WebElement RequestBenefChangeBtn;

	}
	

