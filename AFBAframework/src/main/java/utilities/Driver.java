package utilities;

import io.github.bonigarcia.wdm.WebDriverManager; 
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver; 
import org.openqa.selenium.ie.InternetExplorerDriver;  

enum MyWebDrivers{
	chrome, FireFox, IE, chromeheadless
}

  public class Driver extends TestBase { 
	 
	  public static MyWebDrivers MyDriver;
	  public static String browserType = ConfigurationReader.getProperty("browser").toLowerCase();
	  static {
		  MyDriver = browserType.equals("chrome") ? MyWebDrivers.chrome :browserType.equals("firefox") ? MyWebDrivers.FireFox:
			  browserType.equals("ie") ? MyWebDrivers.IE : MyWebDrivers.chromeheadless;
	  }
 
     private Driver() { 
   } 
 
 
     public static WebDriver getDriver() { 
        if (driver == null) { 
             switch (MyDriver) { 
                case chrome: 
                     WebDriverManager.chromedriver().setup(); 
                    ChromeOptions options = new ChromeOptions(); 
                    options.addArguments("--disable-popup-blocking"); 
                    options.addArguments("start-maximized"); 
                    options.addArguments("test-type"); 
                    options.addArguments("allow-running-insecure-content"); 
                    options.addArguments("disable-extensions"); 
                    options.addArguments("--ignore-certificate-errors"); 
                    options.addArguments("test-type=browser"); 
                    options.addArguments("disable-infobars"); 
                    driver = new ChromeDriver(options); 
                     break; 


                case FireFox: 
                	WebDriverManager.firefoxdriver().setup(); 
                	driver = new FirefoxDriver(); 
                     break; 
               

                case IE: 
                     if (System.getProperty("os.name").toLowerCase().contains("windows10")) { 
                        throw new WebDriverException("Your operating system does not support the requested browser"); 
                    }
                     WebDriverManager.iedriver().setup(); 
                    driver = new InternetExplorerDriver(); 
                     break; 
                     
                     default:
                    	 WebDriverManager.chromedriver().setup(); 
                     driver = new ChromeDriver(new ChromeOptions().setHeadless(true)); 
                     break; 

            } 
         }  
 
        return driver; 
     } 
 
 
     public static void closeDriver() { 
         
             
         act.pause(2000).perform();
         driver.quit(); 
     } 
 } 

	

