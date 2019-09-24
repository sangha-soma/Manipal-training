package MockTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment1_countLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
	    driver = new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.get("http://demowebshop.tricentis.com/login"); 
	    String unerConsTitle="Under Construction: Mercury Tours";
	    List <WebElement> links=driver.findElements(By.tagName("a"));
	    
	    System.out.println("number of links present in home page "+links.size());
	    String[] linkTexts = new String[links.size()];
	    int i=0;
	    for (WebElement e:links) {
	    	linkTexts[i]=e.getText();
	    	i++;
	    }
	    
	    for (String t:linkTexts) {
	    	driver.findElement(By.linkText(t)).click();
	    	if (driver.getTitle().equals(unerConsTitle))
	    	{
	    		System.out.println("\""+ t + "\"" + "\" is under construction");
	    	}else
	    	{
	    		System.out.println("\""+ t + "\"" + "\" is working");
	    	}
	    }
	}

}
