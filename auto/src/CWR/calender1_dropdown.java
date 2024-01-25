
package CWR;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class calender1_dropdown {

	public static void main(String[] args) {


		ChromeOptions options=new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 options.addArguments("--disable-notifications");

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(options);
		  
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
        
        driver.findElement(By.xpath("//input[@id='dob']")).click();//opens date picker
        
        Select month= new Select(driver.findElement(By.xpath("//select[@aria-label='Select month']")));
        month.selectByVisibleText("Nov");
        
        Select year=new Select(driver.findElement(By.xpath("//select[@aria-label='Select year']")));
        year.selectByVisibleText("2023");
        
        
        String date="15";
        
        List<WebElement> alldates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
        
        for(WebElement ele:alldates)
        {
        	String dt=ele.getText();
        	if(dt.equals(date)) {
        		ele.click();
        		break;
        	}
        }


	}

}
