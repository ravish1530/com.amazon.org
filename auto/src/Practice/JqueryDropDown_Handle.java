package Practice;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryDropDown_Handle {

	public static void main(String[] args) {
	 
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32 (3)\\chromedriver.exe");
	      
	      WebDriver  driver =new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       driver.manage().deleteAllCookies();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	       
	       driver.get("http://jqueryscript.net/demo/Drop-Down-Combo-Tree/");
	       
	       
	       driver.findElement(By.id("justAnInputBox")).click();
	       
	      // selectChoiceVlues(driver,"choice 1");
	     selectChoiceVlues(driver,"choice 2","choice 2 3","choice 6","choice 6 2 1","choice 6 2");
	     //   selectChoiceVlues(driver,"all");
	       

	}

	public static void selectChoiceVlues(WebDriver driver, String... value) {
		
	
			List<WebElement> choicelist=driver.findElements(By.xpath("//span[@class=\"comboTreeItemTitle\"]"));
			
			if(!value[0].equalsIgnoreCase("all"))
			{
				for(WebElement item:choicelist) {
					
					String text=item.getText();
					
					for(String val:value) {
						
						if(text.equals(val)) {
							item.click();
							break;
							
						}
					}
				}
			}
			else {
				try {
					for(WebElement item:choicelist) {
						item.click();
					}
				}
				catch(Exception e) 
				{
					
					
				}
				
			}
			
			
			
			
			
		 
			
	}
    
	
}
