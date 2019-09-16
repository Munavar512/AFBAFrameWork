package SalesforceFlashingPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.TestBase;

public class SalesforceFlashingPage extends TestBase {

	@FindBy(xpath = "//*[@id='Contact_Tab']/a")
	public static WebElement ContactsBtn;
	
	@FindBy(xpath="//*[@id='fcf']")
	public static WebElement ViewSearch;
	
	@FindBy(xpath="//*[@id='fcf']/option[19]")
	public static WebElement ContactWithBalmastMobileOption;
	
	@FindBy(xpath="//*[@id='filter_element']/div/span/span[1]/input")
	public static WebElement GoBtn;
	
}
