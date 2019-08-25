package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.TestBase;

	public class LoginPage extends TestBase {
			
	   
	    @FindBy(xpath = "//input[@id='login']")
	    public static WebElement email;

	    @FindBy(xpath = "//input[@id='password']")
	    public static WebElement password;

	    @FindBy(xpath = "//button[@type='submit']")
	    public static WebElement loginBtn;

	    
	    
	   
	    

	}
	

