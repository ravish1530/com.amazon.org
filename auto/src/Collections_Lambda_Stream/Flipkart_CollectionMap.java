package Collections_Lambda_Stream;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Flipkart_CollectionMap {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 options.addArguments("--disable-notifications");

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(options);
		    
     driver.manage().window().maximize();
     
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
     
     driver.get("https://www.flipkart.com");
     driver.findElement(By.xpath("//span[@role=\"button\"]")).click();
    
     driver.findElement(By.xpath("//img[@alt=\"Close Feedback\"]")).click();
     
     driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("shoes for mens white");
     Thread.sleep(5000);
     driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

     List<WebElement>prodTitle=driver.findElements(By.xpath("//div[@class=\"_2WkVRV\"]"));
    List<WebElement>prodPrices= driver.findElements(By.xpath("//div[@class=\"_30jeq3\"]"));
    
 
    Map<String,String> prod_map=new HashMap<String,String>();
    
    for(int i=0;i<prodTitle.size();i++) {
    	
    	String title=prodTitle.get(i).getText();
    	//Double price=Double.parseDouble(prodPrices.get(i).getText());
    	String price=prodPrices.get(i).getText();
    	prod_map.put(title, price);
    }
    
    for(Map.Entry<String,String> entry:prod_map.entrySet()) {
    
    	System.out.println(entry.getKey()+"    "+entry.getValue());
    }
	}

}
