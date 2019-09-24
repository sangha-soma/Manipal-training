package Day13;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestcaseLg {

	public static void main(String[] args) {
		Logger log= Logger.getLogger("Test");
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/login");
		log.info("Browser is opened");
		String title=driver.getTitle();
		log.info(title);

	}

}
