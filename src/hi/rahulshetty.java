package hi;
import java.util.List;

import org.testng.Assert;
import org.testng.asserts.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class rahulshetty {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		//driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//driver.findElement(By.id("checkBoxOption1")).click();
		/*int i=1;
		while(i<3) {
		driver.findElement(By.id("checkBoxOption1")).click();
		i++;
		

	}
		 System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());*/
		
		/*driver.findElement(By.cssSelector("select[name*='DropDownListCurrency']")).click();
		driver.findElement(By.cssSelector("option[value='USD']")).click();*/
		WebElement staticdropdown = driver.findElement(By.cssSelector("select[name*='DropDownListCurrency']"));
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByValue("AED");
		//dropdown.selectByVisibleText("USD");
		//dropdown.selectByIndex(0);
		driver.findElement(By.xpath("//div[@class='paxinfo']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("span#hrefIncAdt")).click();
		
		for(int i=1;i<4;i++) {
			
			driver.findElement(By.cssSelector("span#hrefIncAdt")).click();	
			
		}

		
		System.out.println(driver.findElement(By.xpath("//div[@class='paxinfo']")).getText());
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		driver.findElement(By.cssSelector("input[id*=originStation1_CTXT]")).click();
		driver.findElement(By.cssSelector("a[value='AIP']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.cssSelector("input[id*=destinationStation1_CTXT")).click();
		//driver.findElement(By.cssSelector("a[value='MAA']")).click();
		//driver.findElement(By.cssSelector("a[value='BLR']")).click();
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		//aarthi//driver.findElement(By.xpath("//td[@class='mapbg'][1] //a[@value='MAA']")).click();
		/*driver.findElement(By.id("autosuggest")).sendKeys("sau");
		Thread.sleep(3000);
		
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		
		for(WebElement option : options) {
			
			if(option.getText().equalsIgnoreCase("saudi Arabia")) {
				option.click();
			break;
			
				
			}
			
		}*/
		
		//driver.findElement(By.className("ui-state-highlight")).click();
		driver.findElement(By.linkText("27")).click();
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		//driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("Style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("Style"));
		if(driver.findElement(By.id("Div1")).getAttribute("Style").contains("1")) {
			Assert.assertTrue(true);
			System.out.println("true");
		}
		 
}
}