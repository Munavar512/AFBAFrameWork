package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://frontline.afba.com/");
		
		driver.findElement(By.xpath("pup p[ location")).click();
		System.out.println(driver.switchTo().alert().getText()); //get the text
		//after Alert display switch to alert and accept that pop-up box click "Ok" button
		driver.switchTo().alert().accept();  // accept --> is click OK
		driver.switchTo().alert().dismiss();  //for negative scenario
		
	}

}
