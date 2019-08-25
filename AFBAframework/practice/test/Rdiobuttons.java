package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.Driver;

public class Rdiobuttons {

	public static void main(String[] args) {
	

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://enroll-sandbox.afba.com/");
		
//		WebElement select = driver.findElement(By.xpath("//span[@class='fBody']/select"));
//		select.click();
//		select.findElement(By.xpath("//span[@class='fBody']/select/option[6]"));
//		select.click();
		
			
		
//get size() using with findElements
		

		//driver.findElement(By.xpath("//input[@value='Milk']")).click();

		int count =driver.findElements(By.xpath("//input[@name='group1']")).size();

		for(int i=0;i<count;i++)

		{

		//driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();

		String text = driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");

		if(text.equals("Name"))

		{

		driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();

		}
		
	
			
		}

	}

	}

