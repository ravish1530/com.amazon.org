package Practice;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multipledropdown_handle {

	static WebDriver driver;
	
	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	      
	        driver =new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	       
	       driver.get("https://admirhodzic.github.io/multiselect-dropdown/demo.html");
	        
	       WebElement select1=driver.findElement(By.xpath("//select[@id=\"field1\"]"));
	     
	       selectoptionfromdropdown(select1,"BMW"); 
	       
	       
	       WebElement select2=driver.findElement(By.xpath("//select[@id=\"field2\"]"));
	       select2.click();
	       selectoptionfromdropdown(select2,"Audi");

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
