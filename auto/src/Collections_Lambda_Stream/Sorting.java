package Collections_Lambda_Stream;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Sorting {

	public static void main(String[] args) {


		ChromeOptions options=new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 options.addArguments("--disable-notifications");

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(options);
		    
      driver.manage().window().maximize();
      
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
      
      driver.get("https://demowebshop.tricentis.com/");
      
      driver.findElement(By.xpath("//ul[@class=\"top-menu\"]//a[@href=\"/books\"]")).click(); ///html/body/div[4]/div[1]/div[2]/ul[1]/li[1]/a
      
    Select drpdown=new Select(driver.findElement(By.id("products-orderby")));
    drpdown.selectByVisibleText("Name: A to Z");
    
    List<WebElement>product=driver.findElements(By.xpath("//h2[@class=\"product-title\"]"));
   List<String>beforesort= product.stream().map(item->item.getText()).collect(Collectors.toList());
	System.out.println("beforesort:"+beforesort);
   List<String>aftersort=product.stream().map(item->item.getText()).sorted().collect(Collectors.toList());
	System.out.println("aftersort:"+aftersort);
	if(beforesort.equals(aftersort)) {
		System.out.println("products are sorted");
	}else {
		System.out.println("products are not sorted");
	}
	
	driver.quit();
	}

}
