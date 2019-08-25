package pages;

import org.openqa.selenium.support.PageFactory;

import utilities.TestBase;

public class AllPagefactories extends TestBase{
	
	{
			PageFactory.initElements(driver, LoginPage.class);
			
			PageFactory.initElements(driver, ApplicationPage.class);
			
			PageFactory.initElements(driver, HomePage.class);
			
			// here I must write all the page' classes' Page Factory
			
			
			


	}
	
	
	
	

}
