package hi;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.*;

import java.time.Duration;

import org.openqa.selenium.*;
public class locatorss {

	public static void main(String[] args) {
	   
		System.setProperty("webdriver.chrome.driver", "C:\\browserdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.co.uk/");
		driver.findElement(By.id("sp-cc-accept")).click();
		driver.findElements(By.linkText("/ref=nav_ logo"));
		driver.findElement(By.cssSelector("span.nav-line-2")).click();
		driver.findElement(By.cssSelector("input#GLUXZipUpdateInput")).sendKeys("HP11 1GT");
	
		driver.findElement(By.xpath("//input[@aria-labelledby='GLUXZipUpdate-announce']")).click();
		Assert.assertequals

	

	}
}