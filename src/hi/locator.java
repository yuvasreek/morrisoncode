package hi;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.*;
public class locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\browserdriver\\chromedriver.exe");
		//ChromeOptions options = new ChromeOptions();
		//options.addExtensions(new File("C:/Users/pponn/AppData/Local/Google/Chrome/User Data/Default/Extensions/"));
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.next.co.uk/secure/account/Login");
		//driver.findElement(By.name("EmailOrAccountNumber")).sendKeys("mail2yuvasree");
		//driver.findElement(By.id("Password")).sendKeys("yuvasree");
		//driver.findElement(By.className("btn-sign-in")).click();
		//?not unique//error//System.out.println(driver.findElement(By.cssSelector("div.msgBody")).getText());
		//driver.findElement(By.className("link-btn")).click();
		//driver.findElement(By.cssSelector("input#EmailOrAccountNumber")).sendKeys("hi");
		//driver.findElement(By.cssSelector("input.btn-sign-in")).click();
		//driver.findElement(By.cssSelector("input.btn-sign-in")).click();
	
		
		
		
	}

}
