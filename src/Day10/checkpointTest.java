package Day10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checkpointTest {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://demowebshop.tricentis.com/login"); 
        
        String ExpectedTitle = "webshop login";
        String ActualTitle=driver.getTitle();
        if (ActualTitle.equals(ExpectedTitle)) {
        	System.out.println("Test is Passed");
        }
        	else
        		{
        		System.out.println("Test is failed");
        }

	}

}
