package SeleniumPractice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class Check_sorted_orNot {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32 (3)\\chromedriver.exe");
	      
		 ChromeOptions options=new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 options.addArguments("--disable-notifications");

		 DesiredCapabilities cp=new DesiredCapabilities();
		 cp.setCapability(ChromeOptions.CAPABILITY, options);
		 
		 options.merge(cp);
		 
	    WebDriver driver =new ChromeDriver(options);
	      
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	       
	       driver.get("https://twoplugs.com/");
	       
	       driver.findElement(By.xpath("//a[text()=\"Live Posting\"]")).click();
	       
	      WebElement drpelement= driver.findElement(By.name("category_id"));
	      
	      Select drpselect= new Select(drpelement);
	      
	      List<WebElement>option=drpselect.getOptions();
	      
	      ArrayList orignallist=new ArrayList();
	      ArrayList templist=new ArrayList();
	      
	      for(WebElement opt:option) {
	    	  
	    	
	    	  orignallist.add(opt.getText());
	    	  templist.add(opt.getText());
	      }
	      
	      System.out.println("original list:"+orignallist);
	      System.out.println("temp list:"+templist);
	      
	      Collections.sort(templist);// sorting
	      
	      System.out.println("original list:"+orignallist);
	      System.out.println("temp list after sorting:"+templist);
	      
	       if(orignallist.equals(templist)) {
	    	   
	    	   System.out.println("DropDown Sorted..");
	       }
	       else {
	    	   System.out.println("DropDown Unsorted..");
	       }
	}

}
