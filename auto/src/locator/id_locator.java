package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class id_locator {

	public static void main(String[] args) throws InterruptedException {

              System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
              WebDriver driver=new ChromeDriver();
              
              driver.manage().window().maximize();
              driver.get("https://www.youtube.com/");
              
              WebElement ele=driver.findElement(By.id("search"));
              Thread.sleep(2000);
              ele.sendKeys("selenium");
              
         //     WebElement pass=driver.findElement(By.id("pass"));
         //     Thread.sleep(2000);
          //    pass.sendKeys("Ravi@1234");
            //  Thread.sleep(2000);
              
              WebElement login=driver.findElement(By.id("login_link"));
              Thread.sleep(2000);
              login.click();
              
              Thread.sleep(2000);
              driver.quit();
           
              

	}

}
