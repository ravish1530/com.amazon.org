

package CWR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube {

	public static void main(String[] args) throws InterruptedException {

             System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
             
             WebDriver driver=new ChromeDriver();
             
             driver.manage().window().maximize();
             driver.get("https://www.youtube.com/");
             Thread.sleep(2000);
             
             WebElement search=driver.findElement(By.xpath("//input[@placeholder=\"Search\"]"));
             search.sendKeys("tutorial");
             Thread.sleep(2000);
             
             WebElement button=driver.findElement(By.xpath("//button[@class=\"style-scope ytd-searchbox\"]"));
               button.click();
               Thread.sleep(2000);
               
               driver.findElement(By.xpath("//a[@title=\"Kubernetes Tutorial for Beginners [FULL COURSE in 4 Hours]\"]")).click();
               Thread.sleep(50000);
              
              
             
	}

}
