package SalesforceFlashingPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SalesforceFlashingPage2 {
	
	@FindBy(xpath="//*[@id='00300000005rWCD_FULL_NAME']/a/span")
	public static WebElement secondClient;
	
	@FindBy(xpath="//*[@id='00300000005rWCD_00N00000008eQiX_body']/table/tbody/tr[2]/th/a")
	public static WebElement PolictAccountClick2;
	
	@FindBy(xpath="//*[@id='00N00000008eR1U_ileinner']")
	public static WebElement AffiliationCodeBtn;
	
	@FindBy(xpath="//*[@id='00N00000008eR1U']")
	public static WebElement SearchSpace;
	
	@FindBy(xpath="//*[@id='00N00000008eR1U']/option[18]")
	public static WebElement MASIL;
	
	@FindBy(xpath="//*[@id='topButtonRow']/input[1]")
	public static WebElement SaveBtn;
}
