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

public class Collection_Map {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 options.addArguments("--disable-notifications");

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(options);
		    
      driver.manage().window().maximize();
      
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
      
      driver.get("https://demowebshop.tricentis.com/");
      
     List<WebElement>prodTitle= driver.findElements(By.xpath("//h2[@class=\"product-title\"]"));
     
     List<WebElement>prodPrices=driver.findElements(By.xpath("//div[@class=\"prices\"]"));
     
     Map<String,Double> prod_map=new HashMap<String,Double>();
     
     for(int i=0;i<prodTitle.size();i++) {
    	 
    	 String title=prodTitle.get(i).getText();
    	 Double price=Double.parseDouble(prodPrices.get(i).getText());
    	 prod_map.put(title, price);
    	 
     }
     //print map data using for...each loop
     
     for(Map.Entry<String, Double>entry:prod_map.entrySet()) {
    	 
    	 //System.out.println(entry.getKey()+"   "+entry.getValue());
    	 entry.getKey();
    	 entry.getValue();
     }
     
     //print map data using Lambda expression

     prod_map.forEach((t,v)->System.out.println(t+"  "+v));
     
     //print product who's price>800
     System.out.println("product details who's price>800:");
     prod_map.entrySet().stream().filter(e->e.getValue()>800).forEach(v->System.out.println(v));
     
     
     driver.quit();
	}

}
