package SalesforceFlashingPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SalesforceFlashingPage12 {

	@FindBy(xpath="//*[@id='003000000064vMD_FULL_NAME']/a/span")
	public static WebElement TheTwelfthClient;
	
	@FindBy(xpath="//*[@id='003000000064vMD_00N00000008eQiX_body']/table/tbody/tr[2]/th/a")
	public static WebElement PolicyAccount;
	
	@FindBy(xpath="//*[@id='00N00000008eR1U_ileinner']")
	public static WebElement AffiliationCode;
	
	@FindBy(xpath="//*[@id='00N00000008eR1U']")
	public static WebElement SearchSpace;
	
	@FindBy(xpath="//*[@id='00N00000008eR1U']/option[14]")
	public static WebElement TSA;
	
	@FindBy(xpath="//*[@id='topButtonRow']/input[1]")
	public static WebElement SaveBtn;
}
