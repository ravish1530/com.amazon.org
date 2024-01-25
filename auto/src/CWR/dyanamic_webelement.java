package CWR;

import java.time.Duration;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class dyanamic_webelement {

	public static void main(String[] args) {

		ChromeOptions options=new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 options.addArguments("--disable-notifications");

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(options);
		     
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        
        //dynamic waits
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.get("http://www.google.com");
        
        driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("java");
        List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class=\"wM6W7d\"]"));
        System.out.println("total number of suggestion in search box:"+list.size());
        
        for(int i=0;i<=list.size();i++) {
         System.out.println(list.get(i).getText());
         
         if(list.get(i).getText().contains("java compiler")) {
        	 list.get(i).click();
        	 break;//for loop will be broken
         }
        }
        

	}

}
