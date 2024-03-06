package hi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.*;


public class green {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(2000);
		List<WebElement> veg = driver.findElements(By.cssSelector("h4.product-name"));
		String[] shop = {"Brocolli - 1 Kg","Tomato - 1 Kg","Cucumber - 1 Kg"};
		
		

		

for(int i=0;i<veg.size();i++) {
	
   String veggies =veg.get(i).getText();
   List<String> shoplist = Arrays.asList(shop);
   int j=0;
   
	if(shoplist.contains(veggies)) {
		j++;
		driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
		
		if(j==3) {
			break;
		}
		
	}
	

}
}
}