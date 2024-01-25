package multiple_windows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class child_window {

	public static void main(String[] args) throws InterruptedException {
   System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32 (3)\\chromedriver.exe");
        
        WebDriver driver=new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/browser-windows");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id=\"tabButton\"]")).click();
        Thread.sleep(2000);
        
       String parentId=driver.getWindowHandle();
       

       Set<String> childId=driver.getWindowHandles();
       System.out.println(childId.size());
       
       for(String s:childId) {
    	   System.out.println(s);
    	   if(!s.equals(parentId)) {
    		   driver.switchTo().window(s);
    		   driver.close();
    	   }
    	   
       }
       driver.switchTo().window(parentId);
       driver.close();
       
        

	}

}
