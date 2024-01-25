package Practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
 
		
		ChromeOptions options=new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 options.addArguments("--disable-notifications");

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(options);
		     
	       driver.manage().window().maximize();
	       driver.manage().deleteAllCookies();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	       
	       driver.get("http://www.deadlinkcity.com/");
	       
	       List<WebElement>links=driver.findElements(By.tagName("a"));
	       
	       int brokenlinks=0;
	       
	       for(WebElement link:links) {
	    	   
	    	   String url=link.getAttribute("href");
	    	   if(url==null || url.isEmpty()) {
	    		   
	    		   System.out.println("URL is empty");
	    		   continue;
	    	   }
	    	   
	    	   URL link1=new URL(url);
	    	   try
	    	   {
	    	   HttpURLConnection httpconnection=(HttpURLConnection) link1.openConnection();
	    	   
	    	   httpconnection.connect();
	    	   if(httpconnection.getResponseCode()>=400) {
	    		   System.out.println(httpconnection.getResponseCode()+url+" is"+" Broken Link");
	    		   brokenlinks++;
	    	   }
	    	   else {
	    		   
	    		   System.out.println(httpconnection.getResponseCode()+url+" is"+" Valid Link");

	    	   }
	       }
	       catch(Exception e) {
	    	   
	    	   
	       }
	       
	}
	       System.out.println("Number Of Broken Links:"+brokenlinks);
	       driver.quit();
}
	
}