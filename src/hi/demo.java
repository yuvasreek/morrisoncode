package hi;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.*;

public class demo {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		WebElement save = driver.findElement(By.linkText("Typos"));
		Actions act = new Actions(driver);
		act.moveToElement(save);
		act.perform();
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.linkText("Click Here")).click();
		Set <String> store = driver.getWindowHandles();
		
		Iterator<String> it = store.iterator();
		String parent = it.next();
		String child = it.next();
		
		driver.switchTo().window(child);
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//h3[text()='New Window']")).getText());
		
		driver.switchTo().window(parent);
		System.out.println(driver.findElement(By.xpath("//h3[text()='Opening a new window']")).getText());
		
		
		
		

	}

}
