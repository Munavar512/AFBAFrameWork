package utilities;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import SalesforceFlashingPages.SalesforceFlashingPage;
import cucumber.api.Scenario;
import pages.AllPagefactories;
import pages.LoginPage;
import pages.MemberLoginPage;

public abstract class TestBase {
	
	protected static WebDriver driver;
	protected static WebDriverWait wait;
	protected static Actions act;
	protected static JavascriptExecutor js;
	

	protected static void LogIn() {
		
		Assert.assertTrue(driver.getTitle().contains("Login"));
		LoginPage.email.sendKeys("MAbabaikeli@afba.com");
	
		LoginPage.password.sendKeys("Muna5012");	 
		LoginPage.loginBtn.click();
		act.pause(3000).perform();
	}
	
	
	protected static void MemberLogIn() {	
		MemberLoginPage.MemberLoginBtn.click();
		MemberLoginPage.UserName.sendKeys("rams.mallipeddi@gmail.com.eleanor");
		MemberLoginPage.Password.sendKeys("Test12345");
		MemberLoginPage.LoginBtn.click();
		act.pause(3000).perform();
		MemberLoginPage.RequestBenefChangeBtn.click();
		act.pause(2000).perform();
		
	}
	

	protected static void FlashingPage() {
		SalesforceFlashingPage.ContactsBtn.click();
		SalesforceFlashingPage.ViewSearch.click();
		SalesforceFlashingPage.ContactWithBalmastMobileOption.click();
		SalesforceFlashingPage.GoBtn.click();
		act.pause(3000).perform();
		
	}
	
	protected static void SetUp() {
		driver=Driver.getDriver();
		driver.get(ConfigurationReader.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		act = new Actions(driver);
		wait = new WebDriverWait(driver, 10);
		
		// this is to run all page factories:
		new AllPagefactories();

	}
	
	protected static void TearDown(Scenario scenario) {
		if (scenario.isFailed()) 		
			scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES), "image/png");
		
			Driver.closeDriver();
			
	}

}
