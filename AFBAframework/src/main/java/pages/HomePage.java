package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	
	 @FindBy(xpath= "//a[contains(text(),'Home')]")
	    public WebElement homeBtn;
	    
	    @FindBy(css=".btn.btn-success.btn-lg")
	    public WebElement manageBtn;
	    
	    @FindBy(xpath="//*[@type='search']")
	    public WebElement search;
	    
	    @FindBy(css=".btn.btn-info")
	    public WebElement createNewCase;
	    
	    @FindBy(xpath="//*[@id='company_name']")
	    public WebElement enterCompanyName;
	    
	    @FindBy(xpath="//a[contains(text(),'Users')]")
	    public WebElement userBtn;
	    
	    @FindBy(xpath="//a[contains(@class,'pull-right btn btn-primary btn-sm')]")
	    public WebElement newUserBtn;
	    
	    @FindBy(id="fname")
	    public WebElement firstName;
	    
	    @FindBy(id="1name")
	    public WebElement lastName;
	    
	    @FindBy(id="repassword")
	    public WebElement enterPassworf;
	    
	    @FindBy(id="agency")
	    public WebElement agency;
	    
	    @FindBy(id="agent_code")
	    public WebElement AFBAAgentCode;
	    
	    @FindBy(css=".create-user.pull-right.btn.btn-info")
	    public WebElement createUserBtn;
	    
	    @FindBy(xpath="//img[contains(@src,'afba-eapp')]")
	    public WebElement clickTitleBtn;
	    
	    @FindBy(xpath="//a[contains(text(),'Manage products')]")
	    public WebElement manageProductBtn;
	    
	    @FindBy(xpath="//div[@class='pull-right']/a")
	    public WebElement createNewCustomProductBtn;
	    
	    @FindBy(xpath="//div[@class='col-md-8']/input")
	    public WebElement productName;

}
