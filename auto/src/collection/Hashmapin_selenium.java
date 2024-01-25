package collection;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hashmapin_selenium {

	public static void main(String[] args) {
		
		//Role based-- permission based use case
      //category manager user-->go to the app-->add all products
      //customer user-->go to the app-->buy product-->place an order
	 //admin user-->go to the app-->can see all the orders
	// seller user-->go to the app-->see only those orders which are relevant
     //distributor user-->go to the app-->can see the respective order
	//delivery boy user-->go to app-->can see order and deliver the product
	//customer care user-->go to the app-->
		
		
		  System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
	        
	        WebDriver driver=new ChromeDriver();
	        
	        driver.manage().window().maximize();
	        
	        driver.get("https://classic.crmpro.com/index.html");
	        
	  //      driver.findElement(By.name("username")).sendKeys("ravish");
	  //      driver.findElement(By.name("password")).sendKeys("test@123");
		
		System.out.println(getcredentialsMap());
		System.out.println(getcredentialsMap().get("delivery"));
		
		String credentials_customer= getcredentialsMap().get("delivery");
	        
		driver.findElement(By.name("username")).sendKeys("delivery");
        driver.findElement(By.name("password")).sendKeys("delivery");
			

	}
            
	 public static HashMap<String, String> getcredentialsMap() {
		 
		 HashMap<String ,String> userMap=new HashMap<String,String>();
		 
		 userMap.put("customer", "ravish:test@1230");
		 userMap.put("admin", "ravi:test@1236");
		 userMap.put("distributor", "rahul:test@1239");
		 userMap.put("seller", "rakesh:test@1238");
		 userMap.put("delivery", "swati:test@1234");
		  
		 
       
		  return userMap;
		 
	 }
	 
	 public static String getusername(String role) {
		 
		 String credentials=getcredentialsMap().get(role);
		return credentials.split(":")[0];
	 }
	 
 public static String getpassword(String role) {
		 
		 String credentials=getcredentialsMap().get(role);
		return credentials.split(":")[1];
	 }
	
	
}
