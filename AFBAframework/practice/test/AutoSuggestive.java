package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://frontline.afba.com/");
		
		//create an object class "source" is object name, make life easy
		WebElement source = driver.findElement(By.className("react-autosuggest__input react-autosuggest__input--open"));
		
		source.clear();
		source.sendKeys("Washington");
		//Thread.sleep(2000);
		source.sendKeys(Keys.ENTER);
			WebElement destination = driver.findElement(By.className("hsw_autocomplePopup autoSuggestPlugin"));
		destination.clear();
		destination.sendKeys("Urum");
		destination.sendKeys(Keys.ARROW_DOWN); //Automatic drop down start to find "Urum~  options
		destination.sendKeys(Keys.ENTER);
	
		
	}

}
