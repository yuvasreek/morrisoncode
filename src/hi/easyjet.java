package hi;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class easyjet {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.co.uk/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		
		

		
		//cookies
		driver.findElement(By.cssSelector("input#sp-cc-accept")).click();
		
		//CHECKBOX
		/*driver.findElement(By.id("twotabsearchtextbox")).sendKeys("baby");
		driver.findElement(By.cssSelector("div[aria-label='baby monitor']")).click();
		Thread.sleep(2000);
		List<WebElement> check = driver.findElements(By.cssSelector("input[type='checkbox']"));
		System.out.println(check.size());
		driver.findElement(By.xpath("//span[text()='Get It Tomorrow']")).click();
		driver.findElement(By.xpath("//span[text()='Surveillance Cameras']")).click();
		driver.findElement(By.cssSelector("[aria-label='4 Stars & Up']")).click();
		driver.findElement(By.cssSelector("input[placeholder='Min']")).sendKeys("100");
		driver.findElement(By.cssSelector("input[placeholder='Max']")).sendKeys("200");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("span[class='a-button a-spacing-top-mini a-button-base s-small-margin-left']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("New")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='a-dropdown-prompt'][1]")).click();
		driver.findElement(By.linkText("Price: High to low")).click();
		
		//Thread.sleep(2000);
		//System.out.println(driver.findElement(By.xpath("//span[text()='Get It Tomorrow']")).isSelected());
		
		
		
		
		
		
		
		
		//ADD TO CART DOUBT
		/*driver.findElement(By.id("twotabsearchtextbox")).sendKeys("baby");
		driver.findElement(By.cssSelector("div[aria-label='baby monitor']")).click();
		driver.findElement(By.xpath("//span[text()='Dreo Baby Monitor, 5 Inches 720P HD Split Screen Video Baby Monitor with Camera and Audio, Infrared Night Vision, 2-Way Talk, Remote PTZ, 300M Range, Rechargeable Battery, VOX, Connect up to 4 cameras']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("add-to-cart-button")).click();
		
		//mouse hover
		/*WebElement song = driver.findElement(By.id("icp-nav-flyout"));
		Actions action = new Actions(driver);
		action.moveToElement(song).perform();
		driver.findElement(By.xpath("//div[text()='Change country/region']")).click();
		driver.findElement(By.cssSelector("span[class='a-dropdown-prompt']")).click();
		driver.findElement(By.id("icp-dropdown_20")).click();
		
		
		WebElement wed = driver.findElement(By.id("nav-link-accountList"));
		Actions action1 = new Actions(driver);
		action.moveToElement(wed).perform();
		driver.findElement(By.linkText("Wedding List")).click();
		
	
		
		//hamburger
		/*driver.findElement(By.id("nav-hamburger-menu")).click();
		WebElement hand = driver.findElement(By.linkText("Handmade"));
		Actions act = new Actions(driver);
		act.moveToElement(hand);
		act.perform();
		driver.findElement(By.linkText("Find a Gift")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Gifts for Pets")).click();
		
		
		
		//search product
		/*driver.findElement(By.id("twotabsearchtextbox")).sendKeys("baby");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.cssSelector("div[aria-label='baby monitor']")).click();*/
		 
		//key move down not mouse 
	  /* driver.findElement(By.id("twotabsearchtextbox")).sendKeys("baby");
	   Thread.sleep(1000);
	   driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ARROW_DOWN);
	   driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);*/
		
		
		//keyboard action and mouse
		/*Actions act = new Actions(driver);
		WebElement store = driver.findElement(By.id("twotabsearchtextbox"));
		act.moveToElement(store).click().keyDown(Keys.SHIFT).sendKeys("baby").doubleClick().build().perform();
		act.moveToElement(store).contextClick().build().perform(); //right click
		
	    
	    
	
		
		
		//signin
		/* driver.findElement(By.id("nav-link-accountList")).click();
		 driver.findElement(By.id("ap_email")).sendKeys("mail2yuvasree@gmail.com");
		 driver.findElement(By.id("continue")).click();
		 driver.findElement(By.id("ap_password")).sendKeys("Yuvasree@3");
		 driver.findElement(By.id("signInSubmit")).click();
		 driver.findElement(By.id("ap_password")).sendKeys("Yuvasree@3");
	//CHECKMATE	 driver.findElement(By.id("auth-captcha-guess")).sendKeys("");
		 //newaccount try with existing mailid
		/* driver.findElement(By.id("createAccountSubmit")).click();
		 driver.findElement(By.id("ap_customer_name")).sendKeys("yuvasree karuppannan");
		 driver.findElement(By.id("ap_email")).sendKeys("mail2yuvasree@gmail.com");
		 driver.findElement(By.id("ap_password")).sendKeys("Yuvasree@3");
		 driver.findElement(By.id("ap_password_check")).sendKeys("Yuvasree@3");
		 driver.findElement(By.id("continue")).click();
		 driver.findElement(By.linkText("this e-mail address")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.linkText("Create a new account anyway")).click();
		 driver.findElement(By.id("ap_customer_name")).sendKeys("yuvasree karuppannan");
		// driver.findElement(By.id("ap_email")).sendKeys("mail2yuvasree@gmail.com");
		 driver.findElement(By.id("ap_password")).sendKeys("Yuvasree@3");
		 driver.findElement(By.id("ap_password_check")).sendKeys("Yuvasree@3");
		 driver.findElement(By.id("continue")).click();
		 driver.findElement(By.id("home_children_button")).click();
		 
		 
		 
		 
		 
		/* driver.findElement(By.id("ap_email")).sendKeys("mail2yuvasree@gmail.com");
		 driver.findElement(By.id("continue")).click();
		 driver.findElement(By.id("ap_password")).sendKeys("yuvasree");
		 driver.findElement(By.id("signInSubmit")).click();
		 System.out.println(driver.findElement(By.id("auth-error-message-box")).getText());
		 driver.findElement(By.linkText("Forgot Password")).click();
		 
		 driver.findElement(By.name("otc-1")).sendKeys("6");
		 driver.findElement(By.name("otc-2")).sendKeys("5");
		 driver.findElement(By.name("otc-3")).sendKeys("0");
		 driver.findElement(By.name("otc-4")).sendKeys("1");
		 driver.findElement(By.name("otc-5")).sendKeys("2");
		 driver.findElement(By.name("otc-6")).sendKeys("3");
		 driver.findElement(By.id("cvf-submit-otp-button-announce")).click();*/
		 
		// currency dropdown
		/*driver.findElement(By.cssSelector("a[id='icp-nav-flyout']")).click();
		driver.findElement(By.id("icp-currency-dropdown-selected-item-prompt")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("SEK")).click();
		
		
		driver.findElement(By.cssSelector("input[aria-labelledby='icp-save-button-announce']")).click();
		
		
		
		
		//all dropdown
		/*WebElement ddown = driver.findElement(By.id("searchDropdownBox"));
		Select store =  new Select(ddown);
	    store.selectByIndex(4);
	    store.selectByValue("search-alias=amazonfresh");
		store.selectByVisibleText("Baby");*/
		
		
		//select address
        /*driver.findElement(By.id("nav-global-location-popover-link")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("GLUXCountryValue")).click();
       WebElement uae =  driver.findElement(By.id("GLUXCountryList_229"));
       Actions action = new Actions(driver);
       action.moveToElement(uae);
       action.perform();
       
       driver.findElement(By.id("GLUXCountryList_226")).click();
        
         //postcode
		/*driver.findElement(By.id("GLUXZipUpdateInput")).sendKeys("HP11 1GT");
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[@id='GLUXZipUpdate']")).click();*/
		 
		 
		 
		 
	}

}
