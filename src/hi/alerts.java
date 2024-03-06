package hi;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class alerts {

	public static void main(String[] args) throws InterruptedException {
    ChromeDriver driver = new ChromeDriver();	
   /* driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    driver.findElement(By.id("name")).sendKeys("yuvasree");
    //driver.findElement(By.id("alertbtn")).click();
    //driver.switchTo().alert().accept();
    driver.findElement(By.id("confirmbtn")).click();
    System.out.println(driver.switchTo().alert().getText());
    driver.switchTo().alert().dismiss();*/
    
   /* ("https://www.southalltravel.co.uk/flights/");
    driver.findElement(By.className("cks")).click();
    //driver.findElement(By.cssSelector("sp-prompt-btn.sp-disallow-btn")).click();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    //Thread.sleep(2000);
    driver.findElement(By.cssSelector(".sp-prompt-btn.sp-accept-btn.sp_notify_prompt")).click();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.switchTo().alert().dismiss();
    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.findElement(By.cssSelector("span.closebtn")).click();
   
   // driver.findElement(By.cssSelector("a[href='/flights/']")).click();*/
   
    driver.get("https://www.mercuryholidays.co.uk/");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    driver.findElement(By.xpath("//span[@class='MuiButton-label'][1]")).click();
    
    
    
    
	}

}
