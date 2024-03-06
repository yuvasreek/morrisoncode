package hi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.*;


public class demo2 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		WebElement save = driver.findElement(By.linkText("Typos"));
		Actions act = new Actions(driver);
		act.moveToElement(save);
		act.perform();
		driver.findElement(By.linkText("Nested Frames")).click();
		
		
		driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-top']")));
		driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-middle']")));
		System.out.println(driver.findElement(By.id("content")).getText());
		
		
		
		

	}

}
