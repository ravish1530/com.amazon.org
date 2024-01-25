package SeleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DatePicker {

	WebDriverWait wait;
	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 options.addArguments("--disable-notifications");

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		String year="2023";
		String month="November";
		String date="15";
		
		
		
		driver.findElement(By.xpath("//span[@class=\"ng-tns-c58-10 ui-calendar\"]")).click();
		
		
	
		while(true) {
			
			
			String mon = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month ng-tns-c58-10 ng-star-inserted\"]")).getText();
	        String yr= driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year ng-tns-c58-10 ng-star-inserted\"]")).getText();
          
	        
			
			if(mon.equalsIgnoreCase(month) && yr.equals(year))
				break;
			
			else
				driver.findElement(By.xpath("//span[@class=\"ui-datepicker-next-icon pi pi-chevron-right ng-tns-c58-10\"]")).click();
		}
		 
		
	List<WebElement>alldate=driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar ng-tns-c58-10\"]//td//a"));
	
	for(WebElement ele:alldate) 
    {
    	String dt=ele.getText();
    	if(dt.equals(date))
    	{
    		ele.click();
    		break;
    	}
		}
	}

	}
