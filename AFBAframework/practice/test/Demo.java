package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://enroll-sandbox.afba.com/");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().to("https://frontline.afba.com/");
	//	driver.navigate().back();
	//	driver.navigate().forward();
		driver.close();
	//	driver.quit();
		
		
		
		
	}

}
