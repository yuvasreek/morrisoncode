package hi;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.*;

public class wait {

	public static void main(String[] args) throws InterruptedException {
		
        
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        
		driver.findElement(By.cssSelector("input#username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("input#password")).sendKeys("learning");
		driver.findElement(By.id("usertype")).click();
		WebElement store = driver.findElement(By.cssSelector("select.form-control"));
		Select ss = new Select(store);
		ss.selectByIndex(2);
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		Thread.sleep(3000);
		String[] phones = {"iphone X","Samsung Note 8","Nokia Edge","Blackberry"};
		List<WebElement> phoneslist =  driver.findElements(By.cssSelector("h4.card-title"));
		                    System.out.println(  phoneslist.size());
		              
		                      for(int i=0;i<phoneslist.size();i++) {
		                    	  
		                    	String shop = phoneslist.get(i).getText();
		                    	
		                    	List<String> phoness = Arrays.asList(phones);
                                  int j=0;
		                    	  if(phoness.contains(shop)) {
		                    		  
		                    		  driver.findElements(By.cssSelector("button.btn.btn-info")).get(i).click();  
		                    	      j++;
		                    		 if(j==4) {
		                    			 break;
		                    		 }
		                    	  }
		                      }
		                      Thread.sleep(3000);
		driver.findElement(By.cssSelector("a.nav-link.btn.btn-primary")).click();
		
		
		
		
		
		
		
	}

}
