package interview_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {

	
	public static void main(String[] args) throws InterruptedException {

		 System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
       
	       WebDriver driver =new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       
	       driver.get("https://www.etmoney.com/mutual-funds/filter/long-term-funds-return");
	       
	       Thread.sleep(2000);
	      WebElement longterm= driver.findElement(By.xpath("//label[normalize-space()='Long-Term Historic Returns']"));
	       
          longterm.isSelected();
          
          driver.findElement(By.xpath("//label[normalize-space()='SIP']")).click();
          
          driver.findElement(By.xpath("//label[normalize-space()='HYBRID']")).click();
          
         WebElement all= driver.findElement(By.xpath("//div[@id='HYBRID']//li[2]//label[1]"));
         all.click();
         Thread.sleep(4000);
       
         if(all.isSelected()) {
       	  System.out.println("chechbox selected");
       	  Thread.sleep(5000);
       	WebElement agg=  driver.findElement(By.xpath("//label[normalize-space()='Aggressive Hybrid']"));
       	  agg.click();
       	  
       	  if(all.isSelected()) {
       		  System.out.println("unchecked");
       		  
       		   }
       	  driver.findElement(By.xpath("//input[@value='annual']")).click();
         }
	}
}
