package hi;
import java.time.Duration;
import org.openqa.selenium.*;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class greenkart {

	public static void main(String[] args)  {
		WebDriver driver=new ChromeDriver();
	
		String[] productsNeeded= {"iphone X","Samsung Note 8","Nokia Edge","Blackberry"};
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("//label[2]/span[2]")).click();
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.className("btn-success")));
		
		driver.findElement(By.className("btn-success")).click(); 
		
	
		//driver.findElement(By.cssSelector("select[data-style='btn-info']")).click();
	
		
		WebElement ddown = driver.findElement(By.cssSelector("select[data-style='btn-info']"));
		
		
		Select what = new Select(ddown);
		WebDriverWait Y = new WebDriverWait(driver,Duration.ofSeconds(5));
		Y.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("select[data-style='btn-info']")));
	
		what.selectByIndex(2);
		driver.findElement(By.id("signInBtn")).click();
	//add-	button class =btn btn-info;
		
	    List<WebElement> products=driver.findElements(By.xpath("//div/h4/a"));
	    System.out.println(products.size());
	    
	    for(int i=0;i<products.size();i++) {
	   	
	        products.get(i).getText();
	        driver.findElements(By.className("btn-info")).get(i).click();
	    	  
	    	  
	    	 
	      }
	       driver.findElement(By.cssSelector("a.nav-link.btn.btn-primary")).click();
	    	
	    }
		
		
		
		
		
		
	
			}
			
		}
		

	


