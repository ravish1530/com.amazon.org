package POM_DDF_TestNG_withmandatory_classes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {

	WebDriver driver;
	public void configurebrowser() {
		

		 System.setProperty("webdriver.edge.driver", "C:\\Automation\\edgedriver_win64\\msedgedriver.exe");
         driver = new EdgeDriver();
        
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.flipkart.com/");

	}
	
}
