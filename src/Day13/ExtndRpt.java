package Day13;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtndRpt {

	public static void main(String[] args) {
		ExtentReports extent;
		ExtentTest logger;
		extent = new ExtentReports(System.getProperty("user.dir")+"/test-output/sg916t.html", true);
		extent.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));
		logger =extent.startTest("First Test");
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/login");
		String title=driver.getTitle();
		logger.log(LogStatus.PASS, title);
		extent.endTest(logger);
		extent.flush();
		extent.close();
	}

}
