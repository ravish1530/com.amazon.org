package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class multipladropdown1_handle {
   static WebDriver driver;
	public static void main(String[] args) {

		ChromeOptions options=new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 options.addArguments("--disable-notifications");

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver(options);
		  
       driver.manage().window().maximize();
      // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       
       driver.get("https://www.facebook.com/");
       WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(20));
       
       WebElement element= mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=\"Create new account\"]")));
       
	     //  element.click();
	       
	       Actions act=new Actions(driver);
	       act.moveToElement(element).click(element);
	       
      // driver.findElement(By.xpath("//a[text()=\"Create New Account\"]")).click();
       
      WebElement day= driver.findElement(By.id("day"));
      selectoptionfromdropdown(day,"13");
      
      WebElement month= driver.findElement(By.id("month"));
      selectoptionfromdropdown(month,"Dec");
      
      WebElement year=driver.findElement(By.id("year"));
      selectoptionfromdropdown(year,"2022");
        
	}
    public static void selectoptionfromdropdown (WebElement ele,String value) {
		
		Select drp=new Select(ele);
		
		List<WebElement> alloptions=drp.getOptions();
		
		for(WebElement option:alloptions) {
			if(option.getText().equals(value)) {
				
				option.click();
				break;
			}
		}
}
}
