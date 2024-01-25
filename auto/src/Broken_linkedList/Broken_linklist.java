package Broken_linkedList;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Broken_linklist {

 
	public static void main(String[] args) throws InterruptedException, IOException {
		 

		ChromeOptions options=new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 options.addArguments("--disable-notifications");

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver	driver=new ChromeDriver(options);
		  
	       driver.manage().window().maximize();
	       
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	       
	       driver.get("https://demo.guru99.com/test/newtours/");
	       
	       Thread.sleep(3000);
	       
	       //capture links from webpage
	       
	       List<WebElement> list=driver.findElements(By.tagName("a"));
	       
	       //number of links
	       System.out.println(list.size());
	       
	       for(int i=0;i<list.size();i++)
	       {
	    	   //by using href attribute we can get url of required link
	    	   
	    	   WebElement element=list.get(i); 
	    	   String url=element.getAttribute("href");
	    	   
	    	   
	    	   URL link=new URL(url);
	    	   
	    	   //create a connection using url object 'link'
	    	   HttpURLConnection httpconn=(HttpURLConnection)link.openConnection();
	    	   
	    	   Thread.sleep(2000);
	    	   httpconn.connect();
	    	   
	    	  int rescode= httpconn.getResponseCode();//return response if res code is above 400:broken link
	    	   
	    	  if(rescode>=400)
	    	  {
	    		  System.out.println(url+" - "+" is broken link");
	    		  
	    	  }else {
	    		  System.out.println(url+" - "+" is valid link");
	    	  }
	    	   
	       }
	       
	       
	}

}
