package CWR;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class calender {

	public static void main(String[] args) {


		ChromeOptions options=new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 options.addArguments("--disable-notifications");

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(options);
		    
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
        driver.get("https://www.redbus.in/");
        
        String year="2023";
        String month="Nov";
        String date="20";
        
       driver.findElement(By.xpath("//div[@id=\"onwardCal\"]")).click();
      // driver.findElement(By.xpath("//span[normalize-space()='28']")).click();
        
       while(true) {
        	String monthyear=driver.findElement(By.xpath("//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']//div[2]")).getText();
        	
        	String arr[]=monthyear.split(" ");
        	String mon=arr[0];
        	String yr=arr[1];
        	
        	if(mon.equalsIgnoreCase(month)&& yr.equals(year))
        		break;
        	else
        		driver.findElement(By.xpath("//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']//div[3]//*[name()='svg']")).click();
        }
        //date selection
        List<WebElement> alldates=driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//td"));
        
        for(WebElement ele:alldates) 
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
