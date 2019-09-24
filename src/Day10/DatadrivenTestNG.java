package Day10;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class DatadrivenTestNG {
	WebDriver driver;
	  @Test (dataProvider ="registerTest")
	  public void Register(String firstname, String lastname, String email, String password) {
	      driver.findElement(By.linkText("Register")).click();
	      driver.findElement(By.id("gender-male")).click();
	      driver.findElement(By.id("FirstName")).sendKeys(firstname);
	      driver.findElement(By.id("LastName")).sendKeys(lastname);
	      driver.findElement(By.id("Email")).sendKeys(email);
	      driver.findElement(By.id("Password")).sendKeys(password);
	      driver.findElement(By.id("ConfirmPassword")).sendKeys(password);
	      driver.findElement(By.id("register-button")).click();
	      driver.findElement(By.linkText("Log out")).click();
	  }
	  
	  @DataProvider
	  public Object[][] registerTest(){
	      return new Object[][] {
	          new Object[] {"manipalglobal2","demotest2","manipaltest2@test3.com","manipal2@123"},
	          new Object[] {"manipalglobal21","demotest21","manipaltest21@test4.com","manipal2@123"},
	      };
	      
	      
	  }
	 
	@BeforeClass
	  public void beforeClass() {
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://demowebshop.tricentis.com/login"); 
	  }
	  @AfterClass
	  public void afterClass() {
	      driver.close();
	  }
}