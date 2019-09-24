package Day10;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class ParallelTestingDiffBrowser {
	WebDriver driver;
	@Parameters("mybrowser")
  @BeforeClass
	  public void beforeClass(String mybrowser) {
		if (mybrowser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver.exe");
	        driver = new FirefoxDriver();
		}else if(mybrowser.equals("chrome")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver.exe");
	        driver = new ChromeDriver();	
		}
		driver.manage().window().maximize();
        driver.get("http://demowebshop.tricentis.com/login");
	  }
  @Test
  public void LoginTest() {
	  driver.findElement(By.id("Email")).sendKeys("mehek5@gmail.com");
      driver.findElement(By.id("Password")).sendKeys("mehek@123");
      driver.findElement(By.xpath("//input[@value='Log in']")).click();
  }
  

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
