package hi;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.*;
public class helo {
	


	

		public static void main(String[] args) {
			//System.setProperty("webdriver.chrome.driver", "C:\\browserdriver\\chromedriver.exe");
			//System.setProperty("webdriver.gecko.driver", "C:\\browserdriver\\geckodriver.exe");
					
			System.setProperty("webdriver.edge.driver", "C:\\browserdriver\\msedgedriver.exe");
			
			
	     // WebDriver driver = new ChromeDriver();
			//WebDriver driver = new FirefoxDriver();
			WebDriver driver = new EdgeDriver();
	      driver.get("http://www.facebook.com");
	      System.out.println(driver.getTitle());
	      System.out.println(driver.getCurrentUrl());
	      
	      
	      
	      
	     
		}

	}

	
	
	
	
	
	
	
	
	
	
	


