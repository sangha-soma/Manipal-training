package Day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Assertclass {
  WebDriver driver;
  @Test
  public void LoginTest() {
	  driver.findElement(By.id("Email")).sendKeys("manipal4@gmail.com"); // to send email address
	  driver.findElement(By.id("Password")).sendKeys("manipal"); // to enter password
  }
}
