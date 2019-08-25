package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class chromebrowser {

//	static webDriver driver = new ChromeDriver();
	
	public static void main(String[] args) {
	
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://enroll-sandbox.afba.com/");
		
		driver.findElement(By.id("login")).sendKeys("MAbabaikeli");
		
		driver.findElement(By.name("password")).sendKeys("Test123!");
		
		driver.findElement(By.xpath("//button[contains(@class,'width-35')]")).click();
		
//		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
//		
//		System.out.println(driver.findElement(By.tagName("AFBA TAA")).getText());
//		
//		driver.findElement(By.xpath("//a[contains(@class,\"btn btn-success\")]")).click();
//		
//		 driver.findElement(By.cssSelector("div[class=\"ms-srch-sb ms-srch-sb-border\"]")).sendKeys("salesforse");
//		
//		 driver.findElement(By.cssSelector(".bottomBarRight")).click();
		 
		 
		 
	//	WebDriver driver =new ChromeDriver();
//		driver.get("http://www.qaclickacademy.com/interview.php");
//		driver.findElement(By.xpath("//li[text()=' Selenium ']")).click();
//
//		driver.findElement(By.xpath("//ul[@class='responsive-tabs__list']/li[1]/following-sibling::li[2]")).click();
//
//		System.out.println(driver.findElement(By.xpath(".//*[@id='tablist1-tab2']/parent::ul")).getAttribute("role"));
	

		
		
	}
}
		
		
	
