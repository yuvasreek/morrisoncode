package hi;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.*;

public class navigators {

	public static void main(String[] args) {
		
		//selenium manager on//System.setProperty("webdriver.edge.driver", "C:\\browserdriver\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("http://google.com");
		driver.navigate().to("https://www.subbuskitchen.com/");
		driver.navigate().back();
		driver.close();
		
		
		

	}

}
