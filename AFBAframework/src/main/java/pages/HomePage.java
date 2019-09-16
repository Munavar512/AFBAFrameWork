package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	
		@FindBy(xpath= "//a[contains(text(),'Home')]")
	    public static WebElement HomeBtn;
	    
	    @FindBy(css=".btn.btn-success.btn-lg")
	    public static WebElement ManageCaseBtn;
	    
	    @FindBy(xpath="//*[contains(text(),'Manage agents/users')]")
	    public static WebElement ManageAgentsOrUsersBtn;
	  
	    @FindBy(xpath="//a[contains(text(),'Manage products')]")
	    public static WebElement ManageProductBtn;
	    
	    @FindBy(xpath="//*[contains(text(),'View Transmittals')]")
	    public static WebElement ViewTransmittalsBtn;
	    
	

}
