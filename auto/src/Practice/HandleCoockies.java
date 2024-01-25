package Practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCoockies {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32 (3)\\chromedriver.exe");
	      
	      WebDriver  driver =new ChromeDriver();
	       
	       driver.manage().window().maximize();

	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	       
	              
	       driver.get("http://demo.nopcommerce.com/");
	     
	       //How to capture cookies from browser
	       
	       Set<Cookie> cookies=driver.manage().getCookies();
	       
	       System.out.println("Size of cookie:"+cookies.size());
	       
	       //how to capture cookies from browser
	       for(Cookie list:cookies) {
	    	   
	    	   System.out.println(list.getName()+" : "+list.getValue());
	       }
	       
	       

	}

}
