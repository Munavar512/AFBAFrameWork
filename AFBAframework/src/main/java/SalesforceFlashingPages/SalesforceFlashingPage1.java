package SalesforceFlashingPages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SalesforceFlashingPage1 {

	
	@FindBy(xpath="//*[@id='00300000005rVl1_FULL_NAME']/a/span")
	public static WebElement FirstContact;
	
	@FindBy(xpath="//*[@id='00300000005rVl1_00N00000008eQiX_body']/table/tbody/tr[2]/th/a")
	public static WebElement PolicyAccountClick;
	
	@FindBy(xpath="//*[@id='00N00000008eR1U_ilecell']")
	public static WebElement AffiliationCode;
	
	@FindBy(xpath="//*[@id='00N00000008eR1U']")
	public static WebElement SelectOption;
	
	@FindBy(xpath="//*[@id='00N00000008eR1U']/option[17]")
	public static WebElement MASCTselect;
	
	@FindBy(xpath="//*[@id='topButtonRow']/input[1]")
	public static WebElement SaveBtn;
	
}






