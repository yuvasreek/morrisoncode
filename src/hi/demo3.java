package hi;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

import org.openqa.selenium.*;
public class demo3 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.name("name")).sendKeys("yuva");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//label[@for='exampleInputPassword1']//following-sibling::input")).sendKeys("Abcd4");
        driver.findElement(By.xpath("//div[@class='form-check']//child::input")).click();
       WebElement save =  driver.findElement(By.id("exampleFormControlSelect1"));
       Select ss = new Select(save);
       ss.selectByIndex(1);
       driver.findElement(By.id("inlineRadio1")).click();
       driver.findElement(By.name("bday")).sendKeys("03/01/1990");
       driver.findElement(By.cssSelector("input[type='submit']")).click();
	}

}
