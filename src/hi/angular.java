package hi;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class angular {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.cssSelector("input[minlength='2']")).sendKeys("yuvasree");
		driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("passWord1");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement box = driver.findElement(By.id("exampleFormControlSelect1"));
	    Select ss = new Select(box);
		ss.selectByIndex(1);
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("03/01/1992");
		
		driver.findElement(By.cssSelector("input[value='Submit']")).click();
		System.out.println(driver.findElement(By.cssSelector("div.alert.alert-success.alert-dismissible")).getText());
		
		

	}

}
