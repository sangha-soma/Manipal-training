package Day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization_ExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
        driver.get("http://demowebshop.tricentis.com/login");
        driver.findElement(By.id("Email")).sendKeys("mehek5@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("mehek@123");
        driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
        WebDriverWait delay= new WebDriverWait(driver, 10);
        delay.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("mehek5@gmail.com")));
        String link=driver.findElement(By.linkText("mehek5@gmail.com")).getText();
        System.out.println(link);
	}

}
