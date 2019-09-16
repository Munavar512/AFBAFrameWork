package SalesforceFlashingPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SalesforceFlashingPage3 {

	@FindBy(xpath = "//*[@id='00300000005rfoB_FULL_NAME']/a/span")
	public static WebElement ThirdClient;
	
	@FindBy(xpath="//*[@id='00300000005rfoB_00N00000008eQiX_body']/table/tbody/tr[2]/th/a")
	public static WebElement PolicyAccountAction;
	
	@FindBy(xpath="//*[@id='00N00000008eR1U_ileinner']")
	public static WebElement AffiliationCodeOption;
	
	@FindBy(xpath="//*[@id='00N00000008eR1U']")
	public static WebElement SearchSpace;
	
	@FindBy(xpath="//*[@id='00N00000008eR1U']/option[19]")
	public static WebElement MASMA;
	
	@FindBy(xpath="//*[@id='topButtonRow']/input[1]")
	public static WebElement SaveBtn;
	
	
	
	
}
