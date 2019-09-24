package MockTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Asgnnt2_DataProvider_Assert {
	WebDriver driver;
  @Test(dataProvider ="registerTest")
  public void Registration(String firstname, String lastname, String email, String password) {
      driver.findElement(By.linkText("Register")).click();
      driver.findElement(By.id("gender-male")).click();
      driver.findElement(By.id("FirstName")).sendKeys(firstname);
      driver.findElement(By.id("LastName")).sendKeys(lastname);
      driver.findElement(By.id("Email")).sendKeys(email);
      driver.findElement(By.id("Password")).sendKeys(password);
      driver.findElement(By.id("ConfirmPassword")).sendKeys(password);
      driver.findElement(By.id("register-button")).click();
      String linktext=driver.findElement(By.linkText(email)).getText();
      Assert.assertEquals(email, linktext);
      driver.findElement(By.linkText("Log out")).click();
  }
  
  @DataProvider
  public Object[][] registerTest(){
      return new Object[][] {
          new Object[] {"manipalglobal0a","demotest10a","manipaltest10a@test.com","manipal0@123"},
          new Object[] {"manipalglobal0b","demotest10b","manipaltest10b@test.com","manipal01@123"},
          new Object[] {"manipalglobal0c","demotest10c","manipaltest10c@test.com","manipal02@123"},
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
