package hi;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class demo4 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");	
	   /* driver.findElement(By.id("checkBoxOption3")).click();
		String text = driver.findElement(By.cssSelector("label[for='honda']")).getText();
		WebElement ddown = driver.findElement(By.id("dropdown-class-example"));
		Select ss = new Select(ddown);
		ss.selectByVisibleText(text);
		 driver.findElement(By.id("name")).sendKeys(text);
		 driver.findElement(By.id("alertbtn")).click();
		 String atext = driver.switchTo().alert().getText();
		 
		 if(atext.contains(text)) {
			 System.out.println("success");
		 }
		 else {
			 System.out.println("failed");
		 }*/
		 List<WebElement> linksinpage = driver.findElements(By.tagName("a"));
		 System.out.println(linksinpage.size());
		 
		WebElement footerdriver =driver.findElement(By.id("gf-BIG"));
		List<WebElement> linksinfoot = footerdriver.findElements(By.tagName("a"));
		System.out.println(linksinfoot.size());
		
		WebElement columndriver = footerdriver.findElement(By.xpath("//td[1]/ul"));
		List<WebElement> collinks =  columndriver.findElements(By.tagName("a"));
		System.out.println(collinks.size());
         
		String key = Keys.chord(Keys.CONTROL,Keys.ENTER);
		
		for(int i=1;i<collinks.size();i++) {
			collinks.get(i).sendKeys(key);
		}
		
		Set<String> windows = driver.getWindowHandles();
		
		Iterator<String> it = windows.iterator();
		
		while(it.hasNext()) {
			
			String window = it.next();
			     System.out.println( driver.switchTo().window(window).getTitle());
		}

		
		
		
	}

}
