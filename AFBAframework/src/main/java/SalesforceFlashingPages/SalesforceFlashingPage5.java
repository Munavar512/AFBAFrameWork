package SalesforceFlashingPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SalesforceFlashingPage5 {

	@FindBy(xpath="//*[@id='003000000064dsp_FULL_NAME']/a/span")
	public static WebElement FifthClient;
	
	@FindBy(xpath="//*[@id='003000000064dsp_00N00000008eQiX_body']/table/tbody/tr[2]/th/a")
	public static WebElement PolicyAccount;
	
	@FindBy(xpath="//*[@id='00N00000008eR1U_ileinner']")
	public static WebElement AffiliationCode;
	
	@FindBy(xpath="//*[@id='00N00000008eR1U']")
	public static WebElement SearchSpacePart;
	
	@FindBy(xpath="//*[@id='00N00000008eR1U']/option[23]")
	public static WebElement MASNH;
	
	@FindBy(xpath="//*[@id='topButtonRow']/input[1]")
	public static WebElement SaveBttn;
}
