package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ApplicationPage {
	
	
	@FindBy(xpath = "//a[contains(text(),'Manage cases')]")
	public static WebElement ManageCaseBtn;
	
	@FindBy(xpath = "//*[@type='search']")
	public static WebElement searchAFBA;
	
	@FindBy(xpath = "//*[@id='cases_table']/tbody/tr[1]/td[1]")
	public static WebElement AFBACase;
	

}
