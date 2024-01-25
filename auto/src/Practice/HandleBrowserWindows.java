package Practice;

import java.time.Duration;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleBrowserWindows {

	public static void main(String[] args) {
 
		ChromeOptions options=new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 options.addArguments("--disable-notifications");

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(options);
		  
	       driver.manage().window().maximize();
	       driver.manage().deleteAllCookies();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	       
	       driver.get("https://opensource-demo.orangehrmlive.com/");
	       
	       //getwindowHandle()
	       
	    //   String windowId=driver.getWindowHandle();//return ID of single browser window
	    //   System.out.println(windowId);
	       
	       
	       driver.findElement(By.xpath("//a[text()=\"OrangeHRM, Inc\"]")).click();
	       //getwnidowHandles
	       
	       Set<String>windowIDs=driver.getWindowHandles();//return IDs of multiple browser window
	       
	       //first method-iterator
	       
	     /*  Iterator<String> it=windowIDs.iterator();
	       
	       String parentWindowID=it.next();
	       String childWindowID=it.next();
	       
	       System.out.println("parent window ID:"+parentWindowID);
	       System.out.println("child window ID:"+childWindowID);
	       
	       */
	       //using List/ArrayList
	       
	       List<String> windowIDsList=new ArrayList(windowIDs);//converting set-->List
	       
	      String parentwindowID= windowIDsList.get(0);//parent window id
	      String childwindowID= windowIDsList.get(1);//child window id
	      
	      
	      System.out.println("parent window ID:"+parentwindowID);
	      System.out.println("Child window ID:"+childwindowID);
	      
	      //how to use window IDs for switching
	      
	      driver.switchTo().window(parentwindowID);
	      System.out.println("Parent window title:"+driver.getTitle());
	      
	      driver.switchTo().window(childwindowID);
	      System.out.println("Child window title:"+driver.getTitle());

	       
	       //for each loop
	    /*  for(String winid:windowIDsList) {
	    	  
	    	 String title= driver.switchTo().window(winid).getTitle();
	    	 System.out.println(title);
	      }
	       */
	       
	       //driver.close(); close single browser window driver which is pointing
	       //driver.quite(); close all the browser windows
	       
	       //close window by choice
	       for(String winid:windowIDsList) {
		    	  
		    	 String title= driver.switchTo().window(winid).getTitle();
		    	  if(title.equals("OrangeHRM")) {
		    		  driver.close();
		    	  }
		      }
	       
	       
	       
	}

}
