package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewRequest1 {
	
	@FindBy(xpath = "//*[@id='Mainmenu:j_id41:j_id42:theForm:newChangeReq']")
	public static WebElement NewRequestBtn;
	
	@FindBy(xpath = "//*[@id='Mainmenu:j_id41:j_id42:theForm:j_id84']")
	public static WebElement NextBtn;
	
	@FindBy(xpath = "//*[@id='Mainmenu:j_id41:j_id42:theForm:j_id87:0:check-button-label-01']/span[1]")
	public static WebElement RadioBtn;
	
	@FindBy(xpath = "//*[@id='Mainmenu:j_id41:j_id42:theForm:policyNext']")
	public static WebElement NextBtn2;
	
	@FindBy(xpath = "//*[@id='Mainmenu:j_id41:j_id42:theForm:toggleBtnPhone']")
	public static WebElement AddPrimaryBtn;
	
	@FindBy(xpath= "//*[@id='Mainmenu:j_id41:j_id42:theForm:relationType']")
	public static WebElement RelationShipClick;
	
	@FindBy(xpath = "//*[@id='Mainmenu:j_id41:j_id42:theForm:relationType']/option[5]")
	public static WebElement RelationshipToInsured;
	
	@FindBy(xpath = "//*[@id='Mainmenu:j_id41:j_id42:theForm:relationType']")
	public static WebElement GenderClick;
	
	@FindBy(xpath = "//*[@id='Mainmenu:j_id41:j_id42:theForm:gender']/option[3]")
	public static WebElement GenderOption;
	
	@FindBy(xpath = "//*[@id='Mainmenu:j_id41:j_id42:theForm:firstName']")
	public static WebElement FirstName;
	
	@FindBy(xpath = "//*[@id='Mainmenu:j_id41:j_id42:theForm:lastName']")
	public static WebElement LastName;
	
	@FindBy(xpath = "//*[@id='Mainmenu:j_id41:j_id42:theForm:ssn']")
	public static WebElement SSN;
	
	@FindBy(xpath = "//*[@id='Mainmenu:j_id41:j_id42:theForm:dob']")
	public static WebElement DOB;
	
	@FindBy(xpath = "//*[@id='Mainmenu:j_id41:j_id42:theForm:percentage']")
	public static WebElement Percentage;
	
	@FindBy(xpath = "//*[@id='Mainmenu:j_id41:j_id42:theForm:street1']")
	public static WebElement Address;
	
	@FindBy(xpath = "//*[@id='Mainmenu:j_id41:j_id42:theForm:city']")
	public static WebElement City;
	
	@FindBy(xpath = "//*[@id='Mainmenu:j_id41:j_id42:theForm:state']")
	public static WebElement State;
	
	@FindBy(xpath = "//*[@id='Mainmenu:j_id41:j_id42:theForm:zip']")
	public static WebElement ZipCode;
	
	@FindBy(xpath ="//*[@id='Mainmenu:j_id41:j_id42:theForm:popupButtons']")
	public static WebElement AddClick;
	
	@FindBy(xpath = "//*[@id='Mainmenu:j_id41:j_id42:theForm:beneAdd']")
	public static WebElement ADDbtn;
	
	@FindBy(xpath = "//*[@id='Mainmenu:j_id41:j_id42:theForm:j_id351']")
	public static WebElement NextBtn3;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:theForm:j_id438']")
	public static WebElement NextBtn4;
	
	@FindBy(xpath = "//*[@id='Mainmenu:j_id41:j_id42:theForm:check-button-label-e01']/span[1]")
	public static WebElement CheckingBox;
	
	@FindBy(xpath = "//*[@id='Mainmenu:j_id41:j_id42:theForm:j_id581']")
	public static WebElement ReviewBtn;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:theForm:modalPreviewContainer']/div[1]/a")
	public static WebElement Xbtn;
	
	@FindBy(xpath = "//*[@id='Mainmenu:j_id41:j_id42:theForm:submitRequest']")
	public static WebElement SubmitBtn;
	
	@FindBy(xpath="//*[@id='Mainmenu:j_id41:j_id42:theForm:j_id622']")
	public static WebElement OkBtn;
	
}
