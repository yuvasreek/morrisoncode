package hi;
import java.time.Duration;

import org.testng.Assert;
import org.testng.asserts.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class morrison {
	
	
	
	
			

	public static void main(String[] args) throws InterruptedException   {
		
		String fname="yuvasree";
		String sname="karuppannan";
		
		
	    System.setProperty("webdriver.chrome.driver","C:\\browserdriver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//String passwords=getpassword(driver); 
		driver.get("https://groceries.morrisons.com/webshop/startWebshop.do");
	    
		 
		driver.findElement(By.cssSelector("button#onetrust-accept-btn-handler")).click();
		driver.findElement(By.cssSelector("input#findText")).sendKeys("milk");
		driver.findElement(By.xpath("//input[@value='GO']")).click();
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.id("postcode")).sendKeys("HP11 1GT");
		driver.findElement(By.cssSelector("input[value='Check']")).click();
		System.out.println(driver.findElement(By.cssSelector("h1.registration__header")).getText());
		Assert.assertEquals(driver.findElement(By.cssSelector("h1.registration__header")).getText(),"Great news, we can deliver to your area.");
		driver.findElement(By.id("firstName")).sendKeys(fname);
		driver.findElement(By.xpath("//input[@placeholder='Surname']")).sendKeys(sname);
		driver.findElement(By.xpath("//input[contains(@placeholder,'Email')]")).sendKeys("mail2yuvasree@gmail.com");
		driver.findElement(By.cssSelector("input#password")).sendKeys("yuvasree");
		driver.findElement(By.cssSelector("input#marketingConsentCheckboxChecked1")).click();
		driver.findElement(By.id("registration-submit-button")).click();
		
	
		
		//driver.findElement(By.className("scribe-lohpSection-welcomeB__buttonContent")).click();
		//driver.findElement(By.linkText("Log in")).click();
		//driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("mail2yuvasree@gmail.com");
		//driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("helo");
		//driver.findElement(By.cssSelector("div#login-submit-button")).click();
	
		//System.out.println(driver.findElement(By.cssSelector("div.info")).getText());
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //driver.findElement(By.cssSelector("a[class*='forgottenPassword']")).click();
		//System.out.println(driver.findElement(By.cssSelector("p.info")).getText());
		//Assert.assertEquals(driver.findElement(By.cssSelector("p.info")).getText(),"Please note: for added security the link can be used once only, and will expire in 24 hours.");
		//driver.findElement(By.xpath("//input[@id='login']")).sendKeys("mail2yuvasree@gmail.com");
		//driver.findElement(By.id("postcode")).sendKeys("HP11 1GT");
		 //driver.findElement(By.id("forgottenPassword-submit-button")).click();
		 
		//System.out.println(driver.findElement(By.id("forgottenPasswordForm.errors")).getText());
		//aarthi//driver.navigate().back();
		
		//driver.findElement(By.linkText("Register")).click();
		//FIXED//aarthi//driver.findElement(By.linkText("/auth-service/sso/forgotten-password"));
		//aarthi//thread vs implicitwait and gettext()not working.
		//aarthi//System.out.println(driver.findElement(By.cssSelector("div.info")).getText());
		
	}
		
	
		//  public static String getpassword(WebDriver driver)	{
			  
		//String password	  =driver.findElement(By.cssSelector("h1.registration__header")).getText(); 
		//String[] array= password.split(",");
		//String passwords=array[0];
		//return passwords;
		
		//  }
			
			
			
			
		
		
	

	}


