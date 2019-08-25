package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testCase2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "\"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://frontline.afba.com/");
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.id("login")).sendKeys("MAbabaikeli");
		driver.findElement(By.name("password")).sendKeys("Test123!");
		
		
		
	}
	
}
