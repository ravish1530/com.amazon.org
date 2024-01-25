package listbox;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class auto_suggestive {

	public static void main(String[] args) throws InterruptedException {

  System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
        
        WebDriver driver=new ChromeDriver();
        
        driver.manage().window().maximize();
        
        driver.get("https://www.google.com/");
       
        
        driver.findElement(By.xpath("//input[@title=\"Search\"]")).sendKeys("selenium");
        Thread.sleep(2000);
        
        List <WebElement> ele=driver.findElements(By.xpath("//ul[@class=\"erkvQe\"]//ul/li"));
        Thread.sleep(2000);
        
        String expreslt="selenium download";
        for(WebElement o:ele) {
             String actreslt=o.getText();
             if(expreslt.equalsIgnoreCase(actreslt)) {
            	 o.click();
            	 break;
             }
        }
        

	}

}
