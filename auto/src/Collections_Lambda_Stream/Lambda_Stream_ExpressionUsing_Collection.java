package Collections_Lambda_Stream;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Lambda_Stream_ExpressionUsing_Collection {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 options.addArguments("--disable-notifications");

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(options);
		    
       driver.manage().window().maximize();
       
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
       
       driver.get("https://www.flipkart.com");
       
       driver.switchTo().newWindow(WindowType.TAB);
       
       driver.get("https://www.facebook.com");
       
      Set<String>winID= driver.getWindowHandles();
      
    /*  for(String win:winID) {
    	  
    	  System.out.println( driver.switchTo().window(win).getTitle());
    	
      }*/
      
      //using lambda expression 
      
      winID.forEach(win->System.out.println(driver.switchTo().window(win).getTitle()) );
      
      
      
      
      
      
      
      
      
      
      

	}

}
