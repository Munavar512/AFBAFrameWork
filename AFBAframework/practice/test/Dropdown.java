package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://frontline.afba.com/");
		
		Select s= new Select(driver.findElement(By.id("//*[@id=\"zz6_RootAspMenu\"]/li[2]")));
//		Thread.sleep(2000);
		
		for(int i=1; i<5; i++) {
			driver.findElement(By.id("zz6_RootAspMenu")).click();
		}
		
			driver.findElement(By.id("idName")).click();
		
		s.selectByValue("2");
		s.selectByIndex(4);
		s.selectByVisibleText("Departments");
		
		Select s1 = new Select(driver.findElement(By.xpath("//*[@id='cases_table_length']/label/select")));
		s1.selectByIndex(3);
		
		driver.findElement(By.xpath("//*[@id=\"cases_table_length\"]/label/select/option[3]")).click();
		for(int i=1; i<5; i++) {
			driver.findElement(By.id("zz6_RootAspMenu")).click();
		}
		
		//Directly click 
		driver.findElement(By.id("element")).click();
		
		
	}

}
