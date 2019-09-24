package Day9;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dependency {
	WebDriver driver;
    @Test
    public void LoginTest() {
        driver.findElement(By.id("Email")).sendKeys("sguru1@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("xxxx@123");
        driver.findElement(By.xpath("//input[@value='Log in']")).click();
        String expected= "sguru1@gmail.com";
        String actual =driver.findElement(By.linkText("sguru1@gmail.com")).getText();
        Assert.assertEquals(actual,expected);
    }
    
    @Test(dependsOnMethods="LoginTest",alwaysRun=true)
    public void LogoutTest() {
        driver.findElement(By.linkText("Log out")).click();
        
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
        //driver.close();
    }
}
