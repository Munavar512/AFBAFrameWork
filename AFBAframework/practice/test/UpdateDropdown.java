package test;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdateDropdown {

	public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		
		WebDriver driver = new ChromeDriver();
	
		//Assert True and False
		driver.get("https://frontline.afba.com/");
		Assert.assertFalse(driver.findElement(By.cssSelector("element of css")).isSelected());
		Assert.assertFalse(false);  //	//this argument expect that element is false. It will return false on console
		
		driver.findElement(By.cssSelector("element of css")).clear();
		System.out.println(driver.findElement(By.cssSelector("element of css")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("element of css")).isSelected()); //this return true on Console
		
		//Assert Equal
		System.out.println(driver.findElement(By.cssSelector("locating the element")).getSize());
		driver.findElement(By.id("idName")).click();
		
		
		System.out.println(driver.findElement(By.id("getTheElemenet")).getSize());
		
		int S=0;
		for(int i=1; i<S; i++) {
		//	driver.findElement(By.id("getThe Element")).clcik();
			
		}
	}

}
