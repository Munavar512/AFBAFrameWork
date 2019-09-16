package SalesforceFlashingPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SalesforceFlashingPage4 {

	@FindBy(xpath="//*[@id='003000000064KP6_FULL_NAME']/a/span")
	public static WebElement ForthClient;
	
	@FindBy(xpath="//*[@id='003000000064KP6_00N00000008eQiX_body']/table/tbody/tr[2]/th/a")
	public static WebElement PolicyAccountSelect;
	
	@FindBy(xpath="//*[@id='00N00000008eR1U_ileinner']")
	public static WebElement AffiliationCodepart;
	
	@FindBy(xpath="//*[@id='00N00000008eR1U']")
	public static WebElement Search;
	
	@FindBy(xpath="//*[@id='00N00000008eR1U']/option[20]")
	public static WebElement MASMN;
	
	@FindBy(xpath="//*[@id='topButtonRow']/input[1]")
	public static WebElement SaveBttn;
}
