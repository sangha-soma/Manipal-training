package Day10;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Synchronization_ImplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://demowebshop.tricentis.com/login");
        driver.findElement(By.id("Email")).sendKeys("mehek5@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("mehek@123");
        driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String link=driver.findElement(By.linkText("mehek5@gmail.com")).getText();
        System.out.println(link);

	}

}
