package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleCheckbox {

	public static void main(String[] args) {
		 
		ChromeOptions options=new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 options.addArguments("--disable-notifications");

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
	   
	       driver.manage().window().maximize();
	       driver.manage().deleteAllCookies();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	       
	       driver.get("http://demo.seleniumeasy.com/basic-checkbox-demo.html");
	       
	       //select specific check box
	       
	      // driver.findElement(By.xpath("//input[@id=\"monday\"]")).click();
	       
	       //select all the check boxes
	       List<WebElement> chechboxes=driver.findElements(By.xpath("//input[@class=\"cb1-element\"]"));
	       
	       System.out.println("Total number of Check boxes:"+chechboxes.size());
	       
	       //using for loop
	     /*  for(int i=0;i<=chechboxes.size();i++) {
	    	   
	    	   chechboxes.get(i).click();
	       }*/
	       
	       //using for each loop
	       
	      /* for(WebElement chbox:chechboxes) {
	    	   
	    	   chbox.click();
	       }*/
	       
	       //select multiple check box by choice
	       
         /*   for(WebElement chbox:chechboxes) 
            {
	    	   
	    	   String name=chbox.getAttribute("id");
	    	   
	    	   if(name.equals("monday")||name.equals("sunday")) {
	    		   chbox.click();
	    	   }
	       }
            */
	       
            //select last 2 check box
           
            int totalcheckbox=chechboxes.size();
            for(int i=totalcheckbox-2;i<totalcheckbox;i++)//7-2=5 will be starting index
            {
          //  	chechboxes.get(i).click();
            }
            
            //select first 2 check boxes
            
            for(int i=0;i<totalcheckbox;i++) {
            	
            	if(i<3 ) {
            		chechboxes.get(i).click();
            	}
            
            }
	} 

}
