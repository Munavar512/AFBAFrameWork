package SalesforceFlashingPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SalesforceFlashingPage8 {

	@FindBy(xpath="//*[@id='003000000064fsK_FULL_NAME']/a/span")
	public static WebElement EightiethClient;
	
	@FindBy(xpath="//*[@id='003000000064fsK_00N00000008eQiX_body']/table/tbody/tr[2]/th/a")
	public static WebElement PolicyAccount;
	
	@FindBy(xpath="//*[@id='00N00000008eR1U_ileinner']")
	public static WebElement AffiliationCode;
	
	@FindBy(xpath="//*[@id='00N00000008eR1U']")
	public static WebElement SearchSpace;
	
	@FindBy(xpath="//*[@id='00N00000008eR1U']/option[25]")
	public static WebElement MASRI;
	
	@FindBy(xpath="//*[@id='topButtonRow']/input[1]")
	public static WebElement SaveBtn;
}
