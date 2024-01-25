package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class handle_dropdown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32 (3)\\chromedriver.exe");
	      
		 ChromeOptions options=new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 options.addArguments("--disable notifications");

		 DesiredCapabilities cp=new DesiredCapabilities();
		 cp.setCapability(ChromeOptions.CAPABILITY, options);
		 
		 options.merge(cp);
		 
	       WebDriver driver =new ChromeDriver(options);
	      
	       //driver.manage().window().maximize();
	      // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	       
	       driver.get("http://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
	       
	       Thread.sleep(8000);
	      WebElement drpdown=driver.findElement(By.xpath("//select[@id=\"select-demo\"]"));
	      drpdown.click();
	       Select drpcountry=new Select(drpdown);
	      // drpcountry.selectByVisibleText("Friday");
	      //drpcountry.selectByValue("Thursday");
	      //drpcountry.selectByIndex(3);
	       
	       //selecting option from drpdown without using methods
	       
	    List<WebElement> alloptions=  drpcountry.getOptions();
	    
	    for(WebElement option:alloptions) {
	    	
	    	if(option.getText().equals("Sunday")){
	    		
	    		option.click();
	    		break;
	    	}
	    	
	    }
	    
	       
	       
	       
	     
	       }
	       

	}


