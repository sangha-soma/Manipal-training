package MockTest;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtntRept {

	public static void main(String[] args) {
		ExtentReports extent;
        ExtentTest logger;
        extent = new ExtentReports(System.getProperty("user.dir")+"/test-output/sg916t.html");
        extent.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));
        logger = extent.startTest("First Test");
        System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://newtours.demoaut.com/mercurywelcome.php");
        driver.manage().window().maximize();
        String unerConsTitle="Under Construction: Mercury Tours";
        List <WebElement> links=driver.findElements(By.tagName("a"));
        System.out.println("number of links present in home page "+links.size());
        String[] linkTexts= new String[links.size()];
        int i=0;
        for (WebElement e:links) {
            linkTexts[i]=e.getText();
            i++;
        }
        for (String t:linkTexts) {
            driver.findElement(By.linkText(t)).click();
            if (driver.getTitle().equals(unerConsTitle))
            {
                System.out.println( "\""+ t + "\"" + "\" is under construction");
                logger.log(LogStatus.FAIL, t);
            }else
            {
                System.out.println( "\""+ t + "\"" + "\" is working");
                logger.log(LogStatus.PASS, t);
            }
            driver.navigate().back();
        }
        driver.quit();
        extent.endTest(logger);
        extent.flush();
        extent.close();


	}

}
